package recursion;

public class reverseAray {

    public static void rev(int arr[],int s,int e){
        if(s>=e){
            return;
        }

        //swap
        int x=arr[s];
        arr[s]=arr[e];
        arr[e]=x;

        rev(arr,s+1,e-1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        rev(arr,0,arr.length-1);
        for(int y:arr){
            System.out.print(y+" ");
        }
    }
}
