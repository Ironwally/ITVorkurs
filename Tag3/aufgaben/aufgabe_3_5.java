package Tag3.aufgaben;

public class aufgabe_3_5 {
    public static void main(String[] args) {
        int[] zahlenfolge = new int[] {4,8,15,16,23,42};
        int[] newZahlen = {108,540,7200};
        int[] beidesZusammen = new int[zahlenfolge.length+newZahlen.length];
        for (int i=0; i<zahlenfolge.length;i++) {
            beidesZusammen[i] = zahlenfolge[i];
        }
        for (int i=0; i<newZahlen.length;i++) {
            beidesZusammen[i+zahlenfolge.length] = newZahlen[i];
        }
        System.out.println();
        for (int i=0;i< beidesZusammen.length;i++) {    //Ausgabe der Zahlen
            System.out.println(beidesZusammen[i]);
        }

    }

}
