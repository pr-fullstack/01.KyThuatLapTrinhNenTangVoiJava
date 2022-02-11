package basiclearning;

import java.util.Scanner;

/**
 * 3.	Nhập tên sản phẩm, số lượng và đơn giá. Tính tiền và thuế giá trị gia tăng phải trả, biết:
 * a. tiền = số lượng * đơn giá
 * b. thuế giá trị gia tăng = 10%
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào tên sản phẩm: ");
        String productName = scanner.nextLine();

        System.out.print("Nhập vào số lượng sản phẩm: ");
        int quantity = scanner.nextInt();

        System.out.print("Nhập vào đơn giá sản phẩm: ");
        double unitPrice = scanner.nextDouble();

        //a. tiền = số lượng * đơn giá
        double money = quantity * unitPrice;

        // b. thuế giá trị gia tăng = 10%
        double tax = money * 0.1;

        System.out.println("======== Kết quả ========");
        System.out.println("Tên sản phẩm: " + productName);
        System.out.println("Tên số lượng: " + quantity);
        System.out.println("Tên đơn giá: " + unitPrice);
        System.out.println("Tổng tiền: " + money);
        System.out.println("Tổng thuế: " + tax);
    }
}
