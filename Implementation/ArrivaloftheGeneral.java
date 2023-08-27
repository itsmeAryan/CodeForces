import java.util.*;

public class ArrivaloftheGeneral {
    // itsmeAryan template v2.0.0
    /*
     * Q name =
     * Q link =
     */
    public static void main(String[] args) {
        ArrivaloftheGeneral instance = new ArrivaloftheGeneral();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE,maxIndex=0,minIndex=0,time=0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                maxIndex=i;
            }
            if (arr[i] <= min) {
                min = arr[i];
                minIndex=i;
            }
        }
        while(maxIndex>=1||minIndex<n-1){
            if(minIndex<n-1){
                if(maxIndex==minIndex+1)maxIndex--;
                
                instance.swap(arr, minIndex, minIndex+1);
                minIndex++;
                time++;
            }
            if(maxIndex>=1){
                if(maxIndex-1==minIndex)minIndex++;
                instance.swap(arr, maxIndex, maxIndex-1);
                maxIndex--;
                time++;
            }
        }
        
        
     System.out.println(time);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}