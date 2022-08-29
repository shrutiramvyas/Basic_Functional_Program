import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args) {
        int head=0;
        int tail=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int no_of_times = scan.nextInt();

        for(int i=1; i<=no_of_times;i++){
            int flip = (int)Math.floor(Math.random()*10%2);
            if (flip == 0){
                head++;
            }
            else{
                tail++;
            }
        }
        System.out.println("No of Head Occur: "+ head);
        System.out.println("No of Tail Occur: "+ tail);

        int PercentageofHead=(head*100)/no_of_times;
        int PercentageofTail=(tail*100)/no_of_times;
        System.out.println("Percentage of Head is "+PercentageofHead);
        System.out.println("Percentage of Tail is "+PercentageofTail);
    }


}
