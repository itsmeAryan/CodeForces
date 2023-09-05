import java.util.*;

public class suffleHashing {
    // itsmeAryan template v2.0.0
    /*
     * Q name =A. Shuffle Hashing
     * Q link =https://codeforces.com/problemset/problem/1278/A
     */
    public static void main(String[] args) throws Exception {
        suffleHashing instance = new suffleHashing();
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        while (t != 0) {
            String str1 = scan.nextLine();
            char c[] = str1.toCharArray();
            Arrays.sort(c);
            str1 = String.copyValueOf(c);
            String str2 = scan.nextLine();
            boolean found = false;
            int len1 = str1.length();
            int len2 = str2.length();
            if (len1 <= len2) {
                for (int i = 0; i <= len2 - len1; i++) {
                    String rest = str2.substring(i, i + len1);
                    char cc[] = rest.toCharArray();
                    Arrays.sort(cc);
                    rest = String.copyValueOf(cc);
                    if (rest.equals(str1)) {
                        found = true;
                        break;
                    }
                }
            }
            printWithCondition(found, "YES", "NO");

            t--;
        }
        scan.close();
    }

    private static void printWithCondition(boolean condition, String a, String b) {
        if (condition) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}