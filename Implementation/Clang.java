import java.util.*;
public class Clang{
// itsmeAryan template v2.0.0
/*
Q name = A. C+=
Q link = https://codeforces.com/problemset/problem/1368/A
*/
  public static void main(String[] args){ 
   Clang instance =new Clang();
   Scanner scan=new Scanner(System.in);
   int t=scan.nextInt();
   while(t!=0){
    int a=scan.nextInt();
    int b=scan.nextInt();
    int target=scan.nextInt();
    int min=0;
   
    while(b<=target&&a<=target){
        if(a<b){
            a= a+b;
        }
        else{
            b = b+a;
        }
       min++;
    }
    System.out.println(min);
    t--;
   }
   scan.close();
  }
}