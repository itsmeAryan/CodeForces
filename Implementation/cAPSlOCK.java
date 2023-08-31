import java.util.*;
public class cAPSlOCK{
// itsmeAryan template v2.0.0
/*
Q name = A. cAPS lOCK
Q link = https://codeforces.com/problemset/problem/131/A
*/
  public static void main(String[] args){ 
   cAPSlOCK instance =new cAPSlOCK();
   Scanner scan=new Scanner(System.in);
   String s=scan.nextLine();
   if(s.length()>=1 && s.length()<= 100) {
    boolean allUpperCase = true;

    for (int i = 1; i < s.length(); i++) {
        if (Character.isLowerCase(s.charAt(i))) {
            allUpperCase = false;
            break;
        }
    }
    

    if (allUpperCase) {
        if (Character.isLowerCase(s.charAt(0))) {
           
            s= Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
        } else {
          
            s= s.toLowerCase();
        }
    }

   
   System.out.println(s);  }
   scan.close();
  }
}