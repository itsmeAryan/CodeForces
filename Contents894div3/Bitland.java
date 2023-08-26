package Contents894div3;
public class Bitland{
// itsmeAryan template v2.0.0
  public static void main(String[] args){ 
   Bitland instance =new Bitland();
   int x=0;
   scan.nextLine();
   while(t!=0){
     String val=scan.nextLine();
     if(val.equals("++X")||val.equals("X++")){
        ++x;
     }else{
        x--;
     }
       t--;
    }
    System.out.println(x);
  }
}