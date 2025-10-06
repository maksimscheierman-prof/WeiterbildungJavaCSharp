package de.sfc.tamagotchi.tamagotchi;

import de.sfc.tamagotchi.tamagotchi.utils.UIHelper;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * The TamagotchiView class represents the graphical user interface for interacting with the Tamagotchi pet.
 * It allows the user to feed the pet, make it sleep, wake it up, and change the pet type.
 */
public class TamagotchiView extends Application {


    /**
     * Starts the graphical user interface.
     * @param stage - window
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        // Load the FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TamagotchiView.fxml"));
        Parent root = loader.load();
        TamagotchiViewController controller = loader.getController();

        // Create a scene with the loaded FXML
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        //UiHelper helps to use the graphical user interface easily
        //TODO: Nutze den uiHelper, um die DropDown Menüs zu füllen
        UIHelper uiHelper = new UIHelper(controller);
    }

    public static void main(String[] args) {
        launch(args); // Launches the JavaFX application
    }
}
