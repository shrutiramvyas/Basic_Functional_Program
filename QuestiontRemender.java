public class QuestiontRemender {
    public static void Check(int div,int divisor){
        int questiont=(int)div/divisor;
        int remiender=(int)div%divisor;
        System.out.println("questiont: "+questiont);
        System.out.println("reminder :"+ remiender);
    }

    public static void main(String[] args) {
        int dividend = 25;
        int divisor = 4;
        Check(dividend,divisor);
    }
}
