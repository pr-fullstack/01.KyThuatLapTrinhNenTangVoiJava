package basiclearning;

import java.util.Scanner;

/**
 * Giải phương trình bậc nhất ax + b = 0
 */
public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập vào b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else { //b != 0
                System.out.println("Phương trình vô nghiệm");
            }
        } else { // a != 0
            System.out.println("Phương trình có nghiệm x = " + -b/a);
        }
    }
}
