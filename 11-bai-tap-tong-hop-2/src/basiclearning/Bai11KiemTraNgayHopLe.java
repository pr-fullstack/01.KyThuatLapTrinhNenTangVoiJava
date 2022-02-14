package basiclearning;

import java.util.Scanner;

/**
 * 11.	(**) Nhập vào thông tin 1 ngày (ngày - tháng - năm).
 * Kiểm tra ngày có hợp lệ hay không ?
 * Nếu hợp lệ hãy tìm ra ngày kế tiếp (ngày - tháng - năm)
 * & ngày trước đó (ngày - tháng - năm).
 */
public class Bai11KiemTraNgayHopLe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào ngày: ");
        int day = scanner.nextInt();

        System.out.print("Nhập vào tháng: ");
        int month = scanner.nextInt();

        System.out.print("Nhập vào năm: ");
        int year = scanner.nextInt();

        int maxDayOfMonth;
        boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

        switch (month) {
            case 2:
                if (isLeapYear) {
                    maxDayOfMonth = 29;
                } else {
                    maxDayOfMonth = 28;
                }
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                maxDayOfMonth = 30;
                break;
            default:
                maxDayOfMonth = 31;
        }

        if (year < 0 || month < 0 || month > 12 || day > maxDayOfMonth) {
            System.out.printf("%d-%d-%d không phải là ngày hợp lệ", year, month, day);
        } else {
            System.out.printf("%d-%d-%d là ngày hợp lệ", year, month, day);
        }
    }
}
