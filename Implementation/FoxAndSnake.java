import java.util.*;

public class FoxAndSnake {
  // itsmeAryan template v2.0.0
  /*
   * Q name = A. Fox And Snake
   * Q link = https://codeforces.com/problemset/problem/510/A
   */
  public static void main(String[] args){ 
   FoxAndSnake instance =new FoxAndSnake();
   Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();
   int m=scan.nextInt();
   scan.close();
   char mat[][]=new char[n][m];
   int f=m-1;
   for(int i=1;i<=n;i++){
   if(i%2==1){
   for(int j=0;j<m;j++){

     mat[i-1][j]='#';
    }}
    else{ 
      for(int j=0;j<m;j++){
        if(f==j){
            mat[i-1][f]='#';
            f=f==0?-1:0;
        }
        else{
          mat[i-1][j]='.';
        }
      }
      f=f==-1?m-1:f;
    }
   }
   for(char[]temp:mat){
    for(char c:temp){
      System.out.print(c+"");
    }
    System.out.println();
   }
  }
}