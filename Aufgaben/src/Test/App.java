package Test;


    class Course {
        String name;
        static int count = 0;

        Course(String name) {
            this.name = name;
            count++;
        }
    }

    public class App {
        public static void main(String[] args) {
            Course c = new Course("Java Programming");
            System.out.println (c.name + ":" + Course.count);
        }
    }
