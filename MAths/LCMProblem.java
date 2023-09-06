package MAths;
import java.util.*;
public class LCMProblem{
// itsmeAryan template v2.0.0
/*
Q name =A. LCM Problem 
Q link =https://codeforces.com/problemset/problem/1389/A 
*/
  public static void main(String[] args) throws Exception{ 
   LCMProblem instance =new LCMProblem();
   Scanner scan=new Scanner(System.in);
   int t=scan.nextInt(),l,r,x,y;
   while(t!=0){
     l=scan.nextInt();
     r=scan.nextInt();
     x=l;
     y=2*l;
     if(y<=r)System.out.println(x+" "+y);
     else System.out.println(-1+" "+-1);
   t--;
   }
   scan.close();
   
  }
}