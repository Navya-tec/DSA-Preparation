package Array;

public class APTerms {

    public static int[] termsOfAP(int x){
        // Write your code here.
        int arr[]=new int[x];
        int k=0;
        int c=0;
        int i=1;
        while(c<x){

            int y=(3*i)+2;
            if(y%4!=0){
                arr[k]=y;
                k++;c++;
            }
            i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int ans[]=termsOfAP(4);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
