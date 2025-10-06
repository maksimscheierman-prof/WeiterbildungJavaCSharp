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
 *
 * The models are there for holding data and describing the state of the application.
 * For example {@link Toy), {@link Pet} or {@link Food} are model classes.
 * When creating an object of these classes they have a specific state.
 * The state of these models is changed (especially the pet), if clicked on the buttons.
 * E.g. if a pet is fed, its hungriness decreases. Therefore the state of the application has been changed.
 *
 * The view itself represents the graphical user interface without logic.
 * The controller "controls" the view by implementing the button's function.
 */
public class TamagotchiViewController {

    public DropShadow colorOfPet;
    @FXML
    private Button feedButton;
    @FXML
    private Button playButton;
    @FXML
    private Button changePetButton;
    @FXML
    private ComboBox<Food> feedComboBox;
    @FXML
    private Label moodLabel;
    @FXML
    private ComboBox<Pet> changePetComboBox;
    @FXML
    private ComboBox<Toy> playComboBox;
    @FXML
    private Button hugButton;
    @FXML
    private Button sleepButton;
    @FXML
    private Button wakeUpButton;
    @FXML
    private TextArea textArea;
    @FXML
    private Rectangle happinessRect;
    @FXML
    private Rectangle hungerRect;
    @FXML
    private Rectangle sleepinessRect;

    private Toy lastPlayedToy = null;
    private Pet lastChosenPet = null;
    private boolean isSleeping = false;
    private boolean isDead = false;
    private final double maxWidth = 350.0;


