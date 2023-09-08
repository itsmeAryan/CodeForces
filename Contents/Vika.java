package Contents;
import java.util.Scanner;

public class Vika {
  public static void main(String[] args) {
    Vika instance = new Vika();
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    scan.nextLine(); // Consume the newline character
    while (n != 0) {
      int x = scan.nextInt();
      int y = scan.nextInt();
      scan.nextLine(); // Consume the newline character
      char[][] mat = new char[x][y];
      for (int i = 0; i < x; i++) {
        String s = scan.nextLine();
        mat[i] = s.toCharArray();
      }
      instance.find(mat, x, y);
      n--;
    }
  }

  private void find(char[][] mat, int n, int m) {
    String s = "vika";
    for (int i = 0; i < m; i++) {
      if (s.length() == 0) {
        System.out.println("YES");
        return;
      }
      for (int j = 0; j < n; j++) {

        if (mat[j][i] == s.charAt(0)) {
                s = s.substring(1);
          break;
        }
      }

    }
    if (s.length() == 0) {
      System.out.println("YES");

    } else {
      System.out.println("NO");

    }
  }
}
