import java.util.*;
public class SearchofanEasyProblem{
// itsmeAryan template v2.0.0
/*
Q name = A. In Search of an Easy Problem
Q link = https://codeforces.com/problemset/problem/1030/A
*/
  public static void main(String[] args){ 
   SearchofanEasyProblem instance =new SearchofanEasyProblem();
   Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();
   boolean t=false;
   while(n!=0){
    if(scan.nextInt()==1){
        t=true;
    }
    n--;
   }
   if(t){
    System.out.println("HARD");
   }else{
    System.out.println("EASY");
   }
  }
}