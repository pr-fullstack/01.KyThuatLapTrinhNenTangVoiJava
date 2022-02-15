package basiclearning;

import java.util.Scanner;

/**
 * 2.	In dãy số 1, 3, 5, 7, 9 … n (n là số nhập vào từ bàn phím)
 * <p>
 * Ctrl + Shift + ↑ ↓: Di chuyển code
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào số nguyên dương: ");
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Bạn phải nhập vào số nguyên dương, xin kiểm tra lại!!!");
            }
        } while (n <= 0);

        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + "  ");
        }
    }
}
