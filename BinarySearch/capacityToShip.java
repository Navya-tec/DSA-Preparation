package BinarySearch;

public class capacityToShip {

    public static int daysTaken(int[] a,int mid){
       int days=0;int sum=0;
       int i=0;
       while(i<a.length){
           if(sum<mid){
               sum+=a[i];
               if(sum>mid){
                   continue;
               }
//               System.out.println(sum);
               i++;
           }else{
               days++;
//               System.out.println(sum+"*");
               sum=0;
//               i++;
           }
       }
        System.out.println(days+1);
       return days+1;
    }

    public static int shipWithinDays(int[] a, int days) {


        int min=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            min=Math.max(min,a[i]);
        }
        int ans=-1;
        int sumofAllelements=0;
        for(int i=0;i<a.length;i++){
            sumofAllelements+=a[i];
        }
        int max=sumofAllelements;

        while(min<=max){
            int mid=min+(max-min)/2;
            int x=daysTaken(a,mid);

            if(x<=days){
                max=mid-1;
            }else{
                min=mid+1;
            }
        }

        return min;
    }

    public static void main(String[] args) {
       int a[]={1,2,3,1,1};
        System.out.println(shipWithinDays(a,4));
    }
}
