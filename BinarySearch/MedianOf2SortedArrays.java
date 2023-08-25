package BinarySearch;

public class MedianOf2SortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length==0){

            int mid=nums2.length/2;

            if(nums2.length%2==0){
                double ans=(double)(nums2[mid-1]+nums2[mid])/2;

                return ans;
            }else{
                return (double)nums2[mid];
            }

        }

        if(nums2.length==0){
            int mid=nums1.length/2;

            if(nums1.length%2==0){
                double ans=(nums1[mid-1]+nums1[mid])/2;
                return ans;
            }else{
                return (double)nums1[mid];
            }
        }
        int sorted[]=new int[((nums1.length+ nums2.length)/2)+1];

        int i=0,j=0;
        int k=0;
        while(k<sorted.length&&i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){
                sorted[k]=nums1[i];
                i++;
            }else{
                sorted[k]=nums2[j];
                j++;
            }
            k++;
        }

        if(k<sorted.length){
            if(i< nums1.length){
                sorted[k]=nums1[i];
                i++;
            }else if(j< nums2.length){
                sorted[k]=nums2[j];
                j++;
            }
            k++;
        }
        for(int h:sorted){
            System.out.print(h+" ");
        }
        int len= nums1.length+ nums2.length;

        if(len%2==0){
            double median=sorted[sorted.length-1]+sorted[sorted.length-2];
            return (double)median/2;
        }else{
            return (double)sorted[sorted.length-1];
        }
    }

    public static void main(String[] args) {
       int nums1[]={2};
       int nums2[]={5,6,7,8};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
