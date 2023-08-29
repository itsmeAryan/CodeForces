import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class GennadyandaCardGame{
// itsmeAryan template v2.0.0
/*
Q name = A. Gennady and a Card Game
Q link = https://codeforces.com/problemset/problem/1097/A
*/
  public static void main(String[] args) throws IOException{ 
   GennadyandaCardGame instance =new GennadyandaCardGame();
   Scanner read = new Scanner(System.in);
   String str = read.nextLine();
   String[] arr = read.nextLine().split(" "); 
        read.close();
        boolean f = false;
   for(String temp:arr){
    if(temp.charAt(0)==str.charAt(0)||temp.charAt(1)==str.charAt(1)){
        f=true;
        break;
    }
   }
   if(f){
    System.out.println("YES");
   }
   else System.out.println("NO");
   
   
  }
}