import java.util.*;

public class DiverseSubstring {
    // itsmeAryan template v2.0.0
    /*
     * Q name =A. Diverse Substring
     * Q link =https://codeforces.com/problemset/problem/1073/A
     */
    public static void main(String[] args) throws Exception {
        DiverseSubstring instance = new DiverseSubstring();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        char s[] = scan.nextLine().toCharArray();
        if (n == 1) {
            System.out.println("NO");
        } else {
            boolean f = true;
            for (int i = 1; i < n; i++) {
                if (s[i] != s[i - 1]) {
                    System.out.println("YES");
                    System.out.println(s[i - 1] + "" + s[i]);
                    f = false;
                    break;
                }
            }
            if (f) {
                System.out.println("NO");

            }
        }

    }

}