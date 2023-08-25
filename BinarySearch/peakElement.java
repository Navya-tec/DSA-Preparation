package BinarySearch;

public class peakElement {

    public int findPeakElement(int[] nums) {

        int s=0,e=nums.length-1;

        if(nums.length==1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        else if(nums[e]>nums[e-1]){
            return e;
        }

        s=1;
        e=nums.length-2;
        while(s<=e){
            int mid=s+(e-s)/2;

            if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
                return mid;
            }else if(nums[mid-1]>nums[mid]){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
