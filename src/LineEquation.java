import java.util.Scanner;

public class LineEquation {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     double b;
     double a;
     double x;

     System.out.println("Enter a:");
     a = scanner.nextDouble();

     System.out.println("Enter b:");
     b = scanner.nextDouble();

     x = - b / a;

     System.out.println("x = ");
     System.out.println(x);

      }
}