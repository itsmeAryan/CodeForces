import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class HelpfulMaths{
// itsmeAryan template v2.0.0
/*
Q name = A. Helpful Maths
Q link = https://codeforces.com/problemset/problem/339/A
*/
  public static void main(String[] args) throws IOException{ 
   HelpfulMaths instance =new HelpfulMaths();
    BufferedReader read=new BufferedReader(new InputStreamReader(System.in) );
   String str[]=read.readLine().split("\\+");
    int low=0,mid=0,high=str.length-1;
    while(mid<=high){
        //Dutch flag algorithm
        if(str[mid].equals("1")){
            instance.swap(str,mid,low);
            mid++;low++;
        }else if(str[mid].equals("3")){
                        instance.swap(str,mid,high);
                        high--;

        }else mid++;
    }
    for(int i=0;i<str.length;i++){
        if(i==str.length-1){
            System.out.print(str[i]);
        }else{
                        System.out.print(str[i]+"+");

        }
    }
    System.out.println();
  }
  private void swap(String str[],int i ,int j){
    String temp=str[i];
    str[i]=str[j];
    str[j]=temp;
  }
}