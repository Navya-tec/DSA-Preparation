package recursion;

import java.util.ArrayList;

public class generateParenthesis {

    public static ArrayList<String> validParenthesis(int n){
        // Write your code here.
        ArrayList<String>ans=new ArrayList<>();
        generateParenthesis(n,"",ans,0,0);
        return ans;
    }

    public static void generateParenthesis(int n,String s,ArrayList<String>ans,int open,int close){

        if(close==n){
            ans.add(s);
            return;
        }

        if(open<n){
            generateParenthesis(n,s+"(",ans,open+1,close);
        }

        if(open>close){
            generateParenthesis(n,s+")",ans,open,close+1);
        }
        return;
    }
    public static void main(String[] args) {
        ArrayList<String>ans=validParenthesis(3);
        System.out.println(ans);
    }
}
