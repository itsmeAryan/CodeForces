import java.util.*;

public class DreamoonandStairs {
    // itsmeAryan template v2.0.0
    /*
     * Q name =A. Dreamoon and Stairs
     * Q link =https://codeforces.com/contest/476/problem/A
     */
    public static void main(String[] args) {
        DreamoonandStairs instance = new DreamoonandStairs();
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int res = -1;
       if(m<n){
        res=-1;
       }
       else if (m == n) {
            res = m;
        } else if ((m / 2) < n) {
            //if number is equal or greater the return 
            res = n;
        } else {
            //we are checking multiples of the number 
            //2 4 6
            //4*2<10 no
            //6*2<10 yes
            int temp = n;
            while (true) {
                if (temp * 2 < m)
                    temp += n;
                else
                    break;
            }
            res = temp;

        }
        System.out.println(res);
    }

}