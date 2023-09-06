package MAths;
import java.util.*;

public class MahmoudandEhabandtheevenoddgame {
  // itsmeAryan template v2.0.0
  /*
   * Q name =A. Mahmoud and Ehab and the even-odd game
   * Q link =https://codeforces.com/problemset/problem/959/A
   */
  public static void main(String[] args) throws Exception {
    MahmoudandEhabandtheevenoddgame instance = new MahmoudandEhabandtheevenoddgame();
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
        if (n%2==0) {
          System.out.println("Mahmoud");
        } else {
          System.out.println("Ehab");
        }
  }
}