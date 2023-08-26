package Hashing;

import java.util.HashMap;

public class fourSum {

    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        HashMap<Integer,Integer>map1=new HashMap<>();
        HashMap<Integer,Integer>map2=new HashMap<>();

        int n=nums1.length;
        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                int el=nums1[i]+nums2[j];
                map1.put(el, map1.getOrDefault(el,0)+1);
            }
        }

        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int el=nums3[i]+nums4[j];
                if(map1.containsKey(-el)){
                    count += map1.get(-el);
                }

            }
        }

        return count;
    }

    public static void main(String[] args) {
       int nums1[]={-1,-1};
       int nums2[]={-1,1};
       int nums3[]={-1,1};
       int nums4[]={1,-1};

        System.out.println(fourSumCount(nums1,nums2,nums3,nums4));
    }
}
