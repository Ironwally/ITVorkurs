public class Main {
    public static void main(String[] args) {
        boolean male = true;
        String name = "Peter";
        String ansprache;
        if (male) {ansprache = "Herr"}
        else ansprache = "Frau";
        System.out.println("Guten Tag " + ansprache + name);
    }
}
