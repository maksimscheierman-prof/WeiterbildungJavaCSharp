package de.sfc.tamagotchi.tamagotchi;

import de.sfc.tamagotchi.tamagotchi.food.Food;
import de.sfc.tamagotchi.tamagotchi.pets.Pet;
import de.sfc.tamagotchi.tamagotchi.toys.Toy;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
 * Controller for the graphical user interface. Thanks to this class the GUI does something if a button is pressed.
 * Pattern: Model - View - Controller (MVC-Pattern).
 */
public class TamagotchiViewController {

    public DropShadow colorOfPet;
    @FXML private Button feedButton;
    @FXML private Button playButton;
    @FXML private Button changePetButton;
    @FXML private ComboBox<Food> feedComboBox;
    @FXML private Label moodLabel;
    @FXML private ComboBox<Pet> changePetComboBox;
    @FXML private ComboBox<Toy> playComboBox;
    @FXML private Button hugButton;
    @FXML private Button sleepButton;
    @FXML private Button wakeUpButton;
    @FXML private TextArea textArea;
    @FXML private Rectangle happinessRect;
    @FXML private Rectangle hungerRect;
    @FXML private Rectangle sleepinessRect;

    private Toy lastPlayedToy = null;
    private Pet lastChosenPet = null;
    private long lastFeedTime = 0;
    private long lastPlayTime = 0;
    private boolean isSleeping = false;
    private boolean isDead = false;
    private final double maxWidth = 350.0;

