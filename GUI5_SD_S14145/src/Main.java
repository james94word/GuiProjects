/**
 *
 *  @author Shevchenko Dariia S14145
 *
 */

package zad1;


public class Main {
  public static void main(String[] args)
  {
    Spiewak s1 = new Spiewak("Carrey"){
        String song = "Aaa Bbb Ccc";
      /*<-  kod */
    };

    Spiewak s2 = new Spiewak("Houston"){
      /*<-  kod */
    };

    Spiewak s3 = new Spiewak("Madonna"){
      /*<-  kod */
    };

    Spiewak sp[] = {s1, s2, s3};

    for (Spiewak s : sp)
      System.out.println(s);


    System.out.println("\n" + Spiewak.najglosniej(sp));
  }
}
