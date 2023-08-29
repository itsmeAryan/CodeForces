import java.util.*;
public class FixYou{
// itsmeAryan template v2.0.0
/*
Q name = B. Fix You
Q link = https://codeforces.com/problemset/problem/1391/B
*/
  public static void main(String[] args){ 
   FixYou instance =new FixYou();
   Scanner scan=new Scanner(System.in);
   int t=scan.nextInt();
   while (t > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            scan.nextLine(); // Consume the newline character after reading m
            char grid[][] = new char[n][m];
            for (int i = 0; i < n; i++) {
                
                    grid[i] = scan.nextLine().toCharArray();
            }
            //last row
            int max=0;
            for(int i=0;i<m;i++){
                if(grid[n-1][i]=='D')max++;
            }
            //last col
            for(int i=0;i<n;i++){
                if(grid[i][m-1]=='R')max++;
            }
            System.out.println(max);
            t--;
        }
   scan.close();
  }
}