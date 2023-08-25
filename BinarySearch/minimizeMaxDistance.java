package BinarySearch;
import java.util.*;
import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;



public class minimizeMaxDistance {

    public static double minimiseMaxDistanceBtwGasStations(int a[],int k){


        int n=a.length;
        int howMany[]=new int[n-1];

        for(int j=0;j<k;j++){
            double maxSection=-1;
            int maxInd=-1;
            for(int i=0;i<n-1;i++){
                double diff=a[i+1]-a[i];
                double sectionLength=(double)diff/(double)(howMany[i]+1);
                if(sectionLength>maxSection){
                    maxSection=sectionLength;
                    maxInd=i;
                }

            }
            howMany[maxInd]++;
        }
        double max=-1;
        for(int i=0;i<n-1;i++){
            double diff=a[i+1]-a[i-1];
            double sectionLength=(double)diff/(double)(howMany[i]+1);
            max=Math.max(max,sectionLength);
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
