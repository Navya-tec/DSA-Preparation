package BinarySearch;

public class peakElement2 {

    public static int[] findPeakGrid(int[][] matrix) {

        int ans[]=new int[2];
        int n=matrix.length;
        int m=matrix[0].length;

        int i=0,j=n-1;

        while(i<=j){
            int mid=(i+j)/2;

            //find max
            int max=-1;
            int k;int ind=-1;
            for(k=0;k<m;k++){
                if(max<matrix[mid][k]){
                    max=matrix[mid][k];
                    ind=k;
                }
            }
            //i-rows,k-columns
            //check

            //up
            if(mid-1>=0){
                if(matrix[mid-1][ind]>matrix[mid][ind]){
                    j=mid-1;
                    continue;
                }
            }
            //down
            if(mid+1<n){
                if(matrix[mid+1][ind]>matrix[mid][ind]){
                    i=mid+1;
                    continue;
                }
            }
                ans[0]=mid;
                ans[1]=ind;
                return ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        int matrix[][]={{1,4},{3,2}};
        int ans[]=findPeakGrid(matrix);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
