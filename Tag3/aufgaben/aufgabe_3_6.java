package Tag3.aufgaben;

public class aufgabe_3_6 {
    public static void main(String[] args) {

        int temp = 0;
        int i = 0;
        int y = 1;
        while (y<1000) {
            y += temp;
            System.out.println(y);
            temp += y;
            System.out.println(temp);
        }


        int[] v = {1,0};
        while (v[i%2]<1000) {
            System.out.println(v[i%2]);
            v[i%2] += v[(i+1)%2];
            i++;
        }
    }

}
