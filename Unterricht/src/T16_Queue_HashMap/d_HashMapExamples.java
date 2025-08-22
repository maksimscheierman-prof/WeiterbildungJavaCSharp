package T16_Queue_HashMap;

import java.util.HashMap;

public class d_HashMapExamples {

    public static void main(String[] args) {

        // Wir erstellen eine Einkaufsliste als HashMap.
        // Unser key ist ein String und unser Wert ein Integer
        HashMap<String, Integer> einkaufsliste = new HashMap<String, Integer>();

        // Wir fügen unserer HashMap Einkaufsliste Paare hinzu
        einkaufsliste.put("Apfel", 3);
        einkaufsliste.put("Banane",5);
        einkaufsliste.put("Orange", 2);
        einkaufsliste.put("Melone", 1);
        // Wir lassen uns ausgeben wie viel wir wovon haben.
        System.out.println(einkaufsliste.get("Apfel") + " Aepfel");
        System.out.println(einkaufsliste.get("Banane") + " Bananen");
        System.out.println(einkaufsliste.get("Orange") + " Orangen");

        //Prüfen ob ein Schlüssel vorhanden ist:
        if(einkaufsliste.containsKey("Melone")){
            System.out.println("Es gibt Melonen");
        }

        // Überprüfen ob ein Wert vorhanden ist.
        if(einkaufsliste.containsValue(2)){
            System.out.println("Es gibt den Wert 2 in der HashMap");
        }

        // Größe der HashMap
        System.out.println("Elemente in der HashMap:" + einkaufsliste.size());

    }

}
