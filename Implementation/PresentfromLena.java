import java.util.*;

public class PresentfromLena {
    // itsmeAryan template v2.0.0
    /*
     * Q name =B. Present from Lena
     * Q link =https://codeforces.com/problemset/problem/118/B
     */
    public static void main(String[] args) {
        PresentfromLena instance = new PresentfromLena();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("  ");
        }
        System.out.println(0);
        
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print("  ");
            }
            System.out.print(0);
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(" " + j);
            }
            System.out.println(" 0");
        }
        
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print("  ");
            }
            System.out.print(0);
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(" " + j);
            }
            System.out.println(" 0");
        }
        
        for (int i = 1; i <= n; i++) {
            System.out.print("  ");
        }
        System.out.println(0);

    }
}