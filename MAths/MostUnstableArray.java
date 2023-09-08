package MAths;
import java.util.*;
public class MostUnstableArray{
// itsmeAryan template v2.0.0
/*
Q name = A. Most Unstable Array
Q link = https://codeforces.com/problemset/problem/1353/A
*/
  public static void main(String[] args) throws Exception{ 
   MostUnstableArray instance =new MostUnstableArray();
  Scanner scan=new Scanner(System.in);
  int t=scan.nextInt();
  while(t!=0){
    int n=scan.nextInt();
        int m=scan.nextInt();
      if(n==1)System.out.println(0);
      if(n==2)System.out.println(m);
      if(n>2)System.out.println(m+m);
     
  t--;
  }
  scan.close();
   
  }
}