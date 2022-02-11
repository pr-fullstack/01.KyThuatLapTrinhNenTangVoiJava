package basiclearning;

import java.util.Scanner;

/**
 * 6.	Nhập vào số xe của bạn (gồm tối đa 5 chữ số, mặc định đầu vào đúng).
 *          Cho biết số xe của bạn được mấy nút?
 */
public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào biển số của bạn: ");
        int licensePlate = scanner.nextInt();

        int count = licensePlate % 10;
        licensePlate /= 10; // licensePlate = licensePlate / 10;

        count += licensePlate % 10;
        licensePlate /= 10; // licensePlate = licensePlate / 10;

        count += licensePlate % 10;
        licensePlate /= 10; // licensePlate = licensePlate / 10;

        count += licensePlate % 10;
        licensePlate /= 10; // licensePlate = licensePlate / 10;

        count += licensePlate;

        System.out.println("Số nút của xe bạn là: " + count % 10);
    }
}
