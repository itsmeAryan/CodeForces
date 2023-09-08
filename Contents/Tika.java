package Contents;
import java.util.ArrayList;
import java.util.Scanner;
public class Tika{
// itsmeAryan template v2.0.0
  public static void main(String[] args){ 
   Tika instance =new Tika();
    Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        while (t-- > 0) {
            int n = scan.nextInt();
            ArrayList<Integer> v = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                v.add(scan.nextInt());
            }
            
           instance.Solve(v,n);
        }
        scan.close();
  }
private void Solve(ArrayList<Integer>v,int n){
     ArrayList<Integer> output = new ArrayList<>();
            output.add(v.get(0));
            
            for (int i = 1; i < n; i++) {
                if (v.get(i - 1) > v.get(i)) {
                    output.add(1);
                    output.add(v.get(i));
                } else {
                    output.add(v.get(i));
                }
            }
            
            System.out.println(output.size()+"------------------------------------");
            for (int i = 0; i < output.size(); i++) {
                System.out.print(output.get(i) + " ");
            }
            System.out.println();
}
// Accepted Code

}