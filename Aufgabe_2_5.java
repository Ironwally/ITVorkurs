public class Main {

  public static void main(String[] args) {
  
  int jahr = 100;
  boolean schaltjahr = false;
  
  if (jahr%400==0) {
    if (jahr%100==0) schaltjahr = true;
    } else if (jahr%4==0) schaltjahr = true;
  
  }

}
