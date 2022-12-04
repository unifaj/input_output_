import java.util.Scanner;

public class Method_7_1 {
    public static void main(String[] args) {

        Scanner text = new Scanner(System.in);
        System.out.println("Введите строки: ");

        String str = text.nextLine();
        text.close();

        System.out.println("Конкатенация строк: " + sumString(str.split(" ")));
    }
    static String sumString(String ...str){

        String concat = "";

        for (String i:str){

            concat += " " + i;
        }
        return concat;
    }
}