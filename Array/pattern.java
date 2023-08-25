package Array;

public class pattern {

    public static void printPattern(int n){
        // Write your code here.
        int i=1;  int j=1; int k=n;
        while(n>0){

            int z=k-i;
            while(z>0){
                System.out.print(" ");
                z--;
            }
            i++;

            int x=0;
            while(x<j){
                System.out.print("*");
                x++;
            }

            j=j+2;
            n--;
            System.out.println();

        }
    }

    public static void main(String[] args) {
        printPattern(4);
    }
}
