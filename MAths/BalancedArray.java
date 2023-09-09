package MAths;
import java.util.*;
public class BalancedArray{
// itsmeAryan template v2.0.0
/*
Q name = B. Balanced Array
Q link = https://codeforces.com/problemset/problem/1343/B
*/
  public static void main(String[] args) throws Exception{ 
   BalancedArray instance =new BalancedArray();
Scanner scan=new Scanner(System.in);
int t=scan.nextInt();
while(t!=0){
  int n=scan.nextInt();
  int halfEven=n/2;
  if(halfEven%2==1)System.out.println("NO");//two odd number can form even number 
  // similarly if number can be halfEven%2==0 then it can form even numbers  
 else{
  System.out.println("YES");
   int evenSum=(halfEven+1)*halfEven;//sum of even numbers
   int evenSeries=2;
  for(int i=1;i<=halfEven;i++){
   System.out.print(evenSeries+" ");
   evenSeries+=2;
  } 
  //
  int oddSeries=1,oddSum=0;
  for(int i=1;i<halfEven;i++){
    System.out.print(oddSeries+" ");
    oddSum+=oddSeries;
    oddSeries+=2;
  }
  System.out.print(evenSum-oddSum);
  System.out.println();
 }
t--;
}
scan.close();
   
  }
}