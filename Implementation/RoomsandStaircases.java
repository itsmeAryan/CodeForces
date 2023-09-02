import java.util.*;
public class RoomsandStaircases{
// itsmeAryan template v2.0.0
/*
Q name = B. Rooms and Staircases
Q link = https://codeforces.com/contest/1244/problem/B
*/
  public static void main(String[] args) throws Exception{ 
   RoomsandStaircases instance =new RoomsandStaircases();
Scanner scan=new Scanner(System.in);
int t=scan.nextInt();
while(t!=0){
  int n=scan.nextInt();
   scan.nextLine();
   String s=scan.nextLine();
  int leftZero=0;
  int rightZero=0;
  int ans=n;//if we cant visit 2nd floor then we can visit first floor
  //check if we can visit 2nd floor or not
  for(int i=0;i<n;i++){
    if(s.charAt(i)=='1'){
      leftZero=i+1;//we can visit 2nd floor now
      break;
    }
  }
  for(int i=n-1;i>=0;i--){
    if(s.charAt(i)=='1'){
      rightZero=i+1;
      break;
    }
  }
  if(leftZero!=0){
    int sum=2*(rightZero-leftZero+1);
    sum+=2*Math.max(leftZero-1,n-rightZero);
    ans=Math.max(ans, sum);
  }
  System.out.println(ans);
  t--;
  }
}
}