    /**
     * Initialization of the controller
     * <p>
     *     Starts with a timeline, which actualises every second for undefined time.
     * </p>
     */
    @FXML
    public void initialize() {
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> updateStats()));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        textArea.setDisable(true); // TextArea nur zur Anzeige
        updateSleepWakeButtons();           // Buttons initial korrekt setzen
    }

    /**
     * Method, which is called  if "Feed"-Button was clicked
     * //TODO: UI mit Dialogfenster ergänzen. Nutze dafür die Alert-Klasse.
     * TODO: Erstelle ein neues Objekt der Alert-Klasse. Übergebe dem Konstruktor einen Alert.AlertType.
     * TODO: Setze außerdem Titel und ContentText. Nachdem alles eingericht ist, rufe die Methode showAndWait() auf.
     * @param event MouseEvent
     */
    @FXML
    void feed(MouseEvent event) {
        Food selectedFood = feedComboBox.getSelectionModel().getSelectedItem();
        if (selectedFood == null) {
            throw new RuntimeException("Wähle zuerst ein Futter aus");
        }
        if(lastChosenPet == null){
            return;
        }
        lastChosenPet.setHungriness(lastChosenPet.getHungriness() + selectedFood.getCalories());
        setStats();
    }


    /**
     * Method, which implements the "Play"-Button.
     * <p>
     * //TODO: UI mit Dialogfenster ergänzen. Nutze dafür die Alert-Klasse.
     * TODO: Erstelle ein neues Objekt der Alert-Klasse. Übergebe dem Konstruktor einen Alert.AlertType.
     * TODO: Setze außerdem Titel und ContentText. Nachdem alles eingericht ist, rufe die Methode showAndWait() auf.
     * //TODO OPTIONAL: Wenn 5x mit dem gleichen Spielzeug gespielt wurde, sinkt die Happiness.
     * </p>
     *
     * @param event MouseEvent
     */
    @FXML
    void play(MouseEvent event) {
        Toy selectedToy = playComboBox.getSelectionModel().getSelectedItem();
        if (selectedToy == null) {
            throw new RuntimeException("Wähle zuerst ein Spiel aus");
        }

        if(lastChosenPet == null){
            return;
        }

        lastChosenPet.setHappiness(lastChosenPet.getHappiness() + selectedToy.getFunPoints());
        lastChosenPet.setSleepiness(lastChosenPet.getSleepiness() - (int)(Math.random() * 16));
        lastChosenPet.setHungriness(lastChosenPet.getHungriness() - (int)(Math.random() * 16));

        setStats();
    }

    /**
     * Method, which implements the "Change Pet"-Button
     * //TODO: UI mit Dialogfenster ergänzen. Nutze dafür die Alert-Klasse.
     *  TODO: Erstelle ein neues Objekt der Alert-Klasse. Übergebe dem Konstruktor einen Alert.AlertType.
     *  TODO: Setze außerdem Titel und ContentText. Nachdem alles eingericht ist, rufe die Methode showAndWait() auf.
     *
     * @param mouseEvent MouseEvent
     */
    public void changePet(MouseEvent mouseEvent) {
        Pet selectedPet = changePetComboBox.getSelectionModel().getSelectedItem();
        if (selectedPet == null) {
            throw new RuntimeException("Wähle zuerst ein Tier aus");
        }else if(!selectedPet.isDead()){
            enableButton();
        }
        lastChosenPet = selectedPet;
        setStats();
    }

    /**
     * Method, which implements the "Sleep"-Button
     * @param event MouseEvent
     */
    @FXML
    void sleep(MouseEvent event) {
        if (!isSleeping) {
            isSleeping = true;
            moodLabel.setText("💤");
            updateSleepWakeButtons();
            return;
        }

        if (lastChosenPet.getSleepiness() >= maxWidth * 0.995) {
            isSleeping = false;
            moodLabel.setText("😊");
            updateSleepWakeButtons();
        }
    }

    /**
     * Method, which implements the "Hug"-Button.
     *
     * @param event MouseEvent
     */
    @FXML
    void hug(MouseEvent event) {
        if(lastChosenPet == null){
            return;
        }
        //TODO: Sorge dafür, dass das lastChosenPet umarmt wird!
        setStats();
    }

    /**
     * Method, which implements the "Wake Up"-Button.
     * If a pet is forcibly woken up, it is moody.
     *
     * @param mouseEvent MouseEvent
     */
    @FXML
    public void wakeUp(MouseEvent mouseEvent) {
        if(lastChosenPet == null){
            return;
        }
        if (isSleeping) {
            isSleeping = false;
            lastChosenPet.setSleepiness(lastChosenPet.getSleepiness()-30);
            updateSleepWakeButtons();
        }
        setStats();
    }


    /**
     * Updates the state of a pet every second.
     * <p>
     *     Sleepiness, Hunger and Happiness decreases every second if nothing done.
     *     If the Pet has slept enough, it wakes up on its own.
     * </p>
     */
    private void updateStats() {
        if(lastChosenPet == null){
            return;
        }
        if (isSleeping) {
            // Sleepiness steigt langsam während Schlaf
            if (lastChosenPet.getSleepiness() < maxWidth)
                lastChosenPet.setSleepiness(lastChosenPet.getSleepiness() + 2);

            // Hunger sinkt leicht während Schlaf
            if (lastChosenPet.getHungriness() > 0)
                lastChosenPet.setHungriness((lastChosenPet.getHungriness() - 1));

            // Happiness sinkt leicht
            if (lastChosenPet.getHappiness() > 0)
                lastChosenPet.setHappiness((lastChosenPet.getHappiness() - 1));

            // Auto-Wachprüfung: Sleepiness voll → wach
            if (lastChosenPet.getSleepiness() >= maxWidth - 1) {
                isSleeping = false;
                updateSleepWakeButtons();
                updateMoodLabel(); // Mood wird normal berechnet
            }
        } else {
            // Wach: Sleepiness sinkt langsam
            if (lastChosenPet.getSleepiness() > 0)
                lastChosenPet.setSleepiness((lastChosenPet.getSleepiness() - 1));
        }

        // Statusbalken sinken nur, wenn wach
        if (!isSleeping) {
            if (lastChosenPet.getHungriness() > 0)
                lastChosenPet.setHungriness(lastChosenPet.getHungriness() - 1);
            if (lastChosenPet.getHappiness() > 0)
                lastChosenPet.setHappiness(lastChosenPet.getHappiness() - 1);
        }
        updateMoodLabel();
        setStats();
    }

    /**
     * This method sets the bars depending on the state of the pet.
     * The method should be called everytime, after the state of the pet has changed.
     */
    private void setStats(){
        if(lastChosenPet == null){
            return;
        }
        hungerRect.setWidth(lastChosenPet.getHungriness());
        sleepinessRect.setWidth(lastChosenPet.getSleepiness());
        happinessRect.setWidth(lastChosenPet.getHappiness());
        lastChosenPet.setSleeping(isSleeping);
        lastChosenPet.setDead(isDead);
    }

    /**
     * The sleep and wake buttons are updated as soon as the state of the object changes.
     */
    private void updateSleepWakeButtons() {
        sleepButton.setDisable(isSleeping);
        wakeUpButton.setDisable(!isSleeping);
    }

    /**
     * updates the mood of the pet.
     */
    private void updateMoodLabel() {
        if (isSleeping) {
            moodLabel.setText("💤");
            return;
        }

        double half = maxWidth / 2.0;

        double happiness = happinessRect.getWidth();
        double sleepiness = sleepinessRect.getWidth();
        double hunger = hungerRect.getWidth();

        // Tot, wenn einer der Balken leer
        if (happiness < 2 || sleepiness < 2 || hunger < 2) {
            moodLabel.setText("\uD83D\uDC80"); // 💀
            colorOfPet.setColor(Color.GREY);
            isDead = true;
            disableButton();
        }
        // Müde
        else if (sleepiness > half && happiness < half) {
            moodLabel.setText("😴");
        }
        // Glücklich
        else if (happiness > half && sleepiness > half && hunger > half) {
            moodLabel.setText("😊");
        }
        // Neutral
        else {
            moodLabel.setText("😐");
        }
    }

    /**
     * Disables all buttons if pet is dead
     */
    private void disableButton(){
        sleepButton.setDisable(true);
        wakeUpButton.setDisable(true);
        hugButton.setDisable(true);
        playButton.setDisable(true);
        feedButton.setDisable(true);
    }

    /**
     * Enables all buttons if dead pet is changed to an alive one.
     */
    private void enableButton(){
        sleepButton.setDisable(false);
        wakeUpButton.setDisable(false);
        hugButton.setDisable(false);
        playButton.setDisable(false);
        feedButton.setDisable(false);
    }

    public ComboBox<Food> getFeedComboBox() { return feedComboBox; }
    public ComboBox<Pet> getChangePetComboBox() { return changePetComboBox; }
    public ComboBox<Toy> getPlayComboBox() { return playComboBox; }
}
