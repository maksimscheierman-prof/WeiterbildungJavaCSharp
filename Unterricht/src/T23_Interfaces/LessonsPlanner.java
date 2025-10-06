package T23_Interfaces;

import java.time.LocalDateTime;
import java.util.List;

public interface LessonsPlanner{
    void createLesson(String lessonId, String title, String[] topics);
    void scheduleLesson(String lessonId, LocalDateTime when);
    List<String> listPlannedLessons();
}
