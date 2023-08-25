package recursion;

public class stringToInteger {

    public static int convertStringToInt(String s){

        if(s.length()==1){
            return Integer.parseInt(s);
        }

        int small=convertStringToInt(s.substring(0,s.length()-1));
        int x=s.charAt(s.length()-1)-'0';
        return 10*small+x;
    }

    public static void main(String[] args) {
        String s="0001232";
        System.out.println(convertStringToInt(s));
    }
}
