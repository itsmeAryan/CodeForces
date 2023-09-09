package MAths;
import java.util.*;

public class DivisibilityProblem {
    // itsmeAryan template v2.0.0
    /*
     * Q name =A. Divisibility Problem
     * Q link = https://codeforces.com/problemset/problem/1328/A
     */
    public static void main(String[] args) throws Exception {
        DivisibilityProblem instance = new DivisibilityProblem();
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t != 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if(a%b==0)System.out.println("0");//zero operation
            else if(a<b)System.out.println(b-a);//b-a operations
            else{
                System.out.println((((a/b)+1)*b)-a);
            }
            t--;
        }
        scan.close();

    }
}