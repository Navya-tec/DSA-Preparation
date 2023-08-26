package Hashing;

import java.util.HashMap;

//Ques : maximum sum of two numbers whose digits add up to an equal sum. (Microsoft OA)
public class MaxPairSumWIthSameDigitSum {

    public static int digitSum(int number){
        int digit=0;
        int sum=0;
        while(number > 0)
        {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }
    public static int solve(int a[]){

        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;

        for(int i=0;i<a.length;i++){

            if(map.containsKey(digitSum(a[i]))){
                int x=a[i];
                int y=map.get(digitSum(a[i]));

                sum=Math.max(sum,x+y);

                map.put(digitSum(a[i]),Math.max(x,y));
            }
            else{
                map.put(digitSum(a[i]),a[i]);
            }
        }
        if(sum==0){
            return -1;
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[]={51, 32, 43};
        System.out.println(solve(a));
    }
}
