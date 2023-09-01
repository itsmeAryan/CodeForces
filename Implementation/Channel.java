import java.util.*;

public class Channel {
    // itsmeAryan template v2.0.0
    /*
     * Q name =A. Channel
     * Q link =https://codeforces.com/contest/1863/problem/A
     */
    public static void main(String[] args) {
        Channel instance = new Channel();
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t != 0) {
            int totalSubscriber = scan.nextInt();
            int online = scan.nextInt();
            int notifications = scan.nextInt();
            scan.nextLine();
            String str = scan.nextLine();
            boolean allRead = false;
            if (totalSubscriber == online)
                allRead = true;
            int active = online;
            for (char c : str.toCharArray()) {
                if (c == '+')
                    active++;
                else
                    active--;
                if (active == totalSubscriber) {
                    allRead = true;
                }
            }
            int partialActive = online;
            for (char c : str.toCharArray()) {
                if (c == '+')
                    partialActive++;
            }
            if (allRead) {
                System.out.println("YES");
            } else if (partialActive >= totalSubscriber) {
                System.out.println("MAYBE");
            } else
                System.out.println("NO");
            t--;
        }

    }
}