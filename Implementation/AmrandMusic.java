import java.util.*;

public class AmrandMusic {
  // itsmeAryan template v2.0.0
  /*
   * Q name =A. Amr and Music
   * Q link =https://codeforces.com/problemset/problem/507/A
   */
  static class Pair{
    int node,data;
    public Pair(int i,int d){
      node=i;
      data=d;
    }
  }
  public static void main(String[] args) throws Exception {
    AmrandMusic instance = new AmrandMusic();
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int max = scan.nextInt();
    Pair[] arr = new Pair[n];
    for (int i = 0; i < n; i++) {
      
      arr[i] = new Pair(i+1,scan.nextInt());
    }
    scan.close();
    Arrays.sort(arr,(a,b)->a.data-b.data);
    ArrayList<Integer>list=new ArrayList<>();
    for(Pair p:arr){
      if(p.data>max)break;
      max-=p.data;
      list.add(p.node);
    }
    System.out.println(list.size());
    for(int i:list){
      System.out.print(i+" ");
    }


  }

 
}