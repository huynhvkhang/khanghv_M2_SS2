import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        Scanner khang = new Scanner(System.in);
        int i;
        boolean isPrime = true;
        String primeNumbersFound = "";
        for (i = 2; i <= 100; i++) {
            isPrime = CheckPrime(i);
            if (isPrime) {
                primeNumbersFound = primeNumbersFound + i + " ";
            }
        }
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: " );
        System.out.println(primeNumbersFound);
    }
    public static boolean CheckPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            if (remainder == 0) {
                return false;
            }
        }
        return true;

    }

}