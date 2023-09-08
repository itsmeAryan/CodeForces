package Contents;
public class Flower{
// itsmeAryan template v2.0.0
/*Q name=C. Flower City Fence
  Q link=https://codeforces.com/contest/1862/problem/C
 */  
public static void main(String[] args){ 
   Flower instance =new Flower();
    
  }
  protected void solve(int[]arr,int n){
    if(n!=arr[0]){
      
      System.out.println("NO");
      return;
    }
    int[]result=new int[n];
      int first=n-1;
      for(int i=0;i<n;i++){
        int val=i+1;
        while(arr[first]<val)first--;
        result[i]=first+1;
      }
      for(int i=0;i<n;i++){
        if(arr[i]!=result[i]){
          System.out.println("NO");
          return;
        }
      }
      System.out.println("YES");
  }
}