import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int year = scan.nextInt();
        if (year >= 0000 && year<=9999){
            if (year%4==0 && year!=100 || year%400 ==0){
                System.out.println("The given year is Leap Year");
            }
            else{
                System.out.println("Not leap year");
            }
        }
    }
}
