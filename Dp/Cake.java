package Dp;
import java.util.Scanner;

public class Cake{
    /*Q name =Napoleon Cake
     *Q link =https://codeforces.com/problemset/problem/1501/B 
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int testCases=scan.nextInt();
        Cake cake=new Cake();
        while(testCases!=0){
            int arrSize=scan.nextInt();
            int arr[]=new int[arrSize];
            for(int i=0;i<arrSize;i++){
                arr[i]=scan.nextInt();
                
            }
            cake.cookCake(arr,arrSize);

            testCases--;
        }
        scan.close();
    }
    protected void cookCake(int []a,int n){
        for (int i = n - 2; i >= 0; i--) {
			
			a[i] = Math.max(a[i], Math.max(0, a[i + 1] - 1));
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] > 0 ? 1+" " : 0+" ");
		}
        System.out.println();
    }
}