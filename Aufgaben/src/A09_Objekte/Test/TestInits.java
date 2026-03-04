package A09_Objekte.Test;

public class TestInits {
    private int i = TestInits.VeryBadInit();

    {
        System.out.println("In the beginning: " + i);
        i = 20;
        System.out.println("I'm an initializer here!");
    }

    {
        i = 30;
        System.out.println("I'm an initializer here too!");
    }

    public TestInits(int i) {
        this.i = i;
        System.out.printf("I am constructor! i is " + i);
    }

    public static int VeryBadInit() {
        System.out.println("Very bad init!");
        return 100;
    }
}