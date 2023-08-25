package recursion;

import java.util.ArrayList;
import java.util.List;

public class subsetWithSUmK {

    public static List<List< Integer >> subarraysWithSumK(int []a, long k) {

        List<List< Integer >> ans=new ArrayList<>();
        List<Integer>s=new ArrayList<>();
        getSubsetsWithSumK(a,k,0,ans,s);
//        System.out.println(ans);
        return ans;
    }

    public static void getSubsetsWithSumK(int a[],long k,int i,List<List<Integer>>ans,List<Integer>s){

        if(i==a.length&&k==0){
            if(!ans.contains(s)){
                ans.add(s);
            }

            return;
        }

        if(i==a.length){
//            ans.add(s);
            return;
        }
        getSubsetsWithSumK(a,k,i+1,ans,new ArrayList<>(s));
        s.add(a[i]);
        getSubsetsWithSumK(a,k-a[i],i+1,ans,new ArrayList<>(s));

       return;
    }

    public static boolean isSubsetPresent(int n, int k,int []a,int i) {
        // Write your code here
        if(i==a.length&&k==0){
            return true;
        }

        if(i==a.length){
            return false;
        }

        boolean a1=isSubsetPresent(n,k,a,i+1);
        boolean a2=isSubsetPresent(n,k-a[i],a,i+1);

        return a1||a2;
    }

    public static void main(String[] args) {
       int a[]={1,2,1,3};
       List<List<Integer>>ans=subarraysWithSumK(a,2);
        System.out.println(ans);
        int arr[]={1,2,3};
        System.out.println(isSubsetPresent(a.length,9,arr,0));
    }
}
