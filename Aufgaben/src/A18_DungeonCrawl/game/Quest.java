package A18_DungeonCrawl.game;

public class Quest {
    private String requirement;
    private Boolean questCleared = false;

    public Quest(String requirement) {
        this.requirement = requirement;
    }

    public String getRequirement() {
        return requirement;
    }

    public Boolean getQuestCleared() {
        return questCleared;
    }

    //TODO clearQuest Logik ausbauen
    public void clearQuest(Boolean questCleared) {
        this.questCleared = true;
    }


}
