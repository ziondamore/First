import java.util.Scanner;

public class SqrtEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, x1, x2, d;

        System.out.println("ax2 + bx + c = 0");

        System.out.print("Enter a: ");
        a = input.nextDouble();

        System.out.print("Enter b: ");
        b = input.nextDouble();

        System.out.print("Enter c: ");
        c = input.nextDouble();

        d = Math.pow(b,2) - (4 * a * c);

        if (d > 0) {
            x1 = ((- b) + Math.sqrt(d)) / (2 * a);
            x2 = ((- b) - Math.sqrt(d)) / (2 * a);
            System.out.print("X1 = ");
            System.out.println(x1);

            System.out.print("X2 = ");
            System.out.println(x2);

        } else if (d == 0) {
            x1 = - b / 2 * a;
            System.out.print("X = ");
            System.out.println(x1);
        }   else {
            System.out.println("The equation has no roots");

        }

    }

}