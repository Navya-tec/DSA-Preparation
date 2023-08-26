package Hashing;

import java.util.HashMap;
import java.util.Map;

public class longestPalindrome {

    public static int longestPalindromeofString(String[] words) {

        HashMap<String ,Integer>map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        int count=0;
         int c=0;
        for(int i=0;i<words.length;i++){
            String word=words[i];
            String str=new StringBuilder(word).reverse().toString();

            if(word.equals(str)){
                int val=map.get(word);

                if(val%2!=0){val-=1;c=1;}

                count+=2*val;
                map.put(word,map.get(word)-val);
            }
            else if(map.containsKey(str)){
                int min=Math.min(map.get(word), map.get(str));
                count+=4*min;
                map.put(word,map.get(word)-min);
                map.put(str,map.get(str)-min);
            }
        }

         return c==1?count+2:count;
    }
    public static void main(String[] args) {
        String words[]={"cc","cc","cc","ab","ba","rr"};
        System.out.println(longestPalindromeofString(words));
    }
}
