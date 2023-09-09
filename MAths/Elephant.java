package MAths;
import java.util.*;
public class Elephant{
// itsmeAryan template v2.0.0
/*
Q name = A. Elephant
Q link = https://codeforces.com/problemset/problem/617/A
*/
  public static void main(String[] args) throws Exception{ 
   Elephant instance =new Elephant();
   Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();
   int sum=n/5;
   System.out.println(n%5==0?sum:sum+1);
   scan.close();
  }
}