import java.util.*;
public class AssigningtoClasses{
// itsmeAryan template v2.0.0
/*
Q name = B. Assigning to Classes
Q link = https://codeforces.com/problemset/problem/1300/B
*/
  public static void main(String[] args){ 
   AssigningtoClasses instance =new AssigningtoClasses();
   Scanner scan=new Scanner(System.in);
   int t=scan.nextInt();
    while(t!=0){
        int n=scan.nextInt();
        int[]arr=new int[n*2];
        for(int i=0;i<n*2;i++){
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Math.abs(arr[n-1]-arr[n]));
        t--;
    }
    scan.close();
  }
 
}