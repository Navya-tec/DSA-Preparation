package recursion;

import java.util.ArrayList;

public class combinations3 {

    public static ArrayList<ArrayList<Integer>> combinationSum3(int k, int n) {
        // Write your code here.
        if (n <= k || n > 55) return new ArrayList<>();
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();


        ArrayList<Integer>s=new ArrayList<>();
        int vis[]=new int[10];
        helper(k,1,k,n,ans,s,vis);
        return ans;
    }

    public static void helper(int q,int i,int size,int sum,ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>s,int vis[]){

        if(sum==0&&s.size()==q){
            ans.add(new ArrayList<>(s));
            return;
        }

        for(int j=i;j<10;j++){
            if(size>=0&&sum>=0&&vis[j]!=1){
                s.add(j);
                vis[j]=1;
                System.out.println(s);
                helper(q,j+1,size-1,sum-j,ans,s,vis);
                s.remove(s.size()-1);
                vis[j]=0;
            }
        }
        return;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>ans=combinationSum3( 5,39);
        System.out.println(ans);
    }
}
