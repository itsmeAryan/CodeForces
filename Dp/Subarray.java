import java.util.Scanner;
/*Q1 name=Maximum Increase
 *Q link=https://codeforces.com/contest/702/problem/A
 * 
*/
public class Subarray{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int arr[]=new int[number];
        for(int i=0;i<number;i++){
            arr[i]=scan.nextInt();
        }
        scan.close();
        System.out.println(new Subarray().findLength(arr));
    }
    protected int findLength(int[]arr){
        int n=arr.length;
        int counter=1,max=1;
        int prev=arr[0];
        for(int i=1;i<n;i++){
          if(prev<arr[i]){counter++;}
          else {
            counter=1;
          }
          prev=arr[i];
          if(counter>max){
            max=counter;
          }
        }

        return max;
    }
}