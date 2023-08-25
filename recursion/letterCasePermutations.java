package recursion;

import java.util.ArrayList;
import java.util.List;

public class letterCasePermutations {

    public static List<String> letterCasePermutation(String s) {

        if(s.length()==0){
            List<String>ans=new ArrayList<>();
            return ans;
        }

        if(s.length()==1){
            List<String>ans=new ArrayList<>();
            ans.add(s);
            if(!s.matches(".*\\d.*")){
                ans.add(s.toUpperCase());
                ans.add(s.toLowerCase());
            }else{
                ans.add(s);
            }
            return ans;
        }
        String x=s.charAt(0)+"";
        List<String>small=letterCasePermutation(s.substring(1));
        if(x.matches(".*\\d.*")){
            List<String>ans=new ArrayList<>();
            for(int i=0;i<small.size();i++){
                String str=small.get(i);
                str=x+str;
                ans.add(str);
            }
            return ans;
        }
        else{
            List<String>ans=new ArrayList<>();
            for(int i=0;i<small.size();i++){
                String str=small.get(i);
                str=x.toLowerCase()+str;
                ans.add(str);
            }

            for(int i=0;i<small.size();i++){
                String str=small.get(i);
                str=x.toUpperCase()+str;
                ans.add(str);
            }
            return ans;
        }

    }

    public static void main(String[] args) {
        String s="a1b2";
        List<String>ans=letterCasePermutation(s);
        System.out.println(ans);
    }
}
