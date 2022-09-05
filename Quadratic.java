public class Quadratic {
    public static void main(String[] args) {
        double a = 2.3, b = 4, c = 5.6;
        double root1, root2;
        double equation = b * b - 4.0 * a * c;
        if (equation > 0.0) {
            root1 = (-b + Math.pow(equation, 0.5)) / (2.0 * a);
            root2 = (-b - Math.pow(equation, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        }
        else if (equation == 0.0) {
            root1 = -b / (2.0 * a);
            System.out.println("The root is " + root1);
        } else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-equation) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}
