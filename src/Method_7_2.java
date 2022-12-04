import java.util.Scanner;

public class Method_7_2 {
    public static void main(String[] args) {

        int a = 7;
        int b = 11;
        int c = 5;

        System.out.println(sumDigital('f','d','i',' ',a));

        System.out.println(sumDigital(a > b, true, c ==  5));
        System.out.println(sumDigital(a < b, true, c ==  5));

        System.out.println(sumDigital(a, 900000000,900000000,900000000));

        System.out.println(sumDigital(9, 2, 6, 7, 'f'));
    }

    static int sumDigital(int... digital) {

        long sum = 0;
        int sumInt = 0;

        for (int i : digital) {
            sum += i;
        }
        if (sum > 2147483647 || sum < -2147483648){

            System.out.println("Сумма превышает тип int, точность потеряна");
        }
        sumInt = (int)sum;
        return sumInt;
    }
    static byte sumDigital(byte... digital) {

        long sum = 0;
        byte sumByte = 0;

        for (byte i : digital) {
            sum += i;
        }
        if (sum > 127 || sum<-128){

            System.out.println("Сумма превышает тип byte, точность потеряна");
        }
        sumByte = (byte)sum;
        return sumByte;
    }
    static short sumDigital(short... digital) {

        long sum = 0;
        short sumShort = 0;

        for (short i : digital) {
            sum += i;
        }
        if (sum > 32767 || sum < -32767){

            System.out.println("Сумма превышает тип byte, точность потеряна");
        }
        sumShort = (short) sum;
        return sumShort;
    }
    static boolean sumDigital(boolean... digital) {

        for (boolean i : digital) {

            if (!i){

                return false;
            }
        }
        return true;
    }
    static String sumDigital(char... digital) {

        String sum = "";

        for (char i : digital) {

            sum += i;
        }
        return sum;
    }
}
