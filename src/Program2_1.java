import java.util.Scanner;

public class Program2_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        float a = in.nextFloat();
        System.out.print("Input b: ");
        float b = in.nextFloat();

        float c = b * a * (a + b)/(a * a);

        System.out.printf("Your number: %f \n", c);
        in.close();

    }
}