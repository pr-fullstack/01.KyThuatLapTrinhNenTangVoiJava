package basiclearning;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 1.	Nhập năm sinh của một người. Tính tuổi người đó.
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào tuổi của bạn: ");
        int yearOfBirth = scanner.nextInt();

        // How to + câu hỏi của chúng ta + in java
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println("Tuổi của bạn là: " + (currentYear - yearOfBirth));
    }
}
