package MAths;
import java.util.*;
public class EvenArray{
// itsmeAryan template v2.0.0
/*
Q name =B. Even Array 
Q link = https://codeforces.com/problemset/problem/1367/B
*/
  public static void main(String[] args) throws Exception{ 
   EvenArray instance =new EvenArray();
   Scanner scan=new Scanner(System.in);
   int t=scan.nextInt();
   while(t!=0){
     int n=scan.nextInt();
     int countOdd=0,oddNotInPosition=0;
      int[]arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
        if(arr[i]%2==1)countOdd++;
        if(i%2==0&&arr[i]%2==1)oddNotInPosition++;
      }
      if(countOdd>n/2||countOdd<n/2)System.out.println(-1);
      else System.out.println(oddNotInPosition);

   t--;
   }
   scan.close();
   
  }
}