public class FindGreatest {
    public static void Greatest(int a,int b,int c){
        if(a>b) {
            if (a > c) {
                System.out.println("A is greater");
            } else if (c > b) {
                System.out.println("C is greater");
            }
        }
        else if(b>c){
            System.out.println("B is greater");
            }
        else{
            System.out.println("C is greater");
        }
    }

    public static void main(String[] args) {
        int a=12;
        int b=150;
        int c=52;
        Greatest(a,b,c);
    }
}
