package recursion;

public class firstIndex {

    public static int firstIndex(int a[],int x,int i){
        if(i==a.length){
            return -1;
        }

        if(a[i]==x){
            return i;
        }

        int s=firstIndex(a,x,i+1);
        return s;
    }

    public static int lastIndex(int a[],int x,int i){
        if(i<0){
            return -1;
        }

        if(a[i]==x){
            return i;
        }

        return lastIndex(a,x,i-1);
    }

    public static int[] allIndexes(int a[], int x,int i){

        if(i==a.length){
            return new int[0];
        }

        int small[]=allIndexes(a,x,i+1);

        if(a[i]==x){
            int arr[]=new int[small.length+1];

            arr[0]=i;

            for(int k=1;k<arr.length;k++){
                arr[k]=small[k-1];
            }

            return arr;
        }
        return small;
    }

    public static void main(String[] args) {
        int a[]={1,2,1,4,3,4,3,8,8,3};

        System.out.println(firstIndex(a,2,0));
        System.out.println(lastIndex(a,1,a.length-1));
        int arr[]=allIndexes(a,3,0);
        for(int q:arr){
            System.out.print(q+" , ");
        }
    }
}
