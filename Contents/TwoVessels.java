package Contents;
import java.util.*;
public class TwoVessels{
// itsmeAryan template v2.0.0
/*
Q name = 
Q link = 
*/
  public static void main(String[] args) throws Exception{ 
   TwoVessels instance =new TwoVessels();
   Scanner scan=new Scanner(System.in);
   int t=scan.nextInt();
   while(t!=0){
     int a=scan.nextInt();
           int b=scan.nextInt();
     int c=scan.nextInt();
     if(a==b){
        System.out.println(0);
     }else {
        int times=0;
        int max=Math.max(a, b);
        int min=Math.min(a, b);
        while(max>min){
            max-=c;
            min+=c;
            times++;
        }
        System.out.println(times);
     }
   t--;
   }
   scan.close();
   
  }
}