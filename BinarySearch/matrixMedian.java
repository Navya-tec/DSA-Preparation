package BinarySearch;

public class matrixMedian {

   public static int findSmallerEqualElements(int matrix[][],int n,int m,int mid){

       int count=0;
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               if(matrix[i][j]<=mid){
                   count++;
               }
           }
       }
       return count;
   }
    public static int median(int matrix[][], int n, int m) {

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            min=Math.min(min,matrix[i][0]);
            max=Math.max(max,matrix[i][m-1]);
        }

        int x=((n*m)/2);

        while(min<=max){
            int mid=(min+max)/2;
            int count=findSmallerEqualElements(matrix,n,m,mid);
//            System.out.println(count);
            if(count>x){
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }

        return min;
    }

    public static void main(String[] args) {

       int matrix[][]={{1, 3, 5},{2, 6, 9},{3, 6, 9}};
       int n=matrix.length;
       int m=matrix[0].length;
        System.out.println(median(matrix,n,m));
    }
}
