package A02_Ablaufsteuerung_Musterloesung.foreach;

public class Noten {

    public static void main(String[] args) {
        // 2-dimensionales Array für 5 Schüler mit jeweils 6 Noten
        int[][] noten = {
                {2, 3, 1, 2, 4, 1},
                {4, 4, 4, 2, 2, 1},
                {3, 2, 2, 1, 3, 4},
                {5, 1, 2, 3, 4, 2},
                {1, 1, 1, 2, 2, 3}
        };

        // a) Manuelle Ausgabe für Schüler 1 und 2 (ohne Schleife)
        System.out.print("Schüler 1: ");
        System.out.println(noten[0][0] + " " + noten[0][1] + " " + noten[0][2] + " " +
                noten[0][3] + " " + noten[0][4] + " " + noten[0][5]);

        System.out.print("Schüler 2: ");
        System.out.println(noten[1][0] + " " + noten[1][1] + " " + noten[1][2] + " " +
                noten[1][3] + " " + noten[1][4] + " " + noten[1][5]);

        System.out.println(); // Leerzeile zur Trennung

        // b) Ausgabe mit verschachtelter for-Schleife
        for (int i = 0; i < noten.length; i++) {
            System.out.print("Schüler " + (i + 1) + ": ");
            for (int j = 0; j < noten[i].length; j++) {
                System.out.print(noten[i][j] + " ");
            }
            System.out.println(); // Zeilenumbruch nach jeder Schülerzeile
        }
    }
}
