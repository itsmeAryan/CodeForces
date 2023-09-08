package MAths;
import java.util.*;
public class MagicalSticks{
// itsmeAryan template v2.0.0
/*
Q name = A. Magical Sticks
Q link = https://codeforces.com/problemset/problem/1371/A
*/
  public static void main(String[] args) throws Exception{ 
   MagicalSticks instance =new MagicalSticks();
   Scanner scan=new Scanner(System.in);
   int t=scan.nextInt();
   while(t!=0){
     int n=scan.nextInt();
     if(n%2==0)System.out.println(n/2);
     else System.out.println((n/2)+1);
   t--;
   }
   scan.close();
  }
}