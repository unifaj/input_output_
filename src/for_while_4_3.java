import java.util.Scanner;

public class for_while_4_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину прямоугольника: ");
        int length = in.nextInt();

        System.out.println("Введите ширину прямоугольника: ");
        int width = in.nextInt();
        in.close();

        for(int i=0; i<length; i++){
            for(int j=0; j<width; j++){
                if ((i==0&j==0)|(i==0&j==width-1)|(i==length-1&j==0)|(i==length-1&j==width-1)) {
                    System.out.print(" ");
                }
                else if (i==0&j>0&j<width-1) {
                    System.out.print("-");
                }
                else if (i==length-1&j>0&j<width-1) {
                    System.out.print("-");
                }
                else if (i>0|i<length-1)
                {
                    if (j==0|j==width-1) {
                        System.out.print("|");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                }
            System.out.println("");
            }
        }
}
