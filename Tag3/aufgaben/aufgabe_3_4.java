package Tag3.aufgaben;

public class aufgabe_3_4 {
    public static void main(String[] args) {
        String[] monatNamen = new String[] { "Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
        int[] monatTage = {31,28,31,30,31,30,31,30,31,30,31,30};
        for (int i=0;i<monatTage.length;i++) {
            System.out.println("Der Monat " + monatNamen[i] + " hat " + monatTage[i] + " Tage.");
        }
    }
}
