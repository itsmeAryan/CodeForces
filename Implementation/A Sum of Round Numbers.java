import java.util.*;
public class RoundNumbers{
// itsmeAryan template v2.0.0
/*
Q name = A. Sum of Round Numbers
Q link = https://codeforces.com/problemset/problem/1352/A
*/
  public static void main(String[] args){ 
   RoundNumbers instance =new RoundNumbers();
   Scanner scan=new Scanner(System.in);
   int t=scan.nextInt();
    while(t!=0){
        int n=scan.nextInt();
        if(n<=9){
            System.out.println(1);
            System.out.println(n);}
        else instance.solve(n+"");
        t--;
    }
    scan.close();
  }
  private void solve(String s){
    int n=s.length();
    ArrayList<Integer>list=new ArrayList<>();
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c=='0')continue;
        list.add((int) (((int)(c-'0'))*Math.pow(10, n-(i+1))));
    }
    System.out.println(list.size());
    for(int i:list){
        System.out.print(i+" ");
    }
    System.out.println();
  }
}