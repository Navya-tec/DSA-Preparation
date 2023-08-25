package Hashing;

import java.util.HashMap;

public class countKDifference {

    public static int countkDifferencefromArray(int[] a, int k) {

        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i<a.length;i++){

           int x=a[i]-k;
           int y=a[i]+k;

           count+=map.getOrDefault(x,0)+map.getOrDefault(y,0);
           map.put(a[i],map.getOrDefault(a[i],0)+1);
        }

        return count;

    }

    public static void main(String[] args) {
        int a[]={1,2,2,1};
        System.out.println(countkDifferencefromArray(a,1));
    }
}
