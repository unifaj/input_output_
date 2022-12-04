import java.util.Scanner;

public class Program2_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();

        boolean c = (a * a) > (b * b * b);

        System.out.printf("Your result: %b \n", c);
        in.close();

    }
}
