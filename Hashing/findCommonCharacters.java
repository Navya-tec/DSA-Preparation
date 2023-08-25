package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findCommonCharacters {

    public static List<String> commonChars(String[] words) {

        List<String>ans=new ArrayList<>();

        HashMap<Character,Integer>mainmap=new HashMap<>();
        for (char ch = 'a'; ch <= 'z'; ++ch)
        {
            mainmap.put(ch, 1000);
        }

        for(int j=0;j< words.length;j++){

            String word=words[j];

            HashMap<Character,Integer>map=new HashMap<>();

            for(int k=0;k<word.length();k++){
                map.put(word.charAt(k),map.getOrDefault(word.charAt(k),0)+1);
            }

             for(Character key:mainmap.keySet()){
                 int min=Math.min(mainmap.get(key),map.getOrDefault(key,0));
                 mainmap.put(key,min);
             }

        }

        for(Character key:mainmap.keySet()){
            if(mainmap.get(key)>0){
                for(int l=0;l<mainmap.get(key);l++){
                    ans.add(key+"");
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        String s[]={"bella","label","roller"};
      List<String>ans=commonChars(s);
        System.out.println(ans);

    }
}
