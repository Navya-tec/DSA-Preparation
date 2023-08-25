package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class allocateBooks {

    public static int numOfStudents(ArrayList<Integer> arr,int mid){

        int numberOfPages=0;
        int students=1;

        for(int i=0;i<arr.size();i++){
            if(numberOfPages+arr.get(i)<=mid){
                numberOfPages+=arr.get(i);
            }
            else{
                numberOfPages=arr.get(i);
                students++;
            }
        }
//        System.out.println(students);
        return students;
    }

    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        if(m>n){
            return -1;
        }

        int min=Integer.MIN_VALUE;

        for(int i:arr){
            min=Math.max(min,i);
        }

        int max=0;
        for(int i:arr){
            max+=i;
        }
        int res=-1;

        while(min<=max){
            int mid=min+(max-min)/2;

            int studentsNum=numOfStudents(arr,mid);

            if(studentsNum>m){
               min=mid+1;
            }else{
               max=mid-1;
            }

        }
        return min;
    }

    public static void main(String[] args) {
        ArrayList<Integer>arr =new ArrayList<>();
        arr.add(12);
        arr.add(34);
        arr.add(67);
        arr.add(90);
        System.out.println(findPages(arr,arr.size(),2));

    }
}
