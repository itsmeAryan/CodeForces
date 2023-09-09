package MAths;
import java.util.*;
public class CandiesandTwoSisters{
// itsmeAryan template v2.0.0
/*
Q name = A. Candies and Two Sisters
Q link = https://codeforces.com/problemset/problem/1335/A
*/
  public static void main(String[] args) throws Exception{ 
   CandiesandTwoSisters instance =new CandiesandTwoSisters();
 Scanner scan=new Scanner(System.in);
 int t=scan.nextInt();
 while(t!=0){
   int n=scan.nextInt();
   n=n%2==0?n-1:n;//there would be n/2 ways if number is odd
   System.out.println(n/2);
    
 t--;
 }
 scan.close();
   
  }
}