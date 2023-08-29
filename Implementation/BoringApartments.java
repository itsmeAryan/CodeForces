import java.util.*;
public class BoringApartments{
// itsmeAryan template v2.0.0
/*
Q name = A. Boring Apartments
Q link = https://codeforces.com/problemset/problem/1433/A
*/
  public static void main(String[] args){ 
   BoringApartments instance =new BoringApartments();
   Scanner scan=new Scanner(System.in);
   int t=scan.nextInt();
    while(t!=0){
       String num=scan.nextInt()+"";
        int n=num.charAt(0)-49;
        n*=10;
        System.out.println(n+num.length()*(num.length()+1)/2);
        
        t--;
    }
    scan.close();
  }
}