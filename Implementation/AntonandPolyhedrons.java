import java.util.*;
public class AntonandPolyhedrons{
// itsmeAryan template v2.0.0
/*
Q name = A. Anton and Polyhedrons
Q link = https://codeforces.com/problemset/problem/785/A
*/
  public static void main(String[] args){ 
   AntonandPolyhedrons instance =new AntonandPolyhedrons();
   Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();
   int sum=0;
   scan.nextLine();
   while(n!=0){
    String s=scan.nextLine();
    if("Tetrahedron".equals(s)){
        sum+=4;
    }else if("Cube".equals(s)){
        sum+=6;
    }else if("Octahedron".equals(s)){
        sum+=8;
    }else if("Dodecahedron".equals(s)){
        sum+=12;
    }
    else{
        sum+=20;
    }
    n--;
   }
   scan.close();
   System.out.println(sum);
  }
}