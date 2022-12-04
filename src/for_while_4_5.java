import java.util.Scanner;

public class for_while_4_5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите вариант 1 или 2: ");
        int variant = in.nextInt();

        int num=0;
        // Вариант 1
        if (variant==1){

            while(num!=1) {
                System.out.println("Введите число: ");
                num = in.nextInt();
                if (num!=1){
                    System.out.println("Не угадал!");
                }
            }

            in.close();
            System.out.println("Ура!");

        // Вариант 2
        } else if ((variant==2)){

            do {
                System.out.println("Не угадал!");
                System.out.println("Введите число: ");
                num = in.nextInt();
            }
            while (num!=1);

            in.close();
            System.out.println("Ура!");

        } else {
            System.out.println("Неправильный вариант!");
        }

        System.out.println("Ура!");
    }
}
