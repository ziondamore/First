import java.util.Scanner;

public class LineEquation {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int b;
     int a;
     int x;

     System.out.println("Enter a:");
     a = scanner.nextInt();

     System.out.println("Enter b:");
     b = scanner.nextInt();

     x = (-b) / a;

     System.out.println("x = " + x);

      }
}