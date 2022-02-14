package basiclearning;

import java.util.Scanner;

public class VongLapDoWhile {
    public static void main(String[] args) {
//        int i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i < 5);

        // Nhập vào số nguyên dương
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào số nguyên dương: ");
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Bạn phải nhập vào số nguyên dương, xin kiểm tra lại!!!");
            }
        } while (n <= 0);

        System.out.println(n);
    }
}
