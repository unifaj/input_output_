import java.util.Scanner;

public class Class_8_1 {
    public static void main(String[] args) {

        Counter first = new Counter("Первый счетчик");
        Counter second = new Counter("Второй счетчик", 0);

        Scanner num = new Scanner(System.in);
        System.out.println("Введите целое значение для поиска четных и нечетных чисел");

        int range = num.nextInt();
        num.close();

        int even = 0;
        int notEven = 0;
        for (int i = 1; i <= range; i++) {
            if (i % 2 == 0) {
                even = first.increasCount1();
            } else {
                notEven = second.increasCount1();
            }
        }
        System.out.printf("В интервале от 1 до %d : \n", range);
        System.out.printf("Четных чисел %d : \n", even);
        System.out.printf("Нечетных чисел : %d", notEven);

    }
}

class Counter {

    String nameCounter;
    int firstCounter;

    Counter(String name, int count) {
        nameCounter = name;
        firstCounter = count;
    }

    Counter(String name) {
        nameCounter = name;
        firstCounter = 0;
    }

    int increasCount1() {
        return ++firstCounter;
    }

    int decreasCount1() {
        return --firstCounter;
    }

    int increasCountInput(int k) {
        firstCounter += k;
        return firstCounter;
    }

    int decreasCountInput(int k) {
        firstCounter -= k;
        return firstCounter;
    }
}
