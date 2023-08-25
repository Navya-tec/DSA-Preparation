package Hashing;

import java.util.HashMap;

public class TwoSum {

    public static int[] twosum(int a[],int x){

        int res[]=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<a.length;i++){
            int y=a[i];
            if(map.containsKey(x-y)){
                res[0]=map.get(x-y);
                res[1]=i;
                return res;
            }
            map.put(y,i);
        }
        return res;
    }

    public static void main(String[] args) {
        int a[]={1, 4, 45, 6, 10, 8};
        int ans[]=twosum(a,16);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
