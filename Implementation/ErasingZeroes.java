import java.util.*;
public class ErasingZeroes{
// itsmeAryan template v2.0.0
/*
Q name = A. Erasing Zeroes
Q link = https://codeforces.com/problemset/problem/1303/A
*/
  public static void main(String[] args){ 
   ErasingZeroes instance =new ErasingZeroes();
   Scanner scan=new Scanner(System.in);
   int t=scan.nextInt();
   scan.nextLine();
   while(t!=0){
    String s=scan.nextLine();
        int i=0,j=s.length()-1;
        while(i<s.length()&&s.charAt(i)!='1')i++;        
        while(j>=0&&s.charAt(j)!='1')j--;
        int numZero=0;
        for(;i<=j;i++){
            if(s.charAt(i)=='0')numZero++;
        }
        System.out.println(numZero);

    t--;
   }
   scan.close();
  }
}