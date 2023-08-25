package recursion;

import java.util.ArrayList;
import java.util.List;

public class uniquePaths2 {

     public static void helper(int[][] arr, int r, int c, String s, List<String>ans){

        if(r==arr.length-1&&c==arr[0].length-1){
            if(!s.isEmpty()){
                ans.add(s);
            }
            return;
        }

        //down
        if(r+1<arr.length&&arr[r+1][c]==0){

            helper(arr,r+1,c,s+"D",ans);

        }

        //right
        if(c+1<arr[0].length&&arr[r][c+1]==0){

            helper(arr,r,c+1,s+"R",ans);

        }

        return;
    }
    public static int uniquePathsWithObstacles(int[][] arr) {
        int m=arr.length-1;
        int n=arr[0].length-1;

        if(m==0&&n==0&&arr[m][n]==0){
            return 1;
        }
        if(arr[m][n]==1){
            return 0;
        }
        List<String>ans=new ArrayList<>();
        helper(arr,0,0,"",ans);
        return ans.size();
    }

    public static void main(String[] args) {
      int arr[][]={{0}};
        System.out.println(uniquePathsWithObstacles(arr));
    }
}
