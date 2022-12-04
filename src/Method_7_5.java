import java.util.Scanner;

public class Method_7_5 {
    public static void main(String[] args) {

        int[] digit = new int[10];

        int i = 0;
        int j = 2;

        while (i < 10) {

            int k = 2;
            boolean isPrime;
            isPrime = isPrimeNumbers(j, k);

            if (isPrime)
            {
                digit[i] = j;
                i++;
            }
            j++;

        }
        System.out.println(sumPrimeNumbers(0, 0, digit));
    }

    static int sumPrimeNumbers(int sum, int i, int... digit) {

        if (i == 10) {
            return sum;
        } else {
            sum += digit[i];
            i++;
            return sumPrimeNumbers(sum, i, digit);
        }
    }

    static boolean isPrimeNumbers(int j, int k) {

        if (k > j) {
            return true;
        } else if (j % k == 0 & k != j) {
            return false;
        } else {
            k++;
            return isPrimeNumbers(j, k);
        }
    }
}

