package basiclearning;

import java.util.Scanner;

/**
 * 22.	Viết chương trình tính S = a! + b! + c!
 *          với a, b, c là 3 số nguyên dương nhập từ bàn phím.
 */
public class Bai22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        do {
            System.out.print("Nhập vào số nguyên dương a: ");
            a = scanner.nextInt();

            if (a <= 0) {
                System.out.println("Bạn phải nhập vào số nguyên dương, xin kiểm tra lại!!!");
            }
        } while (a <= 0);

        int b;
        do {
            System.out.print("Nhập vào số nguyên dương b: ");
            b = scanner.nextInt();

            if (b <= 0) {
                System.out.println("Bạn phải nhập vào số nguyên dương, xin kiểm tra lại!!!");
            }
        } while (b <= 0);

        int c;
        do {
            System.out.print("Nhập vào số nguyên dương c: ");
            c = scanner.nextInt();

            if (c <= 0) {
                System.out.println("Bạn phải nhập vào số nguyên dương, xin kiểm tra lại!!!");
            }
        } while (c <= 0);

        long factorialA = 1;
        for (int i = 2; i <= a; i++) {
            factorialA *= i;
        }

        long factorialB = 1;
        for (int i = 2; i <= b; i++) {
            factorialB *= i;
        }

        long factorialC = 1;
        for (int i = 2; i <= c; i++) {
            factorialC *= i;
        }

        long factorial = factorialA + factorialB + factorialC;

        System.out.println("S = " + factorial);
    }
}
