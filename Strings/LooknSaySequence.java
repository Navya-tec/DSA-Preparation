package Strings;

import java.util.HashMap;

public class LooknSaySequence {

    public static String lookAndSaySequence(int n) {
        String s0="1";
        String s1="11";
        String prev=s1;
        for(int i=2;i<n;i++){
          //generate string
            String str="";
            int j=0;
            int count=1;
            while(j+1<prev.length()){
                if(prev.charAt(j)==prev.charAt(j+1)){
                    count++;
                }else{
                    String small=count+""+prev.charAt(j);
                    str+=small;
                    count=1;
                }
                j++;
            }

            str+=count+""+prev.charAt(j);
            prev=str;
        }
        return prev;
    }

    public static void main(String[] args) {
        System.out.println(lookAndSaySequence(6));
    }
}
