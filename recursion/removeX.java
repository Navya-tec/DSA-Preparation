package recursion;

public class removeX {

    public static String removeX(String s){

        if(s.length()==0){
            return "";
        }

        if(s.charAt(0)=='x'){
            return removeX(s.substring(1));
        }

        return s.charAt(0)+""+removeX(s.substring(1));
    }

    public static void main(String[] args) {
        String s="xaxbcx";
        System.out.println(removeX(s));
    }
}
