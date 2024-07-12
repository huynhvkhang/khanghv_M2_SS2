import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner khang = new Scanner(System.in);
        System.out.println("Nhập vào một số tự nhiên thứ nhất");
        int a = khang.nextInt();
        System.out.println("Nhập vào một số tự nhiên thứ hai");
        int b = khang.nextInt();
        int sum = a+b;
        if (a > b) {
            System.out.print("Khong hop le!");
            return ;
        }
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum += i;
                System.out.println(i);
                System.out.print("Tổng các số chẵn nằm trong khoảng là: " + sum);
            }
            break;

        }
    }
}