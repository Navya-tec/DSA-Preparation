package BinarySearch;
import java.util.*;
public class numberOfTimesArrayRotated {

    public static int count(int arr[]){
        int s=0,e=arr.length-1;

        if(arr[s]<arr[e]){
            return 0;
        }

        while(s<=e) {
            int mid = s + (e - s) / 2;
            int prev=(mid+arr.length-1)%arr.length;
            int next=(mid+1)%arr.length;

            if(arr[mid]<=arr[prev]&&arr[mid]<=arr[next]){
                return mid;
            }
            if(arr[0]<=arr[mid]){
                s=mid+1;
            }else if(arr[mid]<=arr[e]){
                e=mid-1;
            }
        }
        return 0;
    }

    public static int bs(int s,int e,int[] arr,int k){

        while(s<=e){
            int mid=s+(e-s)/2;

            if(arr[mid]==k){
                return mid;
            }

            if(k<arr[mid]){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
//    public static int search(int[] arr, int k) {
//        int index=count(arr);
//
//        int c1=bs(0,index-1,arr,k);
//        int c2=bs(index,arr.length-1,arr,k);
//
//        if(c1!=-1){
//            return c1;
//        }else if(c2!=-1){
//            return c2;
//        }else{
//            return -1;
//        }
//    }

    public static int search(int arr[],int k){

        int s=0,e=arr.length-1;

        while(s<=e){
            int mid=s+(e-s)/2;

            if(arr[mid]==k){
                return mid;
            }
            if(arr[mid]==arr[s]&&arr[mid]==arr[e]){
                s++;
                e--;
                continue;
            }
            if(arr[s]<=arr[mid]){
                if(arr[s]<=k&&k<=arr[mid]){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }else if(arr[mid]<=arr[e]){
                if(arr[mid]<=k&&k<=arr[e]){
                    s=mid+1;
                }else{
                    e=mid-1;
                }
            }


        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={3,1,1};
//        System.out.println(count(arr));

        int ans=search(arr,3);
        System.out.println(ans);
    }
}
