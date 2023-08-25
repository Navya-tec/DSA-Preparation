package BinarySearch;

import java.util.Arrays;

public class AggressiveCows {

    public static int placeCows(int a[],int mid){

        int i=1,y=0;
        int cows=1;

        while(i<a.length){
            int dis=a[i]-a[y];
            if(dis>=mid){
                cows++;
                y=i;
            }
          i++;
        }
        return cows;
    }
    public static int aggressiveCows(int []a, int k) {
        //    Write your code here.
        Arrays.sort(a);
       int min=1;
       int max=a[a.length-1];

       int ans=-1;
       while(min<max){

           int mid=min+(max-min)/2;
           int cows=placeCows(a,mid);
//           System.out.println(cows);
//           if(cows==k){
//               ans=mid;
//               min=mid+1;
//           }
           if(cows<k){
               max=mid-1;
           }else{
               ans=mid;
               min=mid+1;
           }
       }
       return ans;
    }

    public static void main(String[] args) {

        int a[]={87,93 ,51, 81, 68, 99, 59 };
        System.out.println(aggressiveCows(a,4));
    }
}
