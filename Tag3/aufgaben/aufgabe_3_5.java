package Tag3.aufgaben;

import java.util.ArrayList;

public class aufgabe_3_5 {
    public static void main(String[] args) {
        int[] zahlenfolge = new int[]{4, 8, 15, 16, 23, 42};
        int[] newZahlen = {108, 540, 7200};
        int[] beidesZusammen = new int[zahlenfolge.length + newZahlen.length];
        //Fügt Zahlen von zahlenfolge hinzu
        for (int i = 0; i < zahlenfolge.length; i++) {
            beidesZusammen[i] = zahlenfolge[i];
        }
        for (int i = 0; i < newZahlen.length; i++) {
            beidesZusammen[i + zahlenfolge.length] = newZahlen[i];
        }
        //Ausgabe der Zahlen
        for (int i = 0; i < beidesZusammen.length; i++) {
            System.out.println(beidesZusammen[i]);
        }

        ArrayList arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        while (true) {
            try {
                arrayList.addAll(arrayList);
            } catch (OutOfMemoryError e) {
                throw e;
            }
            System.out.println(arrayList.size());
        }
    }
}
