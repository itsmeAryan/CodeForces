import java.util.*;

public class Dominopiling {
    // itsmeAryan template v2.0.0
    /*
     * Q name = A. Domino piling
     * Q link = https://codeforces.com/problemset/problem/50/A
     */
    public static void main(String[] args) throws Exception {
        Dominopiling instance = new Dominopiling();
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println((a*b)/2);//there would be a*b/2 dominoes

        scan.close();
    }
}