import java.util.*;
public class Buttons{
// itsmeAryan template v2.0.0
/*
Q name = B. Buttons
Q link = https://codeforces.com/problemset/problem/268/B
*/
  public static void main(String[] args){ 
   Buttons instance =new Buttons();
   Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();
   int sum=0;
   for(int i=0;i<n-1;i++){
    sum+=(n-i-1)*(i+1);
   }
   System.out.println(sum+n);
  }
}