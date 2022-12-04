import java.util.Scanner;

public class Method_6_1 {
    public static void main(String[] args){

        Scanner  string = new Scanner(System.in);
        System.out.println("Введите строку: ");

        printGreeting(string.nextLine());
        string.close();
     }
     static void printGreeting (String greeting){

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
     }
}
