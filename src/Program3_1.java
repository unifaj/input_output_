import java.util.Scanner;

public class Program3_1 {
    public static void main(String[] args){

        Scanner r = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int num1 = r.nextInt();
        System.out.println("Введите число 2: ");
        int num2 = r.nextInt();
        if (num1%2 == 0) {
            System.out.println("Произведение двух чисел равно: " + num1 * num2);
        } else {
            System.out.println("Частное двух чисел равно: " + num1 / num2);
        }
        if (num1 == num2) System.out.println("Числа равны");
        r.close();
    }
}
