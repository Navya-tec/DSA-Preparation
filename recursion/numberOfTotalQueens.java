package recursion;

public class numberOfTotalQueens {

    public static boolean isSafe(String arr[][],int r,int c){

        for(int i=c;i>=0;i--){
            if(arr[r][i]=="Q"){
                return false;
            }
        }

        int upr=r;
        int upc=c;

        while(upr>=0&&upc>=0){
            if(arr[upr][upc]=="Q"){
                return false;
            }
            upr--;
            upc--;
        }

        int dr=r;
        int dc=c;
        while(dr<arr.length&&dc>=0){
            if(arr[dr][dc]=="Q"){
                return false;
            }
            dr++;
            dc--;
        }

        return true;
    }
    public static int solve(String arr[][],int c){

        if(c==arr.length){
//            count=count+1;
            return 1;
        }

        int count=0;
        for(int i=0;i<arr.length;i++){
            if(isSafe(arr,i,c)){
                arr[i][c]="Q";
                count+=solve(arr,c+1);
                arr[i][c]=".";
            }
        }
        return count;
    }
    public static int totalNQueens(int n) {

        String arr[][]=new String[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=".";
            }
        }
//        int count=0;
       return solve(arr,0);

    }

    public static void main(String[] args) {
        System.out.println(totalNQueens(4));
    }

}
