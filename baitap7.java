import java.util.Scanner;

public class baitap7 {
    public static void main(String[] args) {
        Scanner khang = new Scanner(System.in);
        int a;
        for (;;) {
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3");
            System.out.println("4. Thoát");
             
            do {
                System.out.println("Bấm số để chọn (1/2/3/4): ");
                a = khang.nextInt();
            } while ((a < 1) || (a > 4));
             
            switch (a) {
                case 1:
                    System.out.println("Bạn chọn kiểm tra tính chẵn lẻ của 1 số!");
                    break;
                case 2:
                    System.out.println("Bạn chọn kiểm tra số nguyên tố!");
                    break;
                case 3:
                    System.out.println("Bạn chọn kiểm tra một số có chia hết cho 3!");
                    break;
                case 4:
                    System.out.println("Bạn chọn chức năng thoát! Tạm biệt!");
                    System.exit(0);
                    break;
            }
        }
    }
 
}