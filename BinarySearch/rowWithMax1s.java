package BinarySearch;

import java.util.ArrayList;

public class rowWithMax1s {

    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {
        int i=0;
        int j=m-1;
        int ind=-1;
        while(i<=j){
            int mid=(i+j)/2;
            int g;int x=-1;
            for(g=0;g<n;g++){
                if(matrix.get(g).get(mid)==1){
                    ind=g;
                    j=mid-1;
                    x=1;
                    break;
                }
            }

            if(x==-1){
                i=mid+1;
            }
        }
        return ind;
    }

    public static void main(String[] args) {
       ArrayList<ArrayList<Integer>>matrix=new ArrayList<>();

        ArrayList<Integer>l1=new ArrayList<>();
        l1.add(0);
        l1.add(0);
        l1.add(0);
        l1.add(1);
        l1.add(1);

        ArrayList<Integer>l2=new ArrayList<>();
        l2.add(0);
        l2.add(0);
        l2.add(0);
        l2.add(1);
        l2.add(1);

        ArrayList<Integer>l3=new ArrayList<>();
        l3.add(0);
        l3.add(0);
        l3.add(1);
        l3.add(1);
        l3.add(1);

        ArrayList<Integer>l4=new ArrayList<>();
        l4.add(0);
        l4.add(1);
        l4.add(1);
        l4.add(1);
        l4.add(1);

        matrix.add(l1);
        matrix.add(l2);
        matrix.add(l3);
        matrix.add(l4);

        int n=matrix.size();
        int m=matrix.get(0).size();
        System.out.println(maximumOnesRow(matrix,n,m));
    }

}
