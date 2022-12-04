import java.util.Scanner;

public class for_while_4_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = in.nextInt();

        long factorial = 1;

        for(int i = 1; i <= num; i++){
            factorial *= i;
        }
        System.out.printf("Факториал числа %d равен %d",num,factorial);
        in.close();
    }
}
