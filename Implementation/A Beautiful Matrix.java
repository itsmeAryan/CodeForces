import java.util.*;
public class BeautifulMat{
// itsmeAryan template v2.0.0
/*
 Q name=A. Beautiful Matrix
 Q link=https://codeforces.com/problemset/problem/263/A
 */  
  public static void main(String[] args){ 
   BeautifulMat instance =new BeautifulMat();
    Scanner scan=new Scanner(System.in);
    int[][]mat=new int[5][5];    
    int[][]visited=new int[5][5];

    for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            mat[i][j]=scan.nextInt();
        }
    }
System.out.println(    instance.dfs(mat, visited, 2, 2, 0));
    scan.close();
  }
  private int dfs(int[][]mat,int[][]visited,int i,int j,int tar){
    if(mat[i][j]==1)return tar;
    visited[i][j]=1;
    int min=Integer.MAX_VALUE;
    int directions[][]={{-1,0},{0,-1},{1,0},{0,1}};
    for(int direction[]:directions){
        int x=i+direction[0];        
        int y=j+direction[1];
        if(x>=0&&y>=0&&x<5&&y<5&&visited[x][y]!=1){
            min=Math.min(min,dfs(mat, visited, x, y, tar+1));
        }

    }
    visited[i][j]=0;
    return min;
  }
}

