package Contents;
public class TwoSum{
// itsmeAryan template v2.0.0
  public static void main(String[] args){ 
   TwoSum instance =new TwoSum();
    
  }
  protected void solve(String n){
    String left="",right="";
    boolean flag=false;
    for(int i=0;i<n.length();i++){
       int t=n.charAt(i)-'0';
       if(t%2==0){
          left+=t/2;
          right+=t/2;
       }else{
          if(flag){
             right+=t/2+1;
             left+=t/2;
             flag=false;
          }
          else{
             left+=t/2+1;
             right+=t/2;
             flag=true;
          }
       }
       
    }
    System.out.println(Integer.parseInt(left)+" "+Integer.parseInt(right));
 }
}