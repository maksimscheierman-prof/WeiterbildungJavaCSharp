package A18_DungeonCrawl.world;

import A18_DungeonCrawl.game.Quest;

import java.util.ArrayList;
import java.util.List;

public class ChapterFactory {


    private List<Room> roomsChOne = new ArrayList<>();

    public static List<Chapter> createChapters(){
        List<Chapter> chapters = new ArrayList<>();

        //Kapitel 1
        String chapterOne = "In der Welt tauchen plötzlich Dungeons auf — mysteriöse, lebendige Labyrinthe, die ahnungslose Menschen verschlingen und sie den Kreaturen in ihrem Inneren zum Opfer fallen lassen. Die Zivilisation kämpft verzweifelt gegen diese Bedrohung, doch nicht alle können gerettet werden. Nur jene, die besondere Fähigkeiten besitzen, haben eine Chance.\n"
                +"Am Anfang deiner Reise hast du eine Wahl, die dein Schicksal bestimmen wird: Magier oder Kämpfer. Jede Entscheidung formt deine Stärken, deine Perspektive und die Art, wie du die Gefahren im Dungeon meistern wirst.\n"
                + "Jetzt stehst du vor den gewaltigen Toren eines dieser Dungeons. Nebel hängt zwischen den knorrigen Bäumen, der Himmel ist von dunklen Wolken verhangen, und ein kalter, beißender Wind zieht durch die Landschaft. Aus dem Inneren des Labyrinths strömt eine merkwürdige Energie — unheimlich, fast lebendig. Sie zieht dich an und schreckt dich zugleich ab.\n"
                +"Dies ist der Moment, in dem dein Abenteuer beginnt. Bist du bereit, das unbekannte Dunkel zu betreten und dein Schicksal zu wählen?";

        String decisionOne = "Zu Beginn deines Abenteuers schaust du zu den zwei Türen:\n" +
                "-\n" +
                "Eine massive Eisentür, die von einem düsteren Symbol verziert ist\n" +
                "-\n" +
                "Eine hölzerne Tür, die alt und verwittert aussieht\n" +
                "Du musst dich entscheiden:\n" +
                "1.Gehe durch die Eisentür\n" +
                "2.Gehe durch die hölzerne Tür";

        List<Room> roomsChOne = new ArrayList<>();

        roomsChOne.add(new Room());
        roomsChOne.add(new Room());

        Chapter One = new Chapter(1, chapterOne, decisionOne, roomsChOne);
        chapters.add(One);

        //Kapitel 2
        String chapterTwo = "Der Raum, in dem du dich befindest, ist von undurchdringlicher Dunkelheit umhüllt. Schatten tanzen an den Wänden, und nur schemenhafte Umrisse lassen erkennen, dass viele Gegenstände verstreut liegen: Lampen, scharfe Schwerter, heilende Tränke und mystische Skills, die nur darauf warten, entdeckt zu werden.\n" +
                "Doch Vorsicht: Du bist nicht allein. Gefährliche Feinde schleichen durch den Raum, bereit, dich herauszufordern. Was genau vor dir liegt, bleibt verborgen — jeder Schritt birgt Risiko und Überraschung.\n" +
                "Deine Aufgabe ist klar, aber gefährlich: Finde den Ausgang. Doch dieser ist nicht einfach nur eine Tür am Ende des Labyrinths. Der Weg ist nur dann frei, wenn du den Feuerdrachen besiegt hast, der den Teil des Dungeons beherrscht.";

        String decisionTwo = "";

        List<Room> roomsChTwo = new ArrayList<>();
        Quest questDragon = new Quest("Besiege den Feuerdrachen!");

        Room dragonRoom = new Room();
        dragonRoom.setQuest(questDragon);

        roomsChTwo.add(dragonRoom);

        Chapter Two = new Chapter(2, chapterTwo, roomsChTwo);
        chapters.add(Two);

        //Kapitel 3
        String chapterThree = "Nachdem du den Feuerdrachen besiegt und den geheimen Raum erreicht hast, führt dich ein schmaler, dunkler Korridor in eine eigenartige Kammer. Die Wände sind mit alten Runen bedeckt, die schwach glimmen, und in der Mitte des Raumes schwebt ein schimmernder Kristall, der die Luft vibrieren lässt.\n" +
                "Plötzlich öffnen sich mehrere Türen gleichzeitig, jede führt in einen kleinen Nebenraum. Ein rätselhaftes Flüstern erklingt:\n" +
                "Nur wer Mut, Geschick und Klugheit beweist, darf weiterziehen. Wähle weise, denn jede falsche Entscheidung kostet Kraft und Zeit.";

        String decisionThree ="Du hast die Wahl, durch eine der drei Türen zu gehen:\n"+
                "1.Tür der Schatten - Ein Raum voller Illusionen und Feinde, die deine Sinne täuschen. Du musst dich durch geschickte Bewegungen durchkämpfen. Du musst alle Feinde in diesem Raum besiegen.\n" +
                "2.Tür der Rätsel -Ein Raum, der mit magischen Rätseln und Fallen gefüllt ist. Zahlenfolgen, magische Symbole und Logikaufgaben erwarten dich. Die Aufgabe erinnert dich an den Anfang des Dungeons.\n" +
                "3.Die Tür der Prüfungen des Herzens - Ein Raum, der deine Entscheidungen und deine Moral testet. Ein Schattenwesen stellt dir Fragen, die nicht nur Wissen, sondern auch Mut und Intuition verlangen.\n";

        List<Room> roomsChThree = new ArrayList<>();
        roomsChThree.add(new Room());
        roomsChThree.add(new Room());
        roomsChThree.add(new Room());

        Chapter Three = new Chapter(3, chapterTwo, decisionThree, roomsChThree);
        chapters.add(Three);

        //Kapitel 4
        String chapterFour = "Nachdem du den Feuerdrachen besiegt hast, erreichst du schließlich den Raum, in dem sich ein glänzendes Artefakt befindet. Es ist von einem kristallklaren Licht umhüllt, und als du dich näherst, hörst du die Stimme eines dunklen Wächters.\n" +
        "Nur wer den Preis der Macht kennt, darf das Artefakt besitzen\", sagt er. \"Bist du bereit, den Preis zu zahlen?\n" +
        "Du siehst dich um. Der Raum ist ruhig, aber die Luft ist dick mit Spannung.\n";

        String decisionFour = "1. Nimm das Artefakt.\n"+
                "2.Lass das Artefakt zurück";

        List<Room> roomsChFour = new ArrayList<>();
        roomsChFour.add(new Room());
        Chapter Four = new Chapter(4, chapterFour, decisionFour, roomsChFour);
        chapters.add(Four);

        return chapters;
    }


}