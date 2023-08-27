import java.util.*;
public class Presents{
// itsmeAryan template v2.0.0
/*
Q name = A. Presents
Q link = https://codeforces.com/problemset/problem/136/A
*/
  public static void main(String[] args){ 
   Presents instance =new Presents();
   Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();
   scan.nextLine();
   String str[]=scan.nextLine().split(" ");
   scan.close();
   int[]arr=new int[n];
   for(int i=0;i<n;i++){
      int j=Integer.parseInt(str[i])-1;
      arr[j]=i+1;
   }
   for(int i:arr){
    System.out.print(i+" ");
   }
   System.out.println();
  }
 
}