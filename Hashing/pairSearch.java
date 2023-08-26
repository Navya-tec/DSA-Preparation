package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class pairSearch {

    public static int searchForPair(int a[]){

        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int i=1;i<a.length;i++){

            int RHS=a[a[a[i]]];
            int g=map.getOrDefault(RHS,0);
            count+=g;

            int LHS=a[a[a[i]]];
            map.put(LHS,map.getOrDefault(LHS,0)+1);
        }

        return count;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n+1];
        int i=1;
        while(i<=n){
            a[i]=sc.nextInt();
            i++;
        }

        System.out.println(searchForPair(a));
    }
}
