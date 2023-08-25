package BinarySearch;

public class findFloor {

    public static int findFloorOfElement(int a[],int x){

        int s=0,e=a.length-1;
        int max=-1;
        while(s<=e){
            int mid=s+(e-s)/2;

            if(a[mid]==x){
                return mid;
            }
            if(a[mid]>x){
                e=mid-1;
            }
            else if(a[mid]<x){
                max=Math.max(max,a[mid]);
                s=mid+1;
            }
        }
        return max;
    }

    public static int ceil(int a[],int x){
        int s=0,e=a.length-1;
        int min=Integer.MAX_VALUE;
        while(s<=e){
            int mid=s+(e-s)/2;

            if(a[mid]==x){
                return mid;
            }
            if(a[mid]>x){
                min=Math.min(min,a[mid]);
                e=mid-1;
            }
            else if(a[mid]<x){
                s=mid+1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int a[]={3,4,7,8,10};
        System.out.println(findFloorOfElement(a,9));
        System.out.println(ceil(a,9));
        char c = 'b'-'0';
        System.out.println(c);
    }
}
