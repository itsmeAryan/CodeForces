import java.util.*;
public class BalancedRatingChanges{
// itsmeAryan template v2.0.0
/*
Q name = A. Balanced Rating Changes
Q link = https://codeforces.com/problemset/problem/1237/A
*/
  public static void main(String[] args) throws Exception{ 
   BalancedRatingChanges instance =new BalancedRatingChanges();
   Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();
   int[]arr=new int[n];
   boolean toggle=false;
   for(int i=0;i<n;i++){
    int val=scan.nextInt();
    if(Math.abs(val)%2==1){
        if(toggle){
            toggle=false;
            val--;
        }
        else{
          val++;
          toggle=true;
        }
    }
    arr[i]=val/2;
   }
   for(int i:arr){
    System.out.println(i);
   }
   scan.close();
  }
}