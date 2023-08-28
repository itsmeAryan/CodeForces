import java.util.*;
public class Tram{
// itsmeAryan template v2.0.0
/*
Q name = A. Tram
Q link = https://codeforces.com/problemset/problem/116/A
*/
  public static void main(String[] args){ 
   Tram instance =new Tram();
       Scanner scan=new Scanner(System.in);
            int t=scan.nextInt();
            int max=0,ans=0;
            while(t!=0){
                  int a=scan.nextInt();
                  int b=scan.nextInt();
                  scan.nextLine();
                  max+=b-a;
                  ans=Math.max(max, ans);
                t--;
            }
            System.out.println(ans);
        scan.close();
 
  }
  public int solve(){
    //brute
    Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();
   int[][]arr=new int[n][2];
   for(int temp[]:arr){
    for(int i=0;i<2;i++){
        temp[i]=scan.nextInt();
    }
   }
    //bruteforce approach
    int max=arr[0][1];
    int prev=max;
    for(int i=1;i<arr.length-1;i++){
        int rest=prev-arr[i][0];
        if(rest+arr[i][1]>max){
            max=rest+arr[i][1];
        }
        prev=rest+arr[i][1];
    }
    return max;
  }
}
