import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BoyorGirl{
// itsmeAryan template v2.0.0
/*
Q name = A. Boy or Girl
Q link = https://codeforces.com/problemset/problem/236/A
*/
  public static void main(String[] args) throws IOException{ 
   BoyorGirl instance =new BoyorGirl();
  
   BufferedReader read=new BufferedReader(new InputStreamReader(System.in) );
   String str=read.readLine();
   int evenCount=0;
   int arr[]=new int[26];
   for(char c:str.toCharArray()){
    int i=((int)c-'a')+1;
    if(arr[i-1]==0){
    arr[i-1]=1;
    evenCount++;
    }
   }
   if(evenCount%2==0)System.out.println("CHAT WITH HER!");
   else System.out.println("IGNORE HIM!");
  }
}