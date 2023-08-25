package Array;

import java.util.ArrayList;

public class crazyNumbers {

    public static ArrayList<ArrayList<Integer>> numberPattern(int n) {

        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

        int i=1;  int k=1;
        while(k<=n){
            ArrayList<Integer>list=new ArrayList<>();
            int z=n-k;
            while(z>0){
                list.add(-1);
                z--;
            }

            int j=1;
            while(j<=k){
                if(i==10){
                    i=1;
                }
                list.add(i);
                i++;
                j++;
            }
            ans.add(list);
            k++;
        }
        return ans;
    }

    public static void main(String[] args) {
      ArrayList<ArrayList<Integer>>ans=numberPattern(4);
      for(ArrayList<Integer>i:ans){
          System.out.println(i);
      }
    }
}
