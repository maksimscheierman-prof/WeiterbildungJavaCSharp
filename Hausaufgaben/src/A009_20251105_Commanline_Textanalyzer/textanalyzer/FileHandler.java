package A009_20251105_Commanline_Textanalyzer.textanalyzer;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandler extends Handler {

    private final Path path;

    public FileHandler(Path path) {
        this.path = path;
    }

    @Override
    public String getText() throws NoTextProvidedException, IOException {
        if (path == null) throw new NoTextProvidedException("Kein Dateipfad angegeben.");
        if (!Files.exists(path)) throw new IOException("Datei nicht gefunden: " + path);
        String text = Files.readString(path, StandardCharsets.UTF_8).trim();
        if (text.isBlank()) throw new NoTextProvidedException("Datei ist leer.");
        return text;
    }
}

