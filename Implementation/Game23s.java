import java.util.*;

public class Game23s {
    // itsmeAryan template v2.0.0
    /*
     * Q name =A. Game 23
     * Q link =https://codeforces.com/problemset/problem/1141/A
     */
    public static void main(String[] args) {
        Game23s instance = new Game23s();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        if(m%n!=0){
            System.out.println(-1);
        }else{
            m/=n;
        int counter1 = 0;
        while (m%3==0) {
        m/=3;
            counter1++;
        }
        while (m%2==0) {
        m/=2;
            counter1++;
        }
      if(m==1)  System.out.println(counter1);
      else System.out.println(-1);
        }
        scan.close();
    }
}