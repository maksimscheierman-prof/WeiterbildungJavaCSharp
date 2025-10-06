module de.sfc.tamagotchi.tamagotchi {
    // --- Benötigte JavaFX-Module ---
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    // --- Öffnet Pakete für FXML-Zugriff ---
    // damit FXMLLoader (Reflection) auf Controller und Model-Klassen zugreifen darf
    opens de.sfc.tamagotchi.tamagotchi to javafx.fxml;
    opens de.sfc.tamagotchi.tamagotchi.utils to javafx.fxml;
    opens de.sfc.tamagotchi.tamagotchi.pets to javafx.fxml;
    opens de.sfc.tamagotchi.tamagotchi.food to javafx.fxml;
    opens de.sfc.tamagotchi.tamagotchi.toys to javafx.fxml;

    // --- Exportiert Pakete, damit sie von anderen Modulen genutzt werden können ---
    exports de.sfc.tamagotchi.tamagotchi;
    exports de.sfc.tamagotchi.tamagotchi.utils;
    exports de.sfc.tamagotchi.tamagotchi.pets;
    exports de.sfc.tamagotchi.tamagotchi.food;
    exports de.sfc.tamagotchi.tamagotchi.toys;
}
