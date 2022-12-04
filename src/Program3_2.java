import java.util.Scanner;

public class Program3_2 {
    public static void main(String[] args){

        Scanner  string = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String greeting = string.nextLine();

        System.out.println("FOR IF - ELSE");
        if (greeting.equals("Hello"))  System.out.println("Hello");
        else if (greeting.equals("Bye"))  System.out.println("Good bye");
        else if (greeting.equals("How are you"))  System.out.println("How are you doing");
        else System.out.println("Unknown message");

        System.out.println("FOR SWITCH - CASE");
        switch (greeting){
            case "Hello" :
                System.out.println("Hello");
                break;
            case "Bye" :
                System.out.println("Good bye");
                break;
            case "How are you" :
                System.out.println("How are you doing");
                break;
            default:
                System.out.println("Unknown message");
        }
        string.close();
     }
}
