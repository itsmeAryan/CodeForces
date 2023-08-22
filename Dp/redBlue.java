package Dp;
import java.util.Scanner;

public class redBlue {
    /*Q name =B. Red and Blue
     *Q link = https://codeforces.com/problemset/problem/1469/B 
     */
  private static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        
        int n=scan.nextInt();
        redBlue redblue=new redBlue();
        while(n!=0){
            int f1=scan.nextInt();
            int arr1[]=new int[f1];
            redblue.takeUserInput(arr1);
            int f2=scan.nextInt();
            int arr2[]=new int[f2];
            redblue.takeUserInput(arr2);
            redblue.printOutput(arr1,arr2);
            n--;
        }
        scan.close();
    }
   private void takeUserInput(int[] arr) {
       for (int i = 0; i < arr.length; i++) {
           arr[i] = scan.nextInt();
       }
   }
   protected void printOutput(int[]arr1,int[]arr2){
    int max1=0,max2=0;
    int sum=0,sum2=0;
    int i=0,j=0,n=arr1.length,m=arr2.length;
    while(i<n||j<m){
        if(i<n){
          sum+=arr1[i];
          i++;
          max1=Math.max(max1, sum);
        }
        if(j<m){
            sum2+=arr2[j];
          j++;
          max2=Math.max(max2, sum2);
        }
    }
    System.out.println((max1+max2));
   }

}
