package recursion;

public class checkPalindrome {

    public static boolean isStringPalindrome(String s,int si,int ei) {

        if(si>ei){
            return true;
        }

        if(s.charAt(si)!=s.charAt(ei)){
            return false;
        }

        return isStringPalindrome(s,si+1,ei-1);

    }

        public static void main(String[] args) {
          String s="aeba";
            System.out.println(isStringPalindrome(s,0,s.length()-1));
    }
}
