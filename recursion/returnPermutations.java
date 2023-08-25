package recursion;

public class returnPermutations {

    public static String[] permutationOfString(String input){

        if(input.length()==0){
            return new String[0];
        }
        if(input.length()==1){
            String s[]=new String[1];
            s[0]=input.charAt(0)+"";
            return s;
        }

        String small[]=permutationOfString(input.substring(1));

        String ans[]=new String[(small[0].length()+1)* small.length];
        int k=0;
        for(int i=0;i<small.length;i++){

            String a=small[i];

            for(int j=0;j<=a.length();j++){
                String x=input.charAt(0)+"";
                ans[k]=a.substring(0,j)+x+a.substring(j);
                k++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s="abc";
        String ans[]=permutationOfString(s);
        for(String a:ans){
            System.out.println(a);
        }
    }
}
