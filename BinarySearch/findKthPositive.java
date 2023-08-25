package BinarySearch;

public class findKthPositive {

    public static int findKthPositive(int[] arr, int k) {

        int n=arr.length;
        if(arr[n-1]==arr.length){
            return arr[n-1]+k;
        }

        if(k>arr[n-1]-arr.length){
            return arr[n-1]+k;
        }

        int s=0,e= arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;

            int x=arr[mid]-(mid+1);

            if(x<k){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        System.out.println(s+" "+k);
        return s+k;
    }

    public static void main(String[] args) {
       int arr[]={2,3,4,7,11};
        System.out.println(findKthPositive(arr,5));
    }
}
