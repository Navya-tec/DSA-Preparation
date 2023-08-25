package recursion;

import java.util.ArrayList;
import java.util.List;

public class wordSearch {

    public static boolean exist(char[][] board, String word) {

        int vis[][]=new int[board.length][board[0].length];
        for(int i=0;i<vis.length;i++){
            for(int j=0;j<vis[0].length;j++){
                vis[i][j]=0;
            }
        }
        for(int i=0;i< board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)&&wordMatch(0,i,j,board,word,"",vis)){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean wordMatch(int i,int r,int c,char[][]board, String word,String s,int vis[][]){

        if(i==word.length()){
            if(s.equals(word)){
                return true;
            }
            return false;
        }

       if(r==board.length||c==board[0].length||r<0||c<0||word.charAt(i)!=board[r][c]||vis[r][c]==1){
           return false;
       }


        vis[r][c]=1;
        if(wordMatch(i+1,r-1,c,board,word,s+word.charAt(i),vis) ||
                wordMatch(i+1,r+1,c, board,word,s+word.charAt(i),vis) ||
                wordMatch(i+1,r,c-1, board,word,s+word.charAt(i),vis) ||
                wordMatch(i+1,r,c+1,board,word,s+word.charAt(i),vis)){
            return true;
        }
        vis[r][c]=0;
      return false;
    }

    public static void main(String[] args) {

        char board[][]={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word="SEE";
        boolean ans=exist(board,word);
        System.out.println(ans);
    }
}
