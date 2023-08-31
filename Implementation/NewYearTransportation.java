import java.util.*;
public class NewYearTransportation{
// itsmeAryan template v2.0.0
/*
Q name = A. New Year Transportation
Q link = https://codeforces.com/contest/500/problem/A
*/
  public static void main(String[] args){ 
   NewYearTransportation instance =new NewYearTransportation();
   Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();
   int des=scan.nextInt();
    int[]arr=new int[n];
    scan.nextLine();
    for(int i=0;i<n-1;i++){
        arr[i]=scan.nextInt();
    }
    boolean f=false;
    int i=0;
    if(des==1)System.out.println("YES");
    else{

        while(i<n-1){
            i+=arr[i];
            if(i+1==des){
                f=true;
                break;
            }
        }
        if(f){
            System.out.println("YES");
        }else System.out.println("NO");
    }
    
}

}