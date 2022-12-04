import java.util.Scanner;

public class Method_7_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        double digit = scanner.nextInt();
        scanner.close();

        if (digit < 1) {
            System.out.println("n < 1");
        } else {
            System.out.println("Произведение вложенных квадратных корней равно : " + sqrt(digit, digit));
        }
    }

    static double sqrt(double n, double b) {

        if (b == 0) {
            return n;
        }

        return sqrt(Math.sqrt(n) + (b - 1), b - 1);
    }
}