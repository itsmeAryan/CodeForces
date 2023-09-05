import java.util.*;

public class MiddleoftheContest {
    // itsmeAryan template v2.0.0
    /*
     * Q name =
     * Q link =
     */
    public static void main(String[] args) throws Exception {
        MiddleoftheContest instance = new MiddleoftheContest();
        Scanner scan = new Scanner(System.in);
        String s1[] = scan.nextLine().split(":");
        String s2[] = scan.nextLine().split(":");
        int h1 = Integer.parseInt(s1[0]);
        int h2 = Integer.parseInt(s2[0]);
        int m1 = Integer.parseInt(s1[1]);
        int m2 = Integer.parseInt(s2[1]);
        int total = (h2 - h1) * 60;
        total += m2 - m1;
        int half = (total / 2);
        int counter = 0;
        while (half >= 60) {
            half -= 60;
            counter++;
        }
        m1 += half;
        while (m1 >= 60) {
            counter++;
            m1 -= 60;
        }
        String s = (h1 + counter) + "";
        if (s.length() == 1) {
            s = "0" + s;
        }
        s += ":";
        if (("" + m1).length() == 1) {
            s += "0" + m1;
        } else
            s += m1;
        System.out.println(s);
        scan.close();
    }
}