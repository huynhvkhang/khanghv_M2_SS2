import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner khang = new Scanner(System.in);
        int a = 0;
        for (int i = 0; i < 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("Step: " + a + " Meaning: ");
                    System.out.println(i);
            }
        }
    }
}