import java.util.*;
public class LuckySumofDigits{
// itsmeAryan template v2.0.0
/*
Q name = A. Lucky Sum of Digits
Q link = https://codeforces.com/problemset/problem/109/A
*/
  public static void main(String[] args) throws Exception{ 
   LuckySumofDigits instance =new LuckySumofDigits();
   Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();
   boolean f=true;
   StringBuilder sumBuilder = new StringBuilder();

while (n > 0 && n % 7 != 0) {
    sumBuilder.append("4");
    n -= 4;
}

while (n > 0 && n % 7 == 0) {
    n -= 7;
    sumBuilder.append("7");
}

String sum = sumBuilder.toString();

   
   printWithCondition(n==0, sum, "-1");
  }
  private static void printWithCondition(boolean condition,String a,String b){
      if(condition){
          System.out.println(a);
      }else {
          System.out.println(b);
      }
  }
}