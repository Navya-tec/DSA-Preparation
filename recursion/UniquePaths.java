package recursion;

import java.util.ArrayList;

public class UniquePaths {

    public static int uniquePaths(int m, int n) {
       int arr[][]=new int[m][n];
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               arr[i][j]=0;
           }
       }

       int r=0,c=0;
       ArrayList<String>ans= new ArrayList<>();
       uniquePaths(arr,r,c,"",ans,m,n);
        System.out.println(ans);
       return ans.size();
    }

    public static void uniquePaths(int arr[][],int r,int c,String s,ArrayList<String>ans,int m,int n){

        if(r==m-1&&c==n-1){
//            System.out.println("hi");
            ans.add(s);
            return;
        }

        //right
        if(c+1<n){
            uniquePaths(arr,r,c+1,s+"R",ans,m,n);
        }

        //down
        if(r+1<m){
            uniquePaths(arr,r+1,c,s+"D",ans,m,n);
        }

        return;
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
    }

}
