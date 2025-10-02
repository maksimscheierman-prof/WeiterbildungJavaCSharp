package T23_Interfaces;

public class JavaTeacher implements TeachingBehaviour {

    @Override
    public void teach() {
        System.out.println("Ich bringe mit Hilfe von Präsentationen und Aufgaben bei");
    }

    @Override
    public void prepare() {
        System.out.println("Ich bereite meine Folien für den nächsten Tag vor");
    }
}
