package Array;

import java.util.ArrayList;
import java.util.List;

public class PartitionAroundPivot {

    public static int[] pivotArray(int[] a, int pivot) {

        List<Integer> l1=new ArrayList<>();
        List<Integer>l2=new ArrayList<>();

        for(int i=0;i<a.length;i++){
            if(a[i]<pivot){
                l1.add(a[i]);
            }
        }

        for(int i=0;i<a.length;i++){
            if(a[i]>pivot){
                l2.add(a[i]);
            }
        }

        List<Integer>l3=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(a[i]==pivot){
                l3.add(a[i]);
            }
        }
        int i=0;
        while(i<a.length&&i<l1.size()){
            a[i]=l1.get(i);
            i++;
        }
        int k=0;
        while(k<l3.size()&&i<a.length){
            a[i]=l3.get(k);
            i++;k++;
        }
        int j=0;
        while(j<l2.size()&&i<a.length){
            a[i]=l2.get(j);
            i++;j++;
        }

        return a;
    }

    public static void main(String[] args) {
        int arr[]={9,12,15,10,14,3,10};
        int ans[]=pivotArray(arr,10);
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
}
