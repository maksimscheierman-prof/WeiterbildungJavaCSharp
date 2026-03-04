package InterfacePoly_Aufgaben.Bewegbar;

public class Main {

        public static void main(String[] args) {
            Bewegbar auto = new Auto();
            Bewegbar fahrrad = new Fahrrad();
            Bewegbar hund = new Hund();
            Bewegbar vogel = new Vogel();

            Bewegbar[] bewegbarObjekte = {auto, fahrrad, hund, vogel};
            bewegeAlle(bewegbarObjekte);
        }
        public static void bewegeAlle(Bewegbar[] bewegbarObjekte) {
            for (Bewegbar obj : bewegbarObjekte) {
                obj.bewegen();  // Polymorphismus: unterschiedliche Implementierungen je nach Typ
            }
        }

}
