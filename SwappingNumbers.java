public class SwappingNumbers {
    public static void Swap(int x, int y){
        System.out.println(x +" and "+y+"before swapping");
        int temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println(x +" and "+y+"after swapping");
    }
    public static void main(String[] args) {
        int num1=4;
        int num2=10;
        Swap(num1,num2);
    }

}
