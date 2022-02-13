package basiclearning;

import java.util.Scanner;

/**
 * 9.	(*) Nhập vào 1 ký tự là chữ cái.
 *      Nếu nhập sai thì báo thông báo đã nhập sai.
 *      Nếu đúng thì đi kiểm tra nếu đó đang là chữ cái thường thì biến nó thành chữ cái hoa,
 *          nếu nó là chữ cái hoa thì biến nó thành chữ cái thường.
 *              Gợi ý: Ký tự chữ cái thường và hoa có mã ASCII cách nhau 32 đơn vị.
 *                  Vd: 'a' là 97, 'A' là 65
 */
public class Bai9 {
    public static void main(String[] args) {
        // Bước 1: nhập 1 ký tự
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào ký tự: ");
        String str = scanner.next(); //Quang
        char c = str.charAt(0);
        // Bước 2: Kiểm tra là chữ
        if (c >= 'A' && c <= 'Z') { //HOA
            System.out.printf("Kết quả: %c", c + 32);
        } else if (c >= 'a' && c <= 'z') {
            System.out.printf("Kết quả: %c", c - 32);
        } else {
            System.out.println("Không phải là chữ");
        }
    }
}
