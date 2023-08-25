package recursion;

import java.util.ArrayList;
import java.util.List;

public class binaryStringWithNoConsecutiveOnes {

    public static List< String > generateString(int N) {
        // Write your code here.
        List<String>ans=new ArrayList<>();
        generateString(N,"",ans);
        return ans;
    }

    public static void generateString(int n,String s,List<String>ans){

        if(n==0){
            ans.add(s);
            return;
        }

        generateString(n-1,s+'0',ans);
        s=s+'1';
        if(s.length()>1&&s.charAt(s.length()-2)=='1'&&s.charAt(s.length()-1)=='1'){
            return;
        }
        generateString(n-1,s,ans);
        return;
    }

    public static void main(String[] args) {
       List<String>ans=generateString(2);
        System.out.println(ans);
    }
}
