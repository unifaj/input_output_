public class Program1_1 {

    public static void main(String[] args) {
        int a = 17;
        int b = 8;
        int c;
        c = a;
        a = b;
        b = c;

        System.out.println("Значение а: " + a + ". Значение b: " + b);

        a = 17;
        b = 8;
        a = a - b; // а равна разнице между а и б
        b = b + a;
        a = b - a;

        System.out.println("Меняем значения без третьей переменной. Значение а: " + a + ". Значение b: " + b);
    }

}