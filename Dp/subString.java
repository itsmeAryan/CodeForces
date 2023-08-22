package Dp;
import java.util.Arrays;
import java.util.Scanner;

public class subString {
    /*Q1. name =QAQ
     *Q link=https://codeforces.com/problemset/problem/894/A 
     */
public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
    String string=scan.nextLine();
    scan.close();
    System.out.println(new subString().findLength(string,"QAQ","",0));
}
protected int findLength(String str,String tar,String sum,int i){
    if(i==str.length()-1||sum.equals(tar)){
        if(sum.equals(tar)||tar.equals(sum+str.charAt(i)))return 1;
        return 0;
    }
    int a=0;
    if(sum.length()<=3){
        a=findLength(str, tar, sum+str.charAt(i), i+1);
    }
    return  a+findLength(str, tar, sum, i+1);
}
}
