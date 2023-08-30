import java.util.*;
public class PetrandBook{
// itsmeAryan template v2.0.0
/*
Q name =  A. Petr and Book
Q link = https://codeforces.com/contest/139/problem/A
*/
  public static void main(String[] args){ 
   PetrandBook instance =new PetrandBook();
   Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();
   int[]arr=new int[7];
   for(int i=0;i<7;i++){
    arr[i]=scan.nextInt();
   }
   int i=0;
   while(n>0){
      i=i%arr.length;
      n-=arr[i];
      if(n>0){i++;}
   }
   System.out.println(i+1);
   scan.close();
  }
}