package recursion;

public class isSorted {

    public static boolean issorted(int arr[],int i){

        if(arr.length==1){
            return true;
        }

        if(i== arr.length){
            return true;
        }
        if(arr[i-1]>arr[i]){
            return false;
        }

        boolean a=issorted(arr,i+1);
        return a;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,5,4,1,2};
        System.out.println(issorted(arr,1));
    }
}
