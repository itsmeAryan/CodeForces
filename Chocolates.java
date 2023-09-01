import java.util.*;

public class Chocolates {
    // itsmeAryan template v2.0.0
    /*
     * Q name =B. Chocolates
     * Q link =https://codeforces.com/contest/1139/problem/B
     */
    public static void main(String[] args) throws Exception {
        Chocolates instance = new Chocolates();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextLong();
        }
        ArrayList<Long> set = new ArrayList<>();
        set.add((long) arr[n - 1]);
        for (int i = n - 2; i > 0; i--) {
            long curr = arr[i];
            Long prev = set.get(set.size() - 1);
            if (curr >= prev) {
                if (prev - 1 >= 0)
                    set.add(prev - 1);
            } else {
                set.add((long) curr);
            }
        }
        if(n>1){
            long curr = arr[0];
        Long prev = set.get(set.size() - 1);
        if (curr >= prev) {
            if (prev - 1 >= 0)
                set.add((long) (prev - 1));

        } else {
            set.add((long) curr);
        }
    }
    long sum = 0;
        for (long i : set)
            sum += i;
        System.out.println(sum);
    }
}