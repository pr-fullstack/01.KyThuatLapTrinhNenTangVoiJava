package basiclearning;

import java.util.Scanner;

/**
 * 2.	Nhập 2 số a và b. Tính tổng, hiệu, tính và thương của hai số đó.
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập vào b: ");
        int b = scanner.nextInt();

        System.out.println("======== Kết quả ========");
        System.out.printf("Tổng: %d + %d = %d\n", a, b, a + b);
        System.out.printf("Hiệu: %d - %d = %d\n", a, b, a - b);
        System.out.printf("Tích: %d * %d = %d\n", a, b, a * b);
        System.out.printf("Thương: %d / %d = %f\n", a, b, (double)a / b);
    }
}
