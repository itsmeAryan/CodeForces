import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class WordCapitalization{
// itsmeAryan template v2.0.0
/*
Q name = A. Word Capitalization
Q link = https://codeforces.com/problemset/problem/281/A
*/
  public static void main(String[] args) throws IOException{ 
   WordCapitalization instance =new WordCapitalization();
   Scanner scan=new Scanner(System.in);
   BufferedReader read=new BufferedReader(new InputStreamReader(System.in) );
   String str=read.readLine();
   int n=str.charAt(0);
   if(n>=97){
    str=(char)(n-32)+str.substring(1);
   }
   System.out.println(str);
  }
}