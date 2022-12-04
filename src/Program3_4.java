import java.util.Scanner;

public class Program3_4 {
    public static void main(String[] args) {
//не бойся разделять блоки кода пустыми строками, если они логически обособлены. Иначе код сливается в полотно, которое тяжело читать
        Scanner r = new Scanner(System.in); //советую сразу учиться давать переменным осмысленные имена. r -> scanner
        System.out.println("Введите число 1: ");
        int num1 = r.nextInt();
        System.out.println("Введите число 2: ");
        int num2 = r.nextInt();
        if ((num1 % 2 == 0) ^ (num2 % 3 == 0)) {//не рекомендую использовать XOR, лучше обходиться && и ||. Тем более, здесь нужно ||, а не ^, исходя из условия
            if (num1 > num2) System.out.printf("Число %d больше, чем %d \n", num1, num2);//всегда используй {} для if/else и циклов. Это убережет от глупых ошибок в дальнейшем
            else if (num1 < num2) System.out.printf("Число %d больше, чем %d \n", num2, num1);
            else System.out.printf("Числа %d и %d равны \n", num1, num2);
        }
        if ((num1 % 2 == 0) & (num1 % 3 == 0)) {//не рекомендую использовать () без прямой необходимости. Это загромождает код
            double c = Math.pow(num1, num2);
            if ((-2147483648 > c) | ( c > 2147483647))//еще раз о необходимости {}
                System.out.println("Результат выражения слишком большой!");
            else System.out.printf("Степень числа равна : %f", c);
        }
        r.close();//сканнер стоило бы закрыть после последнего его использования, а не в конце метода
    }
}