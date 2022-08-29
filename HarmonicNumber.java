import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        double result=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = scan.nextInt();
        while(num>0){
            result+=(double)1/num;
            num--;
        }
        System.out.println("Harmonic number of give number is"+result);
    }
}
