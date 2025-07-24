package T09_SwitchCase;

public class a_info {
    public static void main(String[] args) {

        /***********************************************************************************************************************************
         ███████╗██╗    ██╗██╗████████╗ ██████╗██╗  ██╗     ██████╗ █████╗ ███████╗███████╗
         ██╔════╝██║    ██║██║╚══██╔══╝██╔════╝██║  ██║    ██╔════╝██╔══██╗██╔════╝██╔════╝
         ███████╗██║ █╗ ██║██║   ██║   ██║     ███████║    ██║     ███████║███████╗█████╗
         ╚════██║██║███╗██║██║   ██║   ██║     ██╔══██║    ██║     ██╔══██║╚════██║██╔══╝
         ███████║╚███╔███╔╝██║   ██║   ╚██████╗██║  ██║    ╚██████╗██║  ██║███████║███████╗
         ╚══════╝ ╚══╝╚══╝ ╚═╝   ╚═╝    ╚═════╝╚═╝  ╚═╝     ╚═════╝╚═╝  ╚═╝╚══════╝╚══════╝
         ***********************************************************************************************************************************/

        /**                                     Mehrfachverzweigungen mit switch
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *  Mit switch-case können mehrere mögliche Werte einer Variable abgeprüft werden.
         *  Es ist eine Alternative zur if-else-Verzweigung – besonders bei vielen festen Optionen.
         *
         *  Jeder case prüft, ob ein bestimmter Wert zutrifft. Wenn ja, wird der Code unterhalb ausgeführt.
         *  Ein "break" beendet den switch-Block – sonst läuft der Code bis zum nächsten break (Fallthrough).
         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         */

        /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *    SYNTAX:
         *
         *    switch(variable) {
         *        case wert1:
         *            // Code für Wert 1
         *            break;
         *        case wert2:
         *            // Code für Wert 2
         *            break;
         *        default:
         *            // Dieser Code wird ausgeführt, wenn kein anderer Fall passt (entspricht einem else)
         *    }
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

        /*** Hinweise * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *    - break verhindert, dass weitere cases automatisch ausgeführt werden (Fallthrough).
         *    - default ist optional, wird ausgeführt, wenn kein anderer Fall zutrifft.
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

        /** BEISPIEL 1: Wochentag basierend auf einer Zahl **/
        int tag = 3;

        switch(tag) {
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch"); // Dies wird ausgegeben
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            default:
                System.out.println("Wochenende oder ungültig");
        }

        /** BEISPIEL 2: String-Vergleich mit switch **/
        String befehl = "start";

        switch(befehl) {
            case "start":
                System.out.println("Programm startet...");
                break;
            case "stop":
                System.out.println("Programm wird beendet.");
                break;
            case "hilfe":
                System.out.println("Zeige Hilfe an.");
                break;
            default:
                System.out.println("Unbekannter Befehl!");
        }

        /** BEISPIEL 3: Fallthrough **/
        int note = 1;

        switch(note) {
            case 1:
                System.out.println("Note ist sehr gut");
                                                    // Weil hier kein break Keyword steht, wird case 2 ebenfalls ausgeführt.
            case 2:
                System.out.println("gut!");         // auch dies wird ausgeführt.
                break;                              // Erst hier kommt der break
            case 3:
                System.out.println("Befriedigend");
                break;
            default:
                System.out.println("Bitte verbessern!");
        }

    }
}
