package basiclearning;

import java.util.Scanner;

/**
 * 1.	In dãy số 1, 2, 3, 4, 5 … n (n là số nhập vào từ bàn phím)
 */
public class Bai1 {
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

        int i = 1;
        for (; i < n; i++) {
            System.out.print(i + ", ");
        }
        System.out.print(i);
    }
}
