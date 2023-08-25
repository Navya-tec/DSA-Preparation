package Hashing;

public class subsetSum {

    public static int subsetSumFind(int l,int r,int a[]){

        int prefix[]=new int[a.length+1];
        prefix[0]=0;

        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+a[i-1];
        }

        for(int i:prefix){
            System.out.print(i+" ");
        }

        return prefix[r+1]-prefix[l];
    }

    public static void main(String[] args) {
        int a[]={3,5,6,4,2};
        System.out.println(subsetSumFind(2,4,a));
    }
}
