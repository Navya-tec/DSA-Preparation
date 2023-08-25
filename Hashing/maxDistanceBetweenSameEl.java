package Hashing;

import java.util.HashMap;

public class maxDistanceBetweenSameEl {

    public static int maxDistance(int a[], int n)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        int max=-1;
        for(int i=0;i<a.length;i++){
            if(!map.containsKey(a[i])){
                map.put(a[i],i);
            }else{
                int z=i-map.get(a[i]);
                max=Math.max(z,max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int a[]={1, 1, 2, 2, 2, 1};
        System.out.println(maxDistance(a,a.length));
    }
}
