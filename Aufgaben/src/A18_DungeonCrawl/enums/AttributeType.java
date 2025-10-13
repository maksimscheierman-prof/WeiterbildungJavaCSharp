package A18_DungeonCrawl.enums;

public enum AttributeType {
    STRENGTH("Strength", "Increases physical damage"),
    INTELLIGENCE("Intelligence", "Increases magic damage"),
    DEXTERITY("Dexterity", "Increases accuracy and speed");

    private final String displayName;
    private final String description;

    AttributeType(String displayName, String description) {
        this.displayName = displayName;
        this.description = description;
    }

    public String getDisplayName() { return displayName; }
    public String getDescription() { return description; }
}


