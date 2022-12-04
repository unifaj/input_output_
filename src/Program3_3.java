import java.util.Scanner;

public class Program3_3 {
    public static void main(String[] args) {
//обрати внимание на добавленные пустые строки ниже
        Scanner string = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = string.nextLine();

        System.out.println("Введите фамилию: ");
        String surname = string.nextLine();

        System.out.println("Введите отчество: ");
        String patronymic = string.nextLine();

//"" здесь не нужно. У тебя и так строки:)
        System.out.println("" + surname + " " + name + " " + patronymic);
        System.out.printf("%s %s %s",surname,name,patronymic);//пробелы между параметрами. Также советую комбинацию ctrl+alt+L в IDEA

        string.close();//уже говорил о закрытии сканера в предыдущей программе. И об осмысленности названий
    }
}
