package recursion;

import java.util.ArrayList;
import java.util.List;

public class generateSubsequences {

    public static List<String>generateSubsequences(String s){

        List<String>list=new ArrayList<>();
        generateSubsequences(s,"",list);
        return list;
    }

    public static void generateSubsequences(String s,String ans,List<String>list) {
        // Write your code here
        if(s.length()==0){
            list.add(ans);
            return;
        }

        String x=s.charAt(0)+"";

         generateSubsequences(s.substring(1),ans+x,list);
         generateSubsequences(s.substring(1),ans,list);

         return;
    }

    public static void main(String[] args) {
        String s="abc";
        List<String>ans=generateSubsequences(s);
        System.out.println(ans);
    }
}
