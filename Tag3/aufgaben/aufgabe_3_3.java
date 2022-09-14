package Tag3.aufgaben;

public class aufgabe_3_3 {
    public static void main(String[] args) {
        double ergebnis = 0;
        double teilen = 0;
        int[] notenspiegel = new int[] {2,5,12,8,5};
        for (int i=0; i<notenspiegel.length; i++) {
            ergebnis += notenspiegel[i]*(i+1);
            teilen += notenspiegel[i];
        }
        ergebnis /= teilen;
        System.out.println(ergebnis);
    }
}
