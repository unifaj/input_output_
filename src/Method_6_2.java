import java.util.Scanner;

public class Method_6_2 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.println("Введите число 1: ");
        int num1 = num.nextInt();

        System.out.println("Введите число 2: ");
        int num2 = num.nextInt();

        num.close();

        if (num1 % 2 == 0 || num2 % 3 == 0) {

            if (num1 > num2){
                System.out.printf("Число %d больше, чем %d \n", num1, num2);
            }
            else if (num1 < num2){
                System.out.printf("Число %d больше, чем %d \n", num2, num1);
            }
            else {
                System.out.printf("Числа %d и %d равны \n", num1, num2);
            }
        }
        if (num1 % 2 == 0 & num1 % 3 == 0) {
            testDigital(num1,num2);
        }
    }
    static void testDigital(int num1, int num2){

        double c = Math.pow(num1, num2);

        if (-2147483648 > c || c > 2147483647) {
            System.out.println("Результат выражения слишком большой!");
        }
        else System.out.printf("Степень числа равна : %f", c);
    }
}