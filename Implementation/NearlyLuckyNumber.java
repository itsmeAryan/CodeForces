import java.util.*;
public class NearlyLuckyNumber {
    // itsmeAryan template v2.0.0
    /*
     * Q name =A. Nearly Lucky Number
     * Q link =https://codeforces.com/contest/110/problem/A
     */
    public static void main(String[] args) {
        NearlyLuckyNumber instance = new NearlyLuckyNumber();
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        scan.close();

        System.out.println(instance.solve(n));

    }

    private String solve(String n) {
        int num=0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '4' || n.charAt(i)== '7') {
                num++;
            }
        }
        if(num==4 || num==7)return "YES";
        return "NO";
    }
}