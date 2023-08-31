import java.util.*;
public class DonutShops{
// itsmeAryan template v2.0.0
/*
Q name = A. Donut Shops
Q link = https://codeforces.com/problemset/problem/1373/A
*/
  public static void main(String[] args){ 
   DonutShops instance =new DonutShops();
   Scanner scan=new Scanner(System.in);
   int t=scan.nextInt();
   while(t!=0){
    long a=scan.nextLong();
    long b=scan.nextLong();
    long c=scan.nextLong();
    if(a<c){
        System.out.print(1+" ");
    }else{
        System.out.print(-1+" ");
    }
    if(a*b>c){
        System.out.print(b);
        System.out.println();
    }else{
        System.out.print(-1);
        System.out.println();
    }
    t--;
   }
   scan.close();
  }
}