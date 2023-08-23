package Dp;
import java.util.Scanner;
public class Ilya {
    // itsmeAryan template v2.0.0
    /*Q name = B. Ilya and Queries
     *Q link = https://codeforces.com/problemset/problem/313/B 
     */
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Ilya instance = new Ilya();
        instance.solve();
        scanner.close();
    }
    protected void solve() {
        int m, l, r, cnt = 0;
        int[] dp = new int[100005];
        String s;
        s = scanner.next();
        m = scanner.nextInt();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1))
                cnt++;
            dp[i] = cnt;
        }
        while (m-- > 0) {
            l = scanner.nextInt();
            r = scanner.nextInt();
            System.out.println(dp[r - 1] - dp[l - 1]);
        }
    }
}