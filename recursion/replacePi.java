package recursion;

public class replacePi {

    public static String replace(String s,int i){
        if(i>=s.length()){
            return "";
        }

        if(s.charAt(i)=='p'&&i+1<s.length()&&s.charAt(i+1)=='i'){
             String small=3.14+replace(s,i+2);
             return small;
        }

        return s.charAt(i)+replace(s,i+1);
    }

    public static void main(String[] args) {
        String s="abpip";
        System.out.println(replace(s,0));
    }
}
