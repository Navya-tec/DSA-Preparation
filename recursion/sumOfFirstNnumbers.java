package recursion;

public class sumOfFirstNnumbers {

    public static int sum(int n){
        if(n==0){
            return n;
        }
        return n+sum(n-1);

    }


    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
