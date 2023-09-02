import java.util.*;
public class PrimeDeletion{
// itsmeAryan template v2.0.0
/*
Q name = A. Prime Deletion
Q link = https://codeforces.com/contest/1861/problem/A
*/
  public static void main(String[] args)throws Exception{ 
   PrimeDeletion instance =new PrimeDeletion();
   Scanner scan=new Scanner(System.in);
   int t=scan.nextInt();
   scan.nextLine();
    while(t!=0){
         String s=scan.nextLine();
         if(s.indexOf("1")<s.indexOf("7")){
            System.out.println("17");
            
         }else{
            System.out.println("71");
         }
        t--;
    }
    scan.close();
  }
}