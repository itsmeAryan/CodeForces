package Contents;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chewbacca{
// itsmeAryan template v2.0.0
  public static void main(String[] args){ 
   Chewbacca instance =new Chewbacca();
  BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
    StringBuilder str=new StringBuilder();
    String s=read.readLine();
    for(int i=s.length()-1;i>=0;i--){
      char c=s.charAt(i);
      if(c>='5'){
        c=(char) ('9'-c+'0');
        if(i==0&&c=='0')c='9';
        str.insert(0, c);
      }
      else{
                str.insert(0, c);
      }
    }
    System.out.println((str.toString()));  
  }
  
}