package Hashing;

import java.util.HashMap;

public class subarrayWithSumK {

    public static int findSubArraySum(int a[], int n, int k)
    {

        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);

        int count=0; int presum=0,curSum=0;
        for(int i=0;i<n;i++){
            presum+=a[i];
            int remove=presum-k;
            count+=map.getOrDefault(remove,0);
            map.put(presum,map.getOrDefault(presum,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
      int a[]={1,-7,4,-3,-3};
        System.out.println(findSubArraySum(a,a.length,-3));

    }
}
