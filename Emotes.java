import java.util.*;
    import java.math.BigInteger;
public class Emotes {
    // itsmeAryan template v2.0.0
    /*
     * Q name =B. Emotes
     * Q link =https://codeforces.com/problemset/problem/1117/B
     */

    

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            BigInteger maxTime = scan.nextBigInteger(); // Use BigInteger
            int k = scan.nextInt();
            BigInteger[] arr = new BigInteger[n]; // Use BigInteger
            BigInteger max1 = BigInteger.ZERO;
            BigInteger max2 = BigInteger.ZERO;
            
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextBigInteger(); // Use BigInteger
                if (arr[i].compareTo(arr[max1.intValue()]) > 0) {
                    max2 = max1;
                    max1 = BigInteger.valueOf(i);
                } else if (arr[i].compareTo(arr[max2.intValue()]) > 0) {
                    max2 = BigInteger.valueOf(i);
                }
            }
            
            BigInteger useMax2 = maxTime.divide(BigInteger.valueOf(k + 1)); // Use BigInteger
            BigInteger useMax1 = maxTime.subtract(useMax2); // Use BigInteger
            BigInteger result = useMax1.multiply(arr[max1.intValue()])
                    .add(useMax2.multiply(arr[max2.intValue()]));
            
            System.out.println(result);
        }
    
}