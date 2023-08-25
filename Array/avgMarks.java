package Array;

class Pair{
        char firstLetterOfName;
        int avgMarks;
    Pair(char firstLetterOfName, int avgMarks){
           this.firstLetterOfName = firstLetterOfName;
           this.avgMarks = avgMarks;
        }
    }
public class avgMarks {

    public static Pair averageMarks(char firstLetterOfName, int m1, int m2, int m3) {
        int avg=(m1+m2+m3)/3;
        Pair pair=new Pair(firstLetterOfName,avg);

        return pair;
    }

    public static void main(String[] args) {
        Pair p=averageMarks('K',12,7,4);
//        System.out.println(p.firstLetterOfName+" "+p.avgMarks);
    }
}
