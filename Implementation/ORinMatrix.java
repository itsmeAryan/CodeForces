import java.util.*;

public class ORinMatrix {
    // itsmeAryan template v2.0.0
    /*
     * Q name =B. OR in Matrix
     * Q link =https://codeforces.com/problemset/problem/486/B
     */
    public static void main(String[] args) throws Exception {
        ORinMatrix instance = new ORinMatrix();
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] a = new int[m][n], b = new int[m][n];
        for (int i = 0; i < m; i++) {// take input from user
            for (int j = 0; j < n; j++) {
                b[i][j] = scan.nextInt();
                a[i][j] = 1;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (b[i][j] == 0) {// if we are getting zero then filled row and col with zero
                    // filled row with 0
                    for (int k = 0; k < n; k++) {
                        a[i][k] = 0;
                    }
                    for (int k = 0; k < m; k++) {
                        a[k][j] = 0;
                    }

                }
            }
        }
        boolean didMistake=false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (b[i][j] == 1) {// if we are getting zero then filled row and col with zero
                    // filled row with 0
                    boolean flag=false;
                    for (int k = 0; k < n; k++) {
                        if(a[i][k]==1){
                            flag=true;break;
                        }
                    }
                    for (int k = 0; k < m; k++) {
                        if(a[k][j]==1){
                            flag=true;break;
                        }
                    }
                    if(flag==false){
                        didMistake=true;
                        break;
                    }

                }
            }
            if(didMistake)break;
        }
        if(didMistake)System.out.println("NO");
        else{
            System.out.println("YES");
            for(int temp[]:a){
                for(int i:temp){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }

    }
}