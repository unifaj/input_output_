import java.util.Scanner;

public class array_5_1 {
    public static void main(String[] args) {

        char[] name = {'N','a','t','a','l','y','a'}; // Variant 1

        for (char i : name){
            System.out.print(i);
        }

        System.out.print("\n");

        String s = ""; // Variant 2

        for (char i : name){
            s += i;
        }

        System.out.println("Мое имя: " + s);

    }
}
/*Создать массив char, заполненный буквами своего имени в верном порядке. Используя этот массив, вывести свое имя в консоль.
Вариант 1: не используя переменную типа String;
Вариант 2: предварительно собрав значения массива в переменную типа String.
Подсказка для варианта 2: создать пустую строку можно так: String s = “”;*/