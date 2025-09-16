package T20_TryCatch;

public class meineExceptionBeispiel {


    /**
     * Es wird eine Methode erstellt, die daraufhin die eigenst erstellte Exception
     * nutzt um sie ausgeben.
     * */
    public static void checkAge(int a) throws meineException{
        if(a < 0){
            throw new meineException("Zahl darf nicht kleiner als 0 sein.");
        }
    }

    public static void main(String[] args) {

        /** Wir MÜSSEN nun die Methode in einm try-catch Block aufrufen.*/
        try{
            checkAge(-1);
        }catch(meineException e){
            System.out.println(e);
        }


    }


}
