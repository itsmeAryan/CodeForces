import java.util.*;
public class BearandBigBrother{
// itsmeAryan template v2.0.0
/*
Q name = Bear and Big Brother
Q link = https://codeforces.com/problemset/problem/791/A
*/
  public static void main(String[] args){ 
   BearandBigBrother instance =new BearandBigBrother();
   Scanner scan=new Scanner(System.in);
   int limakWeight=scan.nextInt();
   int bobWeight=scan.nextInt();
   scan.close();
   int i=1;
   while(true){
    //brute force
    bobWeight*=2;
    limakWeight*=3;
    if(limakWeight>bobWeight)break;
    i++;
   }
   System.out.println(i);
  }
}