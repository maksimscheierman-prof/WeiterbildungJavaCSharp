package Uebungsaufgaben;


class A {
    public A() {
        System.out.print("A ");
        print();
    }

    void print() {
        System.out.print("A-print ");
    }
}

class B extends A {
    String bbb = "bbb";
    public B(int x) {
        super();
        System.out.print("B ");
        print();
    }

    void print() {
        System.out.print("B-print ");

    }
}

class C extends B {
    public C() {
        super(5);
        System.out.print("C ");
        print();
    }

    void print() {
        System.out.print("C-print " + bbb + " ");
    }


    public static void main(String[] args) {
        C name = new C();
    }
}

