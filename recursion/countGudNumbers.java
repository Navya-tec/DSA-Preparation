package recursion;

import java.util.ArrayList;
import java.util.List;

public class countGudNumbers {

//    public static boolean isSafe(List<Integer>digits){
//
//        int sum=digits.get(digits.size()-1);
//        for(int i=digits.size()-2;i>=0;i--){
//            if(sum>=digits.get(i)) {
//                return false;
//            }
//            sum+=digits.get(i);
//
//        }
//        return true;
//    }

//    public static List< Integer > goodNumbers(int a, int b, int digit) {
//        // Write your code here.
//        if(b<a){
//            List<Integer>list=new ArrayList<>();
//            return list;
//        }
//
//        int x=b;
//
//        List<Integer>small=goodNumbers(a,b-1,digit);
//
//        List<Integer>ans=new ArrayList<>(small);
//        List<Integer>digits=new ArrayList<>();
//        int y=x;
//        while(y!=0){
//            digits.add(0,y%10);
//            y=y/10;
//        }
//        if(digits.contains(digit)){
//            return ans;
//        }
//
//        if(isSafe(digits)){
//            ans.add(x);
//        }
//        return ans;
//    }

    public static boolean isGoodNumber(int num, int d) {
         return false;
    }

    public static ArrayList<Integer> goodNumbers(int L, int R, int D) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = L; i <= R; i++) {
            if(isGoodNumber(i, D)) {
                result.add(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
       List<Integer>ans=goodNumbers(27843,38710,2);
        System.out.println(ans);
    }
}
