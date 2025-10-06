module de.sfc.tamagotchi.tamagotchi {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.sfc.tamagotchi.tamagotchi to javafx.fxml;
    exports de.sfc.tamagotchi.tamagotchi;
}