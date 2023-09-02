import java.util.*;
public class DiverseSubstrings1{
// itsmeAryan template v2.0.0
/*
Q name = B. Diverse Substrings
Q link = https://codeforces.com/contest/1748/problem/B
*/
  public static void main(String[] args) throws Exception{ 
   DiverseSubstrings1 instance =new DiverseSubstrings1();
  Scanner scan=new Scanner(System.in);
  int t=scan.nextInt();
  while(t!=0){
    int n=scan.nextInt();
     scan.nextLine();
     String s=scan.nextLine();
     int ans=0;
     for(int i=0;i<n;i++){
        int[]arr=new int[10];
        int distinct=0,max=0;
        for(int j=i;j<n;j++){
            if(j-i>=101)break;
            int c=(s.charAt(j)-'0');
            if(arr[c]==0){
                distinct++;
            }
            max=Math.max(max, ++arr[c]);
            if(max<=distinct)ans++;
        }
     }
     System.out.println(ans);
  t--;
  }
  scan.close();
   
  }
}