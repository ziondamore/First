import java.util.Scanner;

public class LineEquation {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     double b;
     double a;
     double x;

     System.out.println("ax + b = 0");

     System.out.print("Enter a: ");
     a = scanner.nextDouble();

     System.out.print("Enter b: ");
     b = scanner.nextDouble();

     if (a == 0) {
         if (b == 0) {
             System.out.print("x-any ");
         } else {
             System.out.print("not");
         }
     } else {
         x = -b / a;
         System.out.print("x = ");
         System.out.println(x);
     }

      }
}