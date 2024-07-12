import java.util.Scanner;
public class baitap1 {
    public static void main(String[] args) {
    Scanner khang =new Scanner(System.in);
    while (true){
        System.out.println("Nhập vào một số tự nhiên bất kì");
        if(khang.hasNextInt()){
            int a = khang.nextInt();
            if(a % 3 == 0 && a % 5 == 0){
                System.out.println("Là số chia hết cho 3 và 5");
            }else {
                System.out.println("Là số không chia hết cho 3 và 5");
            }
            break;
        }else {
            System.out.println("không phải là số nguyên mời bạn nhập lại ");
                   khang.next();
                }
        

       }
    }
}