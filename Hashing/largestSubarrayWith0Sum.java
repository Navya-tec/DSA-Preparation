package Hashing;

import java.util.HashMap;
import java.util.Map;

public class largestSubarrayWith0Sum {

    public static int maxLen(int a[], int n)
    {
        int prefix[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            prefix[i]=sum;
        }

        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int len=0;
        for(int i=0;i<n;i++){
            if(map.containsKey(prefix[i])){
                len=Math.max(len,i-map.get(prefix[i]));
            }else{
                map.put(prefix[i],i);
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int a[]={-1 ,1, -1, 1};
        System.out.println(maxLen(a,a.length));
    }
}
