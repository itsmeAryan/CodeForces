import java.util.*;

public class PalindromicTwist {
    // itsmeAryan template v2.0.0
    /*
     * Q name =A. Palindromic Twist
     * Q link =https://codeforces.com/problemset/problem/1027/A
     */
    public static void main(String[] args) throws Exception {
        PalindromicTwist instance = new PalindromicTwist();
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t != 0) {
            int n = scan.nextInt();
            scan.nextLine();
            String str = scan.nextLine();
            int i = 0, j = n - 1;
            while (i <= j) {
                char start = str.charAt(i);
                char last = str.charAt(j);
                char p1 = (char) ((start == 'a') ? '1' : start - 1);
                char p2 = (char) ((last == 'a') ? '1' : last - 1);
                char p3 = (char) ((start == 'z') ? '2' : start + 1);
                char p4 = (char) ((last == 'z') ? '2' : last + 1);
                if (p1 == p2 || p1 == p4) {
                    i++;
                    j--;
                } else if (p1 == p2 || p2 == p3) {
                    i++;
                    j--;
                } else
                    break;

            }
if(i>j){System.out.println("YES");}
else System.out.println("NO");
            t--;
        }
        scan.close();

    }

}