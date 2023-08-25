package recursion;

import java.util.ArrayList;

public class subsequence2 {

    public static ArrayList<String> subsequences(String str) {
        // Write your code here
        if(str.length()==0){
            ArrayList<String>ans=new ArrayList<>();
            return ans;
        }
        String a=str.charAt(0)+"";
        ArrayList<String>small=subsequences(str.substring(1));

        ArrayList<String>ans=new ArrayList<>(small);
        ans.add(a);

        for(int i=0;i<small.size();i++){
            String y=a+small.get(i);
            ans.add(y);
        }

        return ans;
    }

    public static void main(String[] args) {
        String str="abc";
       ArrayList<String>ans=subsequences(str);
        System.out.println(ans);
    }
}
