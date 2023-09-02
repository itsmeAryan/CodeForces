import java.util.*;
public class TwoBinaryStrings{
// itsmeAryan template v2.0.0
/*
Q name = 
Q link = 
*/
  public static void main(String[] args) throws Exception{ 
   TwoBinaryStrings instance =new TwoBinaryStrings();
   Scanner scan=new Scanner(System.in);
   int t=scan.nextInt();
   scan.nextLine();
   while(t!=0){
    String str1=scan.nextLine();
    String str2=scan.nextLine();
    boolean f=false;
    for(int i=0;i<str1.length()-1;i++){
        char c1=str2.charAt(i);
                char c2=str1.charAt(i);
        if(c1==c2&&c1=='0'&&str1.charAt(i+1)=='1'&&str1.charAt(i+1)==str2.charAt(i+1)){
            f=true;
            break;
        }

    }
    printWithCondition(f, "YES", "NO");
   t--;
   }
   scan.close();
  }
  private static void printWithCondition(boolean condition,String a,String b){
      if(condition){
          System.out.println(a);
      }else {
          System.out.println(b);
      }
  }
}