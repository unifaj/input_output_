import java.util.Scanner;

public class Method_7_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        System.out.println("Факториал равен : " + factorial(scanner.nextLong()));
        scanner.close();
    }
    static long factorial(long a){

        if (a == 1){

            return 1;
        }
        return a * factorial(a-1);
    }
}