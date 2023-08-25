package BinarySearch;

import java.util.Arrays;

public class kokoEatingBananas {

    public static int minEatingSpeed(int[] piles, int h) {

        Arrays.sort(piles);
//        int mid=(piles[0]+piles[piles.length-1])/2;
        int ans=-1;
        int min=1;
        int max=piles[piles.length-1];

        while(min<max){
            int mid=(min+max)/2;

            int temp=h;
            for(int i=0;i< piles.length;i++){
                if(piles[i]<=mid){
                    temp--;
                }else{
                    int x=piles[i]/mid+1;
                    temp=temp-x;
                }

                if(temp<0){
                    break;
                }
            }

            if(temp==0){
                ans=mid;
                max=mid-1;
            }

            if(temp<0){
                min=mid+1;
            }

            else if(temp>0){
                max=mid-1;
            }

        }

        return ans;
    }

    public static void main(String[] args) {
      int piles[]={312884470};
        System.out.println(minEatingSpeed(piles,312884469));
    }
}
