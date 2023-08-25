import java.text.DecimalFormat;
import java.util.ArrayList;

public class fractionPairsgfg {

    private static final DecimalFormat decfor = new DecimalFormat("0.00");
    public static int countFractions(int n, int[] numerator, int[] denominator) {
        // code here

        ArrayList<Double>list=new ArrayList<>();

        for(int i=0;i<numerator.length;i++){
            int x=numerator[i];
            for(int j=0;j<denominator.length;j++){
                int y=denominator[j];
                double frac=x/y;
//                double roundOff = Math.round(frac*100.0)/100.0;
                decfor.format(frac);
                list.add(frac);
            }
        }
        System.out.println(list);
        return 0;
    }

    public static void main(String[] args) {
       int n[]={1, 2, 2, 8};
       int d[]={2,4,6,12};
        System.out.println(countFractions(n.length,n,d));
    }
}
