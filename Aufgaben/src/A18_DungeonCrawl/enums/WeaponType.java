package A18_DungeonCrawl.enums;

public enum WeaponType {
    BOW("Bow"),
    MELEE("Melee"),
    STAFF("Staff");

    private final String displayName;

    WeaponType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() { return displayName; }

}
