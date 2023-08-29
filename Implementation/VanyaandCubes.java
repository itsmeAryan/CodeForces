import java.util.*;
public class VanyaandCubes{
// itsmeAryan template v2.0.0
/*
Q name = A. Vanya and Cubes
Q link =https://codeforces.com/problemset/problem/492/A 
*/
  public static void main(String[] args){ 
   VanyaandCubes instance =new VanyaandCubes();
   Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();
   scan.close();
   int res=1,prev=1,counter=0;
   while(res<=n){
    //basic maths
    res=((prev*prev)+prev)/2;
    if(res>n)break;
    n-=res;
    prev++;
    counter++;
   }
   System.out.println(counter);
  }
}