package MAths;
import java.util.*;
public class BuyaShovel{
// itsmeAryan template v2.0.0
/*
Q name = A. Buy a Shovel
Q link = https://codeforces.com/problemset/problem/732/A
*/
  public static void main(String[] args) throws Exception{ 
   BuyaShovel instance =new BuyaShovel();
   Scanner scan=new Scanner(System.in);
   int a=scan.nextInt();
   int b=scan.nextInt();
   if(a%10==0||a%10==b)System.out.println("1");
   else{
    int sum=a,counter=1;
   while(sum%10!=0&&sum%10!=b){
    sum+=a;
    counter++;
   }
   System.out.println(counter);
   }
   scan.close();
  }
}