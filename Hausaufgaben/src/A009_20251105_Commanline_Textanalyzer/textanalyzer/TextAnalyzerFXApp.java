package A009_20251105_Commanline_Textanalyzer.textanalyzer;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class TextAnalyzerFXApp extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Text Analyzer – JavaFX");

        // Eingabefeld
        TextArea inputArea = new TextArea();
        inputArea.setPromptText("Hier Text eingeben oder einfügen...");
        inputArea.setWrapText(true);

        // Ausgabe
        TextArea outputArea = new TextArea();
        outputArea.setEditable(false);
        outputArea.setWrapText(true);

        // Button
        Button analyzeBtn = new Button("Text analysieren");

        analyzeBtn.setOnAction(e -> {
            String text = inputArea.getText();

            TextAnalyzer analyzer = new TextAnalyzer();
            analyzer.setText(text);

            outputArea.setText(analyzer.prettyStats());
        });

        VBox layout = new VBox(10,
                new Label("Text eingeben:"),
                inputArea,
                analyzeBtn,
                new Label("Analyse:"),
                outputArea
        );
        layout.setPadding(new Insets(10));

        stage.setScene(new Scene(layout, 700, 600));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

