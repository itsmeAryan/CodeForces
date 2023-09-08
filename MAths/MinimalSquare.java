package MAths;
import java.util.*;
public class MinimalSquare{
// itsmeAryan template v2.0.0
/*
Q name = A. Minimal Square
Q link = https://codeforces.com/problemset/problem/1360/A
*/
  public static void main(String[] args) throws Exception{ 
   MinimalSquare instance =new MinimalSquare();
  Scanner scan=new Scanner(System.in);
  int t=scan.nextInt();
  while(t!=0){
    int a=scan.nextInt();
    int b=scan.nextInt();
    if(a>b)b=b<<1;
    else a=a<<1;
    System.out.println(Math.max(a, b)*Math.max(a, b));
  t--;
  }
  scan.close();
   
  }
}