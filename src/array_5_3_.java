public class array_5_3_ {
    public static void main(String[] args) {

        int[] digit = new int[10];

        int i = 0;
        int j = 2;
        int sum = 0;
        int counter = 0;

        while (i<10){

            for (int k=2; k<=j;k++){
                if (j%k==0&k!=j){
                    counter = 1;
                }
            }

            if (counter==0){
                digit[i] = j;
                sum += digit[i];
                i++;
            }
            j++;
            counter = 0;
        }

        System.out.println(sum);
    }
}
/*Вычислить из записать в массив первые 10 простых чисел.
Простое число – положительное целое число, которое делится без остатка лишь на себя и на 1. 1 не является простым числом.
Вывести в консоль сумму всех элементов полученного массива.*/