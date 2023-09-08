package MAths;
import java.util.*;
public class ThreePairwiseMaximums{
// itsmeAryan template v2.0.0
/*
Q name = Three Pairwise Maximums
Q link = https://codeforces.com/problemset/problem/1385/A
*/
  public static void main(String[] args) throws Exception{ 
   ThreePairwiseMaximums instance =new ThreePairwiseMaximums();
   Scanner scan=new Scanner(System.in);
   int t=scan.nextInt();
   while(t!=0){
    int[]arr=new int[3];
    for(int i=0;i<3;i++){
      arr[i]=scan.nextInt();
    }
    Arrays.sort(arr);
    if(arr[1]!=arr[2]){
      System.out.println("NO");
    }
    else{
      System.out.println("YES");
      System.out.println(arr[0]+" "+arr[0]+" "+arr[2]);
    }

   t--;
   }
   scan.close();
  }
}