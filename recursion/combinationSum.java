package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class combinationSum {

    public static void combSum(int []arr, int B,List<List<Integer>>ans,List<Integer>small,int i) {
        // Write your code here.
        if(B<0){
            return;
        }
        if(B==0){
            ans.add(new ArrayList<>(small));
            return;
        }

        for(int k=i;k<arr.length;k++){
            if(B>=arr[k]){
                small.add(arr[k]);
                combSum(arr, B - arr[k], ans, small, k);
                small.remove(small.size() - 1);
            }

        }

        return;
    }

    public static List< List < Integer > > combSum(int []ARR, int B) {
        // Write your code here.
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>small=new ArrayList<>();
        Arrays.sort(ARR);
        combSum(ARR,B,ans,small,0);
        return ans;
    }
    public static void main(String[] args) {
       int arr[]={1,2,3};

       List<List<Integer>>ans=combSum(arr,5);
        System.out.println(ans);
    }
}
