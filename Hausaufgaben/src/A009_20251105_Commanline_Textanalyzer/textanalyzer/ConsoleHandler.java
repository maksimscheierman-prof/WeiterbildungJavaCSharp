package A009_20251105_Commanline_Textanalyzer.textanalyzer;

import java.util.Scanner;

public class ConsoleHandler extends Handler {

    private final Scanner scanner;

    public ConsoleHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getText() throws NoTextProvidedException {
        System.out.println("Bitte Text eingeben (Ende mit leerer Zeile):");
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = scanner.nextLine();
            if (line == null || line.isBlank()) break;
            sb.append(line).append(System.lineSeparator());
        }
        String text = sb.toString().trim();
        if (text.isBlank()) throw new NoTextProvidedException("Kein Text eingegeben!");
        return text;
    }
}

