/**
 *
 *  @author Shevchenko Dariia S14145
 *
 */

package zad1;


public class Main {
  public static void main(String[] args) {
    int a1 = 15/*<-  jeden koniec pierwszego przedziału */; 
    int b1 = 2/*<-  drugi koniec pierwszego przedziału */;
    int a2 = 1/*<-  jeden koniec drugiego przedziału */;
    int b2 = 13 /*<-  drugi koniec drugiego przedziału */;

    Przedzial p1 = new Przedzial(a1,b1), p2 = new Przedzial(a2,b2);

    System.out.println("Przedział " + p1 + " ma " + "początek " + p1.poczatek() + " i koniec " + p1.koniec());

    System.out.println("Przecięcie " + p1 + " i " + p2 + " = " + 
                      (p1.przeciecie(p2)!=null?p1.przeciecie(p2):"pusty przedział"));  
  }
}
