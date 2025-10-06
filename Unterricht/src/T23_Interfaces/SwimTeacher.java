package T23_Interfaces;

public class SwimTeacher implements  TeachingBehaviour{
    @Override
    public void teach() {
        System.out.println("Ich gehe ins Schwimmbad und zeige im Becken Schwimmtechniken");
    }

    @Override
    public void prepare() {
        System.out.println("Ich trainiere selbst hart");
    }
}
