package basiclearning;

import java.util.Scanner;

/**
 * Giải phương trình bậc 2 ax2+bx+c=0
 * <p>
 * Ctrl + Alt + L => Format code
 */
public class GiaiPhuongTrinhBacHai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập vào b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập vào c: ");
        double c = scanner.nextDouble();

        if (a == 0) { // Phương trình bậc nhất
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else { //c != 0
                    System.out.println("Phương trình vô nghiệm");
                }
            } else { // b != 0
                System.out.println("Phương trình có nghiệm x = " + -c / b);
            }
        } else { // Phương trình bậc 2 có a != 0
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiệm duy nhất : x = " + -b / (2 * a));
            } else {
                System.out.println("x1 = " + (-b + Math.sqrt(delta)) / (2 * a));
                System.out.println("x2 = " + (-b - Math.sqrt(delta)) / (2 * a));
            }
        }
    }
}
