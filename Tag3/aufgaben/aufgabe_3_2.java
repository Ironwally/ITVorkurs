package Tag3.aufgaben;

public class aufgabe_3_2 {
    public static void main(String[] args) {
        for (int i=10;i>-1;i--) {
            System.out.println(i);
            if (i==0) {
                System.out.println("Bumm");
                for (int y=0; y<11; y++) {
                    System.out.println(y);
                }
            }
        }
    }
}
