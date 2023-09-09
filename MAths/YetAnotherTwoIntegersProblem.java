package MAths;
import java.util.*;

public class YetAnotherTwoIntegersProblem {
    // itsmeAryan template v2.0.0
    /*
     * Q name = A. Yet Another Two Integers Problem
     * Q link = https://codeforces.com/problemset/problem/1409/A
     */
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        YetAnotherTwoIntegersProblem instance = new YetAnotherTwoIntegersProblem();
        int t = scan.nextInt();
        while (t != 0) {
            instance.optimalSolution();
            t--;
        }
        scan.close();

    }
    protected void optimalSolution() {
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a > b) {
            a -= b;
            int sum = a / 10;
            System.out.println(a % 10 == 0 ? sum : sum + 1);
        } else if (b > a) {
            b -= a;
            int sum = b / 10;
            System.out.println(b % 10 == 0 ? sum : sum + 1);
        } else
            System.out.println("0");
    }
}