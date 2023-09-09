package MAths;
import java.util.*;

public class RestoringThreeNumbers {
    // itsmeAryan template v2.0.0
    /*
     * Q name =A. Restoring Three Numbers
     * Q link =https://codeforces.com/problemset/problem/1154/A
     */
    public static void main(String[] args) throws Exception {
        RestoringThreeNumbers instance = new RestoringThreeNumbers();
        Scanner scan = new Scanner(System.in);
        int arr[]=new int[4];
        int max=0;
        for(int i=0;i<4;i++){
            arr[i]=scan.nextInt();
            if(i==0)continue;
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        for(int i=0;i<4;i++){
            if(max==i)continue;
            System.out.print(arr[max]-arr[i]+" ");
        }
        System.out.println();
        scan.close();

    }
}