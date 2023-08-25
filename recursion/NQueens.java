package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {

    public static List<String> construct(String arr[][]){

        List<String>ans=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
             String s="";
             for(int j=0;j<arr[0].length;j++){
                 s+=arr[i][j];
             }
             ans.add(s);
        }

//        System.out.println(ans);
        return ans;
    }

    public static boolean isSafe(String arr[][],int r,int c){

           for(int i=c-1;i>=0;i--){
               if(arr[r][i]=="Q"){
                   return false;
               }
           }

           int upr=r;
           int upc=c;

           while(upr>=0&&upc>=0){
               if(arr[upr][upc]=="Q"){
                   return false;
               }
               upr--;
               upc--;
           }

           int dr=r;
           int dc=c;

           while(dr<arr.length&&dc>=0){
               if(arr[dr][dc]=="Q"){
                   return false;
               }
               dr++;
               dc--;
           }
        return true;
    }

    public static void solve(String arr[][],int c,List<List<String>>list){

          if(c== arr.length){
              list.add(construct(arr));
              return;
          }

          for(int i=0;i< arr.length;i++){
              if(isSafe(arr,i,c)){
//                  System.out.println("hi");
                  arr[i][c]="Q";
                  solve(arr,c+1,list);
                  arr[i][c]=".";
              }
          }
    }

    public static List<List<String>> NQueens(int n){

        String arr[][]=new String[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=".";
            }
        }

        List<List<String>>list=new ArrayList<>();
        solve(arr,0,list);

        return list;
    }






    public static void main(String[] args) {
        List<List<String>>ans=NQueens(4);
        System.out.println(ans);
    }
}
