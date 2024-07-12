import java.util.Scanner;

public class baitap8 {
    public static void main(String[] args) {
        Scanner khang = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập số cạnh thứ nhất: ");
            int a = khang.nextInt();
            System.out.println("Nhập số cạnh thứ hai: ");
            int b = khang.nextInt();
            System.out.println("Nhập số cạnh thứ ba: ");
            int c = khang.nextInt();
            int p = ((a + b + c) / 2);
            if (a + b > c && b + c > a && a + c > b) {
                System.out.println(
                        "Diện tích hình tam giác là:" + Math.sqrt(p * (p - a) * p * (p - b) * p * (p - c)));
                System.out.println("Chu vi hình tam giác là:" + (a + b + c));
            } else {
                System.out.println("Vui lòng nhập lại");
                khang.next();
            }
        }
    }
}
