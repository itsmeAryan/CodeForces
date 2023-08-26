import java.util.*;
public class MeetingFriends{
// itsmeAryan template v2.0.0
/*
Q name = A. The New Year: Meeting Friends
Q link = https://codeforces.com/problemset/problem/723/A
*/
  public static void main(String[] args){ 
   MeetingFriends instance =new MeetingFriends();
   Scanner scan=new Scanner(System.in);
   int n1=scan.nextInt();
   int n2=scan.nextInt();
   int n3=scan.nextInt();
   scan.close();
   int val= Math.min(absolute(n1, n2)+absolute(n1, n3), Math.min(absolute(n2, n1)+absolute(n2, n3),absolute(n3, n1)+absolute(n3, n2)));
   System.out.println(val);
   
  }
  private static int absolute(int a,int b){
    return Math.abs(a-b);
  }
}