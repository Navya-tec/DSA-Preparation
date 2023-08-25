package Hashing;

import java.util.HashMap;

public class isSubset {

    public static String isSubset( long a1[], long a2[], long n, long m) {

        HashMap<Long,Long>map=new HashMap<>();

        for(int i=0;i< a1.length;i++){
            map.put(a1[i],map.getOrDefault(a1[i],0l)+1);
        }

        for(int i=0;i< a2.length;i++){
            if(map.containsKey(a2[i])&&map.get(a2[i])>=1){
                map.put(a2[i],map.get(a2[i])-1);
            }else{
                return "No";
            }
        }

        for(int i=0;i<a1.length;i++){
            if(map.get(a1[i])<0){
                return "No";
            }
        }

      return "Yes";
    }

    public static void main(String[] args) {
      long a1[]={11, 7, 1, 13, 21, 3, 7, 3};
      long a2[]={11, 3, 7, 1, 7,67};
        System.out.println(isSubset(a1,a2,a1.length,a2.length));
    }
}
