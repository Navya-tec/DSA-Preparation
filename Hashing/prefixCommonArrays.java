package Hashing;

import java.util.HashMap;

public class prefixCommonArrays {

    public static int[] commonArrays(int a[],int b[]){

        HashMap<Integer,Integer>map=new HashMap<>();

        int ans[]=new int[a.length];
        if(a[0]==b[0]){
            ans[0]=1;
            map.put(a[0],2);
        }else{
            ans[0]=0;
            map.put(a[0],1);
            map.put(b[0],1);
        }
        for(int i=1;i<a.length;i++){

            if(a[i]==b[i]){
                ans[i]=ans[i-1]+1;
            }else{
                int c=0;
                if(map.containsKey(a[i])){
                    c++;
                }
                if(map.containsKey(b[i])){
                    c++;
                }
                ans[i]=ans[i-1]+c;
                map.put(a[i],map.getOrDefault(a[i],0)+1);
                map.put(b[i],map.getOrDefault(b[i],0)+1);
            }

        }
        return ans;
    }

    public static void main(String[] args) {
         int a[]={1,3,5,6};
         int b[]={3,1,6,5};
         int ans[]=commonArrays(a,b);
         for(int i:ans){
             System.out.print(i+" ");
         }
    }
}
