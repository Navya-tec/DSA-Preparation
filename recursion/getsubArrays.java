package recursion;

import java.util.ArrayList;
import java.util.List;

public class getsubArrays {

    public static List<List< Integer >> subarraysWithSumK(int []a,int i) {
        // Write your code here
       if(i==a.length-1){
           List<List< Integer >>ans=new ArrayList<>();
           List<Integer>s=new ArrayList<>();
           s.add(a[i]);
           return ans;
       }

       List<List<Integer>>small=subarraysWithSumK(a,i+1);

       List<List<Integer>>ans=new ArrayList<>();
       ans.add(new ArrayList<>(a[i]));

       for(int k=0;k<small.size();k++){
           ans.add(small.get(k));
       }

       return ans;
    }



    public static void main(String[] args) {
       int a[]={1,2,3};
        List<List< Integer >>ans=subarraysWithSumK(a,0);
        System.out.println(ans);
    }
}
