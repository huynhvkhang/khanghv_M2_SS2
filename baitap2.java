import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner khang = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập vào một số nguyên bất kì: ");
            if (khang.hasNextInt()) {
                int a = khang.nextInt();
                if (1 <= a && a <= 9) {
                    switch (a) {
                        case 1:
                            System.out.println("Số một");
                            break;
                        case 2:
                            System.out.println("Số hai");
                            break;
                        case 3:
                            System.out.println("Số ba");
                            break;
                        case 4:
                            System.out.println("Số bốn");
                            break;
                        case 5:
                            System.out.println("Số năm");
                            break;
                        case 6:
                            System.out.println("Số sáu");
                            break;

                        case 7:
                            System.out.println("Số bảy");
                            break;
                        case 8:
                            System.out.println("Số tám");
                            break;
                        case 9:
                            System.out.println("Số chín");
                            break;
                    }
                    break;
                } else {
                    System.out.println("không phải là số nguyên từ 2 đến 9 ");
                    khang.next();
                }
            } else {
                System.out.println("không phải là số nguyên mời bạn nhập lại ");
                khang.next();
            }
        }
    }
}