    @FXML
    public void initialize() {
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> updateStats()));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        textArea.setDisable(true);
        updateSleepWakeButtons();
    }

    /**
     * Feed button
     */
    @FXML
    void feed(MouseEvent event) {
        Food selectedFood = feedComboBox.getSelectionModel().getSelectedItem();
        if (selectedFood == null) {
            showAlert(Alert.AlertType.WARNING, "Kein Futter ausgewählt", "Bitte Futter auswählen!",
                    "Wähle ein Futter aus der Liste, bevor du dein Haustier fütterst.");
            return;
        }
        if (lastChosenPet == null) {
            showAlert(Alert.AlertType.INFORMATION, "Kein Tier aktiv", null,
                    "Bitte wähle zuerst ein Tier aus, das gefüttert werden soll.");
            return;
        }

        // Nebenwirkung: Steak hat eigenen Effekt, sonst Standard: calories addieren
        if (selectedFood instanceof de.sfc.tamagotchi.tamagotchi.food.Steak steak) {
            steak.applyEffect(lastChosenPet);
        } else {
            lastChosenPet.setHungriness(lastChosenPet.getHungriness() + selectedFood.getCalories());
        }

        // Kombinationslogik (einmalig, nicht doppelt)
        long now = System.currentTimeMillis();
        if (now - lastPlayTime < 5000) {
            lastChosenPet.setHappiness(lastChosenPet.getHappiness() + 10);
            showAlert(Alert.AlertType.INFORMATION, "Kombinationsbonus!", "Perfekter Zeitpunkt 🍗🎾",
                    lastChosenPet.getName() + " ist besonders glücklich!");
        }
        if (now - lastPlayTime < 2000) { // Hektik-Combo = Strafe
            lastChosenPet.setHappiness(lastChosenPet.getHappiness() - 15);
            moodLabel.setText("😣");
            colorOfPet.setColor(Color.DARKRED);
        }
        lastFeedTime = now;

        // Überfütterung prüfen & UI aktualisieren
        clampStatsToBounds();
        setStats();
        checkIfOverfed();
        updateMoodLabel();

        showAlert(Alert.AlertType.INFORMATION, "Füttern erfolgreich", "Lecker!",
                lastChosenPet.getName() + " hat " + selectedFood.getName() + " gegessen.");
    }

    /**
     * Play button
     */
    @FXML
    void play(MouseEvent event) {
        Toy selectedToy = playComboBox.getSelectionModel().getSelectedItem();
        if (selectedToy == null) {
            showAlert(Alert.AlertType.WARNING, "Kein Spielzeug ausgewählt", null,
                    "Bitte wähle ein Spielzeug aus, bevor du spielst.");
            return;
        }
        if (lastChosenPet == null) {
            showAlert(Alert.AlertType.INFORMATION, "Kein Tier aktiv", null,
                    "Bitte wähle zuerst ein Tier aus, mit dem du spielen möchtest.");
            return;
        }

        // Overplaying-Tracking (gleiches Spielzeug oft hintereinander)
        if (lastPlayedToy != null && lastPlayedToy.equals(selectedToy)) {
            selectedToy.incrementUsageCount();
            if (selectedToy.getUsageCount() >= 5) {
                lastChosenPet.setHappiness(lastChosenPet.getHappiness() - 10); // leichte Strafe
            }
        } else {
            selectedToy.resetUsageCount();
        }

        // Nebenwirkung: Puzzle hat eigenen Effekt, sonst Standard-Fun
        if (selectedToy instanceof de.sfc.tamagotchi.tamagotchi.toys.Puzzle puzzle) {
            puzzle.applyEffect(lastChosenPet);
        } else {
            lastChosenPet.setHappiness(lastChosenPet.getHappiness() + selectedToy.getFunPoints());
        }

        // Grundkosten des Spielens (leichte Müdigkeit/Hunger)
        lastChosenPet.setSleepiness(lastChosenPet.getSleepiness() - (int) (Math.random() * 16));
        lastChosenPet.setHungriness(lastChosenPet.getHungriness() - (int) (Math.random() * 16));

        // Kombinationslogik (einmalig, nicht doppelt)
        long now = System.currentTimeMillis();
        if (now - lastFeedTime < 5000) {
            lastChosenPet.setHappiness(lastChosenPet.getHappiness() + 10);
            showAlert(Alert.AlertType.INFORMATION, "Kombinationsbonus!", "Gute Kombi 🎾🍕",
                    lastChosenPet.getName() + " ist jetzt super glücklich!");
        }
        if (now - lastFeedTime < 2000) { // Hektik-Combo = Strafe
            lastChosenPet.setHappiness(lastChosenPet.getHappiness() - 15);
            moodLabel.setText("😣");
            colorOfPet.setColor(Color.DARKRED);
        }
        lastPlayTime = now;
        lastPlayedToy = selectedToy;

        // Overplaying prüfen & UI aktualisieren
        clampStatsToBounds();
        setStats();
        checkIfOverplayed();
        updateMoodLabel();

        showAlert(Alert.AlertType.INFORMATION, "Spielzeit!", "Du hast mit " + lastChosenPet.getName() + " gespielt!",
                "Spielzeug: " + selectedToy.getName() + " 🎾");
    }

    /**
     * Change Pet
     */
    public void changePet(MouseEvent mouseEvent) {
        Pet selectedPet = changePetComboBox.getSelectionModel().getSelectedItem();
        if (selectedPet == null) {
            showAlert(Alert.AlertType.WARNING, "Kein Tier ausgewählt", null, "Bitte wähle ein Tier aus der Liste.");
            return;
        } else if (!selectedPet.isDead()) {
            enableButton();
        }

        lastChosenPet = selectedPet;
        clampStatsToBounds();
        setStats();

        showAlert(Alert.AlertType.INFORMATION, "Tier gewechselt", "Du hast dein neues Haustier ausgewählt!",
                "Jetzt kümmerst du dich um " + selectedPet.getName() + ".");
    }

    /**
     * Sleep
     */
    @FXML
    void sleep(MouseEvent event) {
        if (!isSleeping) {
            isSleeping = true;
            moodLabel.setText("💤");
            updateSleepWakeButtons();
            showAlert(Alert.AlertType.INFORMATION, "Schlafenszeit", null,
                    lastChosenPet.getName() + " schläft jetzt. 😴");
            return;
        }

        if (lastChosenPet.getSleepiness() >= maxWidth * 0.995) {
            isSleeping = false;
            moodLabel.setText("😊");
            updateSleepWakeButtons();
        }
    }

    /**
     * Hug
     */
    @FXML
    void hug(MouseEvent event) {
        if (lastChosenPet == null) {
            showAlert(Alert.AlertType.INFORMATION, "Kein Tier aktiv", null,
                    "Bitte wähle zuerst ein Tier aus, das du umarmen möchtest.");
            return;
        }

        String reactionMessage = lastChosenPet.hug();
        clampStatsToBounds();
        setStats();

        showAlert(Alert.AlertType.INFORMATION, "Umarmung!", "Reaktion deines Haustiers", reactionMessage);
    }

    /**
     * Wake up
     */
    @FXML
    public void wakeUp(MouseEvent mouseEvent) {
        if (lastChosenPet == null) return;

        if (isSleeping) {
            isSleeping = false;
            lastChosenPet.setSleepiness(lastChosenPet.getSleepiness() - 30);
            clampStatsToBounds();
            updateSleepWakeButtons();

            showAlert(Alert.AlertType.WARNING, "Aufgeweckt!", "Oh oh 😠",
                    lastChosenPet.getName() + " wurde unsanft geweckt und ist jetzt mürrisch.");
        }
        setStats();
    }

    /**
     * Tick
     */
    private void updateStats() {
        if (lastChosenPet == null) return;

        if (isSleeping) {
            if (lastChosenPet.getSleepiness() < maxWidth)
                lastChosenPet.setSleepiness(lastChosenPet.getSleepiness() + 2);
            if (lastChosenPet.getHungriness() > 0)
                lastChosenPet.setHungriness((lastChosenPet.getHungriness() - 1));
            if (lastChosenPet.getHappiness() > 0)
                lastChosenPet.setHappiness((lastChosenPet.getHappiness() - 1));
            if (lastChosenPet.getSleepiness() >= maxWidth - 1) {
                isSleeping = false;
                updateSleepWakeButtons();
                updateMoodLabel();
            }
        } else {
            if (lastChosenPet.getSleepiness() > 0)
                lastChosenPet.setSleepiness((lastChosenPet.getSleepiness() - 1));
        }

        if (!isSleeping) {
            if (lastChosenPet.getHungriness() > 0)
                lastChosenPet.setHungriness(lastChosenPet.getHungriness() - 1);
            if (lastChosenPet.getHappiness() > 0)
                lastChosenPet.setHappiness(lastChosenPet.getHappiness() - 1);
        }

        clampStatsToBounds();
        updateMoodLabel();
        setStats();
    }

    /**
     * Sync rectangles with pet state
     */
    private void setStats() {
        if (lastChosenPet == null) return;

        hungerRect.setWidth(lastChosenPet.getHungriness());
        sleepinessRect.setWidth(lastChosenPet.getSleepiness());
        happinessRect.setWidth(lastChosenPet.getHappiness());
        lastChosenPet.setSleeping(isSleeping);
        lastChosenPet.setDead(isDead);
    }

    private void updateSleepWakeButtons() {
        sleepButton.setDisable(isSleeping);
        wakeUpButton.setDisable(!isSleeping);
    }

    /**
     * Mood label + color
     */
    private void updateMoodLabel() {
        if (isSleeping) {
            moodLabel.setText("💤");
            updateColorOfPet("sleeping");
            return;
        }

        double half = maxWidth / 2.0;
        double happiness = happinessRect.getWidth();
        double sleepiness = sleepinessRect.getWidth();
        double hunger = hungerRect.getWidth();

        if (happiness < 2 || sleepiness < 2 || hunger < 2) {
            moodLabel.setText("💀");
            colorOfPet.setColor(Color.GREY);
            isDead = true;
            disableButton();
            updateColorOfPet("dead");
            return;
        }

        if (hunger > maxWidth * 0.95) {
            moodLabel.setText("😩");
            updateColorOfPet("overfed");
            return;
        }

        if (checkIfOverplayed()) {
            moodLabel.setText("😒");
            updateColorOfPet("bored");
            return;
        }

        if (sleepiness > half && happiness < half) {
            moodLabel.setText("😴");
            updateColorOfPet("tired");
            return;
        }

        if (happiness < half && hunger < half) {
            moodLabel.setText("😢");
            updateColorOfPet("sad");
            return;
        }

        if (happiness > half && sleepiness > half && hunger > half) {
            moodLabel.setText("😊");
            updateColorOfPet("happy");
            return;
        }

        moodLabel.setText("😐");
        updateColorOfPet("neutral");
    }

    /**
     * Color/anim depending on mood
     */
    private void updateColorOfPet(String mood) {
        switch (mood) {
            case "happy" -> {
                colorOfPet.setColor(Color.LIGHTGREEN);
                happinessRect.setOpacity(1.0);
                javafx.animation.FadeTransition ft =
                        new javafx.animation.FadeTransition(Duration.millis(400), happinessRect);
                ft.setFromValue(1.0);
                ft.setToValue(0.6);
                ft.setCycleCount(4);
                ft.setAutoReverse(true);
                ft.play();
            }
            case "tired" -> colorOfPet.setColor(Color.ORANGE);
            case "sad" -> colorOfPet.setColor(Color.DARKBLUE);
            case "bored" -> colorOfPet.setColor(Color.BEIGE);
            case "overfed" -> colorOfPet.setColor(Color.RED);
            case "sleeping" -> colorOfPet.setColor(Color.LIGHTBLUE);
            case "dead" -> colorOfPet.setColor(Color.GREY);
            default -> colorOfPet.setColor(Color.WHITE);
        }
    }

    /**
     * Clamp stats to [0, maxWidth]
     */
    private void clampStatsToBounds() {
        if (lastChosenPet == null) return;
        lastChosenPet.setHungriness(Math.max(0, Math.min(lastChosenPet.getHungriness(), maxWidth)));
        lastChosenPet.setSleepiness(Math.max(0, Math.min(lastChosenPet.getSleepiness(), maxWidth)));
        lastChosenPet.setHappiness(Math.max(0, Math.min(lastChosenPet.getHappiness(), maxWidth)));
    }

    /**
     * Overfed check (with alert)
     */
    private boolean checkIfOverfed() {
        if (lastChosenPet == null) return false;

        if (lastChosenPet.getHungriness() >= maxWidth) {
            lastChosenPet.setHungriness(maxWidth);
            lastChosenPet.setHappiness(lastChosenPet.getHappiness() - 15);

            showAlert(Alert.AlertType.WARNING, "Überfüttert!", "😩 " + lastChosenPet.getName() + " ist pappsatt!",
                    "Dein Haustier fühlt sich unwohl, weil es zu viel gegessen hat.");
            return true;
        }
        return false;
    }

    /**
     * Overplayed check (same toy too often)
     */
    private boolean checkIfOverplayed() {
        if (lastPlayedToy == null) return false;

        if (lastPlayedToy.getUsageCount() >= 5) {
            lastChosenPet.setHappiness(lastChosenPet.getHappiness() - 20);
            return true;
        }
        return false;
    }

    private void disableButton() {
        sleepButton.setDisable(true);
        wakeUpButton.setDisable(true);
        hugButton.setDisable(true);
        playButton.setDisable(true);
        feedButton.setDisable(true);
    }

    private void enableButton() {
        sleepButton.setDisable(false);
        wakeUpButton.setDisable(false);
        hugButton.setDisable(false);
        playButton.setDisable(false);
        feedButton.setDisable(false);
    }

    private void showAlert(Alert.AlertType type, String title, String header, String content) {
        Alert a = new Alert(type);
        a.setTitle(title);
        if (header != null && !header.isBlank()) a.setHeaderText(header);
        a.setContentText(content);
        a.showAndWait();
    }

    public ComboBox<Food> getFeedComboBox() { return feedComboBox; }
    public ComboBox<Pet> getChangePetComboBox() { return changePetComboBox; }
    public ComboBox<Toy> getPlayComboBox() { return playComboBox; }
}
