package BinarySearch;

public class singleElement {

    public static int singleNonDuplicate(int[] arr) {

        int s=0,e=arr.length-1;

        if(arr.length==1){
            return arr[0];
        }
        if(arr[0]!=arr[1]){
            return arr[0];
        }

        if(arr[arr.length-1]!=arr[arr.length-2]){
            return arr[arr.length-1];
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            int prev=(mid+arr.length-1)%arr.length;
            int next=(mid+1)%arr.length;

            if(arr[mid]!=arr[prev]&&arr[mid]!=arr[next]){
                return arr[mid];
            }

            if(s==0&&(mid+1)%2==0){
                s=mid+1;
            }

            else{
                e=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(arr));
    }
}
