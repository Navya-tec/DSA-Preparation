package BinarySearch;

import java.util.Arrays;

public class BouqetDays {

    public static int isPossible(int a[],int k,int mid){

        int bouqets=0,flowers=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<=mid){
                flowers++;
            }else{
                flowers=0;
            }

            if(flowers==k){
                bouqets++;
                flowers=0;
            }
        }
        return bouqets;
    }
    public static int minDays(int[] a, int m, int k) {

        if(m*k>a.length){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for (int i : a) {
            max = Math.max(max, i);

        }
        int min=1;
        while(min<max){
            int mid=min+(max-min)/2;

            int x=isPossible(a,k,mid);
            if(x<m){
                min=mid+1;
            }else{
                max=mid;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int a[]={7,7,7,7,12,7,7};
        System.out.println(minDays(a,2,3));
    }
}
