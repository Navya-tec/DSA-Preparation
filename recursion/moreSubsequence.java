package recursion;

import java.util.ArrayList;
import java.util.List;

public class moreSubsequence {
    public static void generateSubsequences(String s,String ans,List<String>l) {
        // Write your code here
        if(s.length()==0){
            if(!l.contains(ans)){
                l.add(ans);
            }
            return;
        }

        String x=s.charAt(0)+"";

        generateSubsequences(s.substring(1),ans,l);
        generateSubsequences(s.substring(1),ans+x,l);

        return;
    }
    public static String moreSubsequence(int n, int m, String a, String b) {
        // Write your code here
        List<String>l1=new ArrayList<>();
        List<String >l2=new ArrayList<>();
        generateSubsequences(a,"",l1);
        generateSubsequences(b,"",l2);

        if(l2.size()>l1.size()){
            return b;
        }else{
            return a;
        }
    }

    public static void main(String[] args) {
        String a="f";
        String b="eeg";
        String s=moreSubsequence(a.length(),b.length(),a,b);
        System.out.println(s);
    }
}
