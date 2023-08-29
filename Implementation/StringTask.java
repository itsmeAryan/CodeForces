import java.util.*;
public class StringTask{
// itsmeAryan template v2.0.0
/*
Q name = A. String Task
Q link = https://codeforces.com/problemset/problem/118/A
*/
  public static void main(String[] args){ 
   StringTask instance =new StringTask();
   Scanner scan=new Scanner(System.in);
   String n=scan.nextLine().toLowerCase();
   scan.close();
   String res="";
   for(int i=0;i<n.length();i++){
    char c=n.charAt(i);
    if(c=='a'||c=='o'||c=='y'||c=='e'||c=='u'||c=='i')continue;
    res+="."+n.charAt(i);
   }
   System.out.println(res);
  }
}