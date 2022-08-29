
public class PowerOfTwo {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int result=1;
        for(int i=1;i<num;i++)
        {
            result*=2;
            System.out.println("2 ^ "+ i +"is "+ result);
        }

    }
}
