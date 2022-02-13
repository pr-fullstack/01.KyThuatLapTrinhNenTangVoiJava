package basiclearning;

import java.util.Scanner;

/**
 * 10.	Kiểm tra 1 số nguyên dương x có phải là số chính phương hay không ?
 *  Định nghĩa số chính phương: Là số mà kết quả khai căn bậc 2 của nó là 1 số nguyên.
 *      vd: 0, 1, 4, 9, 16, 25, 36 ...
 */
public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên dương x: ");
        int x = scanner.nextInt();

        if ( x < 0) {
            System.out.println("x phải là số nguyên dương, xin kiểm tra lại!!!");
        } else {
            // Cách 1
            // double sqrt = Math.sqrt(x);
            // if ((int)sqrt == sqrt) {

            // Cách 2
            int sqrt = (int)Math.sqrt(x);
            if (sqrt * sqrt == x) {
                System.out.printf("%d là số chính phương", x);
            } else {
                System.out.printf("%d không phải là số chính phương", x);
            }
        }
    }
}
