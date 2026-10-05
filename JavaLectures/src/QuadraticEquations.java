/**
 * class displays the roots of quadratic equation
 * ax^2 + bx + c = 0
 * Declare two roots
 * Get a,b from input
 * compute delta = b^2 - 4ac
 * if d = 0  then r1 = r2 = -b / 2a
 * if d > 0:
 *         r1 = (-b + math.sqrt(delta)) / 2a
 *         r2 = (-b - math.sqrt(delta)) / 2a
 * if d < 0:
 *      compute x
 *      compute y
 *      r1= x+yi
 *      r2= x+yi
 */
import java.util.Scanner;
class QuadraticEquations {
    public static void main(String[] args) {
        double a, b, c, real, img, firstroot, secondroot, delta;
        double epsilon = 1e-9;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a, b, and c: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        delta = (b * b) - (4 * a * c);

        if (Math.abs(delta) < epsilon){
            firstroot = secondroot = -b / (2*a);
            System.out.println("r1 = r2 = "+firstroot);
        }
        else if(delta > 0){
            firstroot = (-b + Math.sqrt(delta))/ (2*a);
            secondroot = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("r1 = "+ firstroot);
            System.out.println("r2 = "+ secondroot);
        }
        else{
            real = -b / (2*a);
            img = Math.sqrt(-delta)/ (2*a);
            System.out.println("r1 = "+real+" + "+img+"i");
            System.out.println("r2 = "+real+" - "+img+"i");
        }
    }
}