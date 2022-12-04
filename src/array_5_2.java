import java.util.Scanner;

public class array_5_2 {
    public static void main(String[] args) {

        int[] digit = new int[5];

        Scanner in = new Scanner(System.in);

        for (int i=0; i<digit.length; i++){
            digit[i] = in.nextInt();
        }
        in.close();

        for (int i=0; i<digit.length; i++){
            if (i==0){
                System.out.println(digit[0]+digit[digit.length-1]);
            } else {
                System.out.println(digit[i]+digit[i-1]);
            }
        }
    }
}
/*Создать массив int’ов из 5 элементов. Заполнить его значениями, введенными с клавиатуры.
Вывести на экран сумму каждого значения с предыдущим. Предыдущим значением для 0го элемента
считать последнее значение массива.*/