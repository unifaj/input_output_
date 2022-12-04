import java.util.Scanner;

public class for_while_4_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = in.nextInt();
        in.close();

        for(int i=1;i<11;i++)
        {
            if (i%2==0) {
                System.out.printf("Сумма чисел %d и %d равна: %d \n",i,num,i+num);
            } else {
                System.out.printf("Разность чисел %d и %d равна: %d \n",i,num,i-num);
            }

            if (i==num){
                System.out.println("Числа равны!");
            }
        }
    }
}
