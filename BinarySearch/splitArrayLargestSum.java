package BinarySearch;

public class splitArrayLargestSum {

    public static int numOfSubarray(int a[],int mid){

        int num=1;
        int sum=0;

        for(int i=0;i<a.length;i++){
            if(sum+a[i]<=mid){
              sum+=a[i];
            } else{
                num++;
                sum=a[i];
            }
        }
        return num;
    }
    public static int splitArray(int[] a, int k) {

        if(a.length<k){
            return -1;
        }

        int min=Integer.MIN_VALUE;

        for(int i:a){
            min=Math.max(min,i);
        }

        int max=0;
        for(int i:a){
            max+=i;
        }

        while(min<=max){
            int mid=min+(max-min)/2;

            int num=numOfSubarray(a,mid);

            if(num>k){
                min=mid+1;
            }else{
                max=mid-1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int a[]={7,2,5,10,8};
        System.out.println(splitArray(a,2));
    }
}
