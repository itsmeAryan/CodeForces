import java.util.*;
public class WrongSubtraction{
// itsmeAryan template v2.0.0
/*
Q name = A. Wrong Subtraction
Q link = https://codeforces.com/problemset/problem/977/A
*/
  public static void main(String[] args){ 
   WrongSubtraction instance =new WrongSubtraction();
   Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();
   int k=scan.nextInt();
   scan.close();
   while(k!=0){
    int lastDigit=n%10;
    if(lastDigit==0){
        n/=10;
    }else n--;
    k--;
   }
System.out.println(n);
  }
}