package Hashing;
import java.util.Map;
import java.util.TreeMap;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] a) {

        TreeMap<Integer,Boolean>map=new TreeMap<>();

        for(int i=0;i<a.length;i++){
            map.put(a[i],true);
        }

        for(int i:a){
            if(map.containsKey(i-1)){
                map.put(i,false);
            }
        }

        for(Integer i:map.keySet()){
            System.out.println(i+" "+map.get(i));
        }

        int count=1;
        int ans=0;
        for(Map.Entry<Integer,Boolean> entry: map.entrySet()) {

            if(entry.getValue() == true) {
                ans=Math.max(ans,count);
                count=1;
            }else{
                count++;
            }
        }
        return Math.max(ans,count);
    }

    public static void main(String[] args) {
        int a[]={0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(a));
    }
}
