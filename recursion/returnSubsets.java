package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class returnSubsets {

    public static List<List<Integer>> subsets(int[] nums,int i) {

        if(i==nums.length){
            List<List<Integer>>ans=new ArrayList<>();
            List<Integer>s=new ArrayList<>();
            ans.add(s);
            return ans;
        }
        int x=nums[i];
        List<List<Integer>>small=subsets(nums,i+1);

        List<List<Integer>>ans=new ArrayList<>();


        for(int j=0;j<small.size();j++){
//            System.out.print(small.get(j)+" * ");
            ans.add(small.get(j));
        }


        for(int j=0;j<small.size();j++){
            List<Integer>l=new ArrayList<>();
            l.add(x);
            List<Integer>s=small.get(j);
            for(int k=0;k<s.size();k++){
                l.add(s.get(k));
            }
//            System.out.println(l);
            ans.add(l);
        }

      return ans;
    }

    public static boolean isthere(List<List<Integer>>list,int x){

        for(int i=0;i<list.size();i++){
            List<Integer>s=list.get(i);
            if(s.size()==1&&s.get(0)==x){
                return false;
            }
        }
        return true;
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums,int i) {
        if(i==nums.length){
            List<List<Integer>>ans=new ArrayList<>();
            List<Integer>s=new ArrayList<>();
            ans.add(s);
            return ans;
        }
        int x=nums[i];
        List<List<Integer>>small=subsetsWithDup(nums,i+1);

        List<List<Integer>>ans=new ArrayList<>();


        for(int j=0;j<small.size();j++){
            Collections.sort(small.get(j));
            if(!ans.contains(small.get(j))){
                ans.add(small.get(j));
            }

        }

            for (int j = 0; j < small.size(); j++) {
                List<Integer> l = new ArrayList<>();
                l.add(x);
                List<Integer> s = small.get(j);
                for (int k = 0; k < s.size(); k++) {
                    l.add(s.get(k));
                }
                Collections.sort(l);
                if(!ans.contains(l)){
                    ans.add(l);
                }
            }

        return ans;
    }



    public static void main(String[] args) {
        int nums[]={1,2,2,2};
        List<List<Integer>>ans=subsets(nums,0);
        System.out.println(ans);
        List<List<Integer>>an=subsetsWithDup(nums,0);
        System.out.println(an);
    }
}

