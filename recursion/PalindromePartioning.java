package recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartioning {

    public static List<List<String>> partition(String str) {
        // Write your code here.

         List<List<String>>ans=new ArrayList<>();
         List<String>list=new ArrayList<>();
         PalindromeString(str,list,ans);
         return ans;
    }

    public static boolean isPalindrome(String x){

        int i=0,j=x.length()-1;

        while(i<=j){
            if(x.charAt(i)!=x.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
    public static void PalindromeString(String str,List<String>list,List<List<String>>ans){

        if(str.length()==0){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=1;i<=str.length();i++){
            String x=str.substring(0,i);
            if(isPalindrome(x)){
                list.add(x);
                PalindromeString(str.substring(i),list,ans);
                list.remove(list.size()-1);
            }
        }
        return;

    }

    public static void main(String[] args) {
         String str="aabb";
         List<List<String>>ans=partition(str);
        System.out.println(ans);

    }
}
