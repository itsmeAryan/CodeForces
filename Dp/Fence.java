package Dp;
import java.util.Scanner;

public class Fence{
// itsmeAryan template v2.0.0
  public static void main(String[] args){ 
    /*Q name = B. Fence
     *Q link = https://codeforces.com/problemset/problem/363/B 
     */
   Fence instance =new Fence();
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();    
    int k=scan.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
    }
    scan.close();
    instance.findMinimal(arr, n,k);
  }
  private void findMinimal(int[]arr,int n,int k){
int i=0,j=0;
    int sum=0,max=Integer.MAX_VALUE;
    int index=0;
    while(j<n){
        sum+=arr[j];
        if(j-i+1>=k){
         if(sum<max){
            max=sum;
            index=i;
         }
         sum-=arr[i++];
        }
        j++;
    }
    System.out.println(index+1);
  }
}