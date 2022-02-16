package basiclearning;

import java.util.Scanner;

/**
 * 20.	Làm lại các bài tập trên bằng cách
 *          thay vì sử dụng vòng lặp for thì dùng vào lặp while. (*)
 */
public class Bai20 {
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
        while (i < n) {
            System.out.print(i + ", ");
            i++;
        }
        System.out.print(i);
    }
}
