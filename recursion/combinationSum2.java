package recursion;

import java.util.ArrayList;
import java.util.Collections;

public class combinationSum2 {

    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target)
    {
        //    Write your code here.
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>small=new ArrayList<>();
        Collections.sort(arr);
        combinationSum2(arr,n,target,0,small,ans);

        return ans;
    }

    public static void combinationSum2(ArrayList<Integer>arr,int n,int target,int i,ArrayList<Integer>small,ArrayList<ArrayList<Integer>>ans){

        if(target==0){
            if(!ans.contains(small)) {
                ans.add(new ArrayList<>(small));
            }
            return;
        }
        if(i>=arr.size()){
            return;
        }
        if(target<0){
            return;
        }


        for(int k=i;k<n;k++){
            if(target>=arr.get(k)) {
                small.add(arr.get(k));
//            System.out.println(small);
                combinationSum2(arr, n, target - arr.get(k), k+1, small, ans);
                small.remove(small.size() - 1);
            }
        }

    }

    public static void main(String[] args) {
         ArrayList<Integer>arr=new ArrayList<>();
         arr.add(10);
         arr.add(1);
         arr.add(2);
         arr.add(7);
         arr.add(6);
         arr.add(1);
         arr.add(5);
         ArrayList<ArrayList<Integer>>ans=combinationSum2(arr,arr.size(),8);
        System.out.println(ans);
    }
}
