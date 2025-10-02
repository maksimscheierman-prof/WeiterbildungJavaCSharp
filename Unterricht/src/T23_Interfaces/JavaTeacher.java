package T23_Interfaces;

import java.time.LocalDateTime;
import java.util.List;

public class JavaTeacher implements TeachingBehaviour, LessonsPlanner {

    @Override
    public void teach() {
        System.out.println("Ich bringe mit Hilfe von Präsentationen und Aufgaben bei");
    }

    @Override
    public void prepare() {
        System.out.println("Ich bereite meine Folien für den nächsten Tag vor");
    }

    @Override
    public void createLesson(String lessonId, String title, String[] topics) {

    }

    @Override
    public void scheduleLesson(String lessonId, LocalDateTime when) {

    }

    @Override
    public List<String> listPlannedLessons() {
        return List.of();
    }
}
