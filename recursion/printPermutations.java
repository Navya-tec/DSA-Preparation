package recursion;

import java.util.List;

public class printPermutations {

    public static void permutations(String input, List<String> output){

        if(input.length()==0){
            System.out.println(output);
            return;
        }

        if(output.size()==0){
            for (int i=0;i<input.length();i++){
                output.add(input.charAt(i)+"");
            }
        }
         for(int i=0;i<input.length();i++){
             String x=input.charAt(i)+"";

             permutations(input.substring(1),output);

             
         }


    }
}
