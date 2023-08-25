package BinarySearch;

public class smallestDivisor {

    public static int sum(int a[],int mid){
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<=mid){
                sum++;
            }else{
                if(a[i]%mid!=0){
                    sum=sum+1+(a[i]/mid);
                }else{
                    sum=sum+(a[i]/mid);
                }
            }
        }
//        System.out.println(sum);
        return sum;
    }

    public static int smallestDivisor(int[] a, int threshold) {

        int min=1;
        int max=Integer.MIN_VALUE;
        for(int i:a){
            max=Math.max(i,max);
        }
      int ans=-1;
        while(min<=max){

            int mid=min+(max-min)/2;

            int x=sum(a,mid);

            if(x<=threshold){
                ans=mid;
                max=mid-1;
            }else{
                min=mid+1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
       int a[]={44,22,33,11,1};
        System.out.println(smallestDivisor(a,5));
    }
}
