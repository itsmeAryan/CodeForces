import java.util.*;
public class SoftDrinking{
// itsmeAryan template v2.0.0
/*
Q name = A. Soft Drinking
Q link = https://codeforces.com/problemset/problem/151/A
*/
  public static void main(String[] args){ 
   SoftDrinking instance =new SoftDrinking();
   Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();
   int k=scan.nextInt();
   int l=scan.nextInt();
   int c=scan.nextInt();
   int d=scan.nextInt();
   int p=scan.nextInt();
   int nl=scan.nextInt();
   int np=scan.nextInt();
scan.close();
   int totalDrink=(k*l)/n;
   int totalSlice=(c*d)/n;
   int totalSalt=p/n;
   int couter=0;

   while(totalDrink-nl>=0&&totalSlice-1>=0&&totalSalt-np>=0){
    couter++;
    totalDrink-=nl;
    totalSlice-=1;
    totalSalt-=np;
   }

   System.out.println(couter);
  }
}