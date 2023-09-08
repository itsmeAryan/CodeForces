package MAths;
import java.util.*;

public class CollectingCoins {
    // itsmeAryan template v2.0.0
    /*
     * Q name = A. Collecting Coins
     * Q link = https://codeforces.com/problemset/problem/1294/A
     */
    public static void main(String[] args) throws Exception {
        CollectingCoins instance = new CollectingCoins();
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t != 0) {
            int max = 0;
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int n = scan.nextInt();
            max = Math.max(a, Math.max(b, c));
            int sum=(max-a)+(max-b)+(max-c);
            if(n>=sum&&(n-sum)%3==0){
                System.out.println("YES");
            } else
                System.out.println("NO");

            t--;
        }
        scan.close();
    }
}