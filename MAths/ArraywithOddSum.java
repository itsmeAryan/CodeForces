package MAths;
import java.util.*;
public class ArraywithOddSum{
// itsmeAryan template v2.0.0
/*
Q name = A. Array with Odd Sum
Q link = https://codeforces.com/problemset/problem/1296/A
*/
  public static void main(String[] args) throws Exception{ 
   ArraywithOddSum instance =new ArraywithOddSum();
   Scanner scan=new Scanner(System.in);
   int t=scan.nextInt();
   while(t!=0){
     int n=scan.nextInt();
      int sum=0,arr[]=new int[n];
      int count_odd=0,even=0;
      for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
        sum+=arr[i];
        if(arr[i]%2==1)count_odd++;
        else even++;
      }
      if(sum%2==1||(count_odd>=1&&even>=1))System.out.println("YES");
      else {
        System.out.println("NO");
      }
   t--;
   }
   scan.close();
  }
}