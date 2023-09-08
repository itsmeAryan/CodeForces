package MAths;
import java.util.*;

public class ParkLighting {
    // itsmeAryan template v2.0.0
    /*
     * Q name =A. Park Lighting
     * Q link =https://codeforces.com/problemset/problem/1358/A
     */
    public static void main(String[] args) throws Exception {
        ParkLighting instance = new ParkLighting();
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t != 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int sum = n * m;
            if (sum % 2 == 0) {
                System.out.println(sum / 2);
            } else {
                System.out.println(sum / 2 + 1);
            }

            t--;
        }
        scan.close();
    }
}