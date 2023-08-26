package Hashing;

import java.util.HashMap;

public class maximizeEqualNumbers {

    public static int maximizeEqualNumbersOfArray(int a[],int k){

        int arr[]=new int[200000];
        int i=0;
        while(i<a.length){
           int l=a[i]-k;
           int r=a[i]+k;

           arr[l]=arr[l]+1;
           arr[r+1]=arr[r+1]-1;
           i++;
        }
        int ans=1;
        arr[0]=0;
        for(int q=1;q<arr.length;q++){
            arr[q]=arr[q-1]+arr[q];
            ans=Math.max(ans,arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[]={4,5,8,10,15};
        System.out.println(maximizeEqualNumbersOfArray(a,3));
    }
}
