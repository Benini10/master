/**
 * Hello
 */
public class Hello {
  public static void main(String[] args) {
    int x = 20, y = 10, z = 30;
    if (x==10 | y==10) System.out.println("Test passed");

    if(x > y & y < z) System.out.println("Tout est OK");
    else System.out.println("Ya un probleme");
  }
}