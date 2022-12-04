import java.util.Scanner;

public class for_while_4_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = in.nextInt();
        in.close();

        int sum = 0;
        while(num>0){

            sum += num%10;
            num = num/10;

        }

        System.out.printf("Сумма цифр числа равна: %d",sum);
    }
}
