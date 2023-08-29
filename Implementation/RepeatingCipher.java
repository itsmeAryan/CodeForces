import java.util.*;
public class RepeatingCipher{
// itsmeAryan template v2.0.0
/*
Q name = A. Repeating Cipher
Q link = https://codeforces.com/problemset/problem/1095/A
*/
  public static void main(String[] args){ 
   RepeatingCipher instance =new RepeatingCipher();
   Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();
   scan.nextLine();
   String s=scan.nextLine();
   int i=1,prev=1;
   String res="";
   while(i<=n){
     i=(prev*prev+1)/2;
     if(i>n)break;
     res+=s.charAt(i-1);
     prev++;
   }
   System.out.println(res);
  }
}