import java.util.*;
public class SoldierandBananas{
// itsmeAryan template v2.0.0
/*
Q name = A. Soldier and Bananas
Q link = https://codeforces.com/problemset/problem/546/A
*/
  public static void main(String[] args){ 
   SoldierandBananas instance =new SoldierandBananas();
   Scanner scan=new Scanner(System.in);
   int initial=scan.nextInt();
   int money=scan.nextInt();
   int nterm=scan.nextInt();
   double d=(double)nterm/2;
   double sum =  d* (initial + nterm*initial);
   System.out.println((int)(sum-money)<0?0:(int)(sum-money));
  }
}