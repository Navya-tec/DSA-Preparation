import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class wordbreak {

    public static boolean wordBreak(int i,String s, List<String> wordDict) {

        if (i == s.length()) return true;
        String temp = "";
        for (int j = i; j < s.length(); j++) {
            temp += s.charAt(j) + "";

            if (wordDict.contains(temp)) {

                if (wordBreak(j + 1, s, wordDict)) return true;
            }
        }
    return false;
    }

    public static void main(String[] args) {
        List<String>wordDict=new ArrayList<>();
//        wordDict.add("leet");
//        wordDict.add("code");
//        wordDict.add("apple");
//        wordDict.add("pen");
//        wordDict.add("cats");
//        wordDict.add("sand");
//        wordDict.add("dog");
//        wordDict.add("and");
//        wordDict.add("cat");
        wordDict.add("aaaa");
        wordDict.add("aaa");

        String s="leetcode";
        String s1="applepenapple";
        String s2="catsandog";

        String s3="aaaaaaa";

        System.out.println(wordBreak(0,s3,wordDict));
    }
}
