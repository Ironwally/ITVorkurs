public class Main {
    public static void main(String[] args) {
       double p;
       double q; 
       double x1;
       double x2;

        if ((Math.pow((p/2,2)-q) > 0) {
        x1 = -(p/2) + Math.sqrt(Math.pow(p/2,2)-q);
        x2 = -(p/2) - Math.sqrt (Math.pow(p/2,2)-q);
        System.out.println("x1 is " + x1);
        System.out.println("x2 is " + x2);
        } else {
            System.out.println("Negative Zahl unter der Wurzel");
        }
    }
}