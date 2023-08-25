package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ratInMaze {


    public static void findPath(int[][] arr,int n,int vis[][],int r,int c, String s,ArrayList<String>ans){
        if(r==n-1&&c==n-1){
            ans.add(s);
            return;
        }

        //down
        if(r+1<n&&arr[r+1][c]!=0&&vis[r+1][c]!=1){
//            s+="D";
            vis[r][c]=1;
            findPath(arr,n,vis,r+1,c,s+"D",ans);
            vis[r][c]=0;
        }

        //right
        if(c+1<n&&arr[r][c+1]!=0&&vis[r][c+1]!=1){
//            s+="R";
            vis[r][c]=1;
            findPath(arr,n,vis,r,c+1,s+"R",ans);
            vis[r][c]=0;
        }

        //left
        if(c-1>=0&&arr[r][c-1]!=0&&vis[r][c-1]!=1){
//            s+="L";
            vis[r][c]=1;
            findPath(arr,n,vis,r,c-1,s+"L",ans);
            vis[r][c]=0;
        }

        //up
        if(r-1>=0&&arr[r-1][c]!=0&&vis[r-1][c]!=1){
//            s+="U";
            vis[r][c]=1;
            findPath(arr,n,vis,r-1,c,s+"U",ans);
            vis[r][c]=0;
        }

        return;
    }

    public static ArrayList<String> findPath(int[][] m, int n) {
        if(m[0][0]==0){
            ArrayList<String>ans=new ArrayList();
            return ans;
        }
        ArrayList<String>ans=new ArrayList<>();

        int vis[][]=new int[m.length][m[0].length];
        for(int i=0;i<vis.length;i++){
            for(int j=0;j<vis[0].length;j++){
                vis[i][j]=0;
            }
        }

        findPath(m,n,vis,0,0,"",ans);
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
//        int m[][]={{1, 0, 0, 0},
//                {1, 1, 0, 1},
//                {1, 1, 0, 0},
//                {0, 1, 1, 1}};
        int m[][]={{1,0}};
        ArrayList<String>ans=findPath(m,m.length);
        System.out.println(ans);
    }
}
