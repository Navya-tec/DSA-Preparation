package recursion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class subsetSum {

    public static ArrayList<Integer> subsetSum(int num[],int i) {
        // Write your code here..
        if(i==num.length){
            ArrayList<Integer> list= new ArrayList<>();
            list.add(0);
            return list;
        }

        int x=num[i];
        ArrayList<Integer>small=subsetSum(num,i+1);

        ArrayList<Integer>ans=new ArrayList<>();

        for(int k=0;k<small.size();k++){
            ans.add(small.get(k));
        }

        for(int k=0;k<small.size();k++){
            int s=small.get(k)+x;
            ans.add(s);
        }
      return ans;
    }

    public static ArrayList<Integer> subsetSum(int num[]){
//        ArrayList<Integer>ans=new ArrayList<>();
        ArrayList<Integer>ans=subsetSum(num,0);
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
         int num[]={1,2,2,2};
         ArrayList ans=subsetSum(num);
        System.out.println(ans);
    }
}
