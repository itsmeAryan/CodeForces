package MAths;
import java.util.*;

public class RequiredRemainder {
    // itsmeAryan template v2.0.0
    /*
     * Q name = A. Required Remainder
     * Q link = https://codeforces.com/problemset/problem/1374/A
     */
    public static void main(String[] args) throws Exception {
        RequiredRemainder instance = new RequiredRemainder();
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t != 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
             if(c%a==b)System.out.println(c);
             else{
                int rem=c%a;//rem-b+a;
                int change=(rem-b+a)%a;
                System.out.println(c-change);
             }
            t--;
        }
        scan.close();

    }
}