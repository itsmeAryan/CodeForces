import java.util.*;
public class  kString{
// itsmeAryan template v2.0.0
/*
Q name = A. k-String
Q link = https://codeforces.com/problemset/problem/219/A
*/
  public static void main(String[] args){ 
    kString instance =new  kString();
   Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();
   scan.nextLine();
   String s=scan.nextLine();
   int[]arr=new int[26];
   for(char c:s.toCharArray()){
    arr[(int)(c-'a')]++;
   }
   String res="";
   boolean f=true;
   for(int i=0;i<26;i++){
    int val=arr[i];
    if(val!=0&&val%n!=0){
      f=false;
      System.out.println("-1");
      break;
    }else if(val!=0){
      val=val/n;
      for(int j=0;j<val;j++){
              res+=(char)(i+97);
      }
    }
   }
if(f){
  String a="";
     for(int i=0;i<n;i++){
    a+=res;
   }
   System.out.println(a);
}
   scan.close();
  }
}