package MAths;
import java.util.*;
public class FloorNumber{
// itsmeAryan template v2.0.0
/*
Q name =A. Floor Number 
Q link =https://codeforces.com/problemset/problem/1426/A 
*/
  public static void main(String[] args) throws Exception{ 
   FloorNumber instance =new FloorNumber();
  Scanner scan=new Scanner(System.in);
  int t=scan.nextInt();
  while(t!=0){
    int n=scan.nextInt();
    int x=scan.nextInt();
    int counter =1;
     if(n<=2)System.out.println(1);
    else {while(true){
        int sum=x*counter+(2);
        if(sum>=n)break;
        counter++;
     }
     System.out.println((counter+1));}
  t--;
  }
  scan.close();
   
  }
}