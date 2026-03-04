package A009_20251105_Commanline_Textanalyzer.textanalyzer;

import java.io.IOException;

public abstract class Handler {
    public abstract String getText() throws NoTextProvidedException, IOException;
}

