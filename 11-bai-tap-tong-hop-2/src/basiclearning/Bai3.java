package basiclearning;


/**
 * 3.	Nhập vào 2 số nguyên, lưu vào 2 biến a và b.
 *         Sau đó, đảo giá trị của 2 biến này rồi xuất giá trị của chúng ra màn hình console.
 */
public class Bai3 {
    public static void main(String[] args) {
        int a = 1, b = 2;

        // Cách 1: Sử dụng biến tạm
        /*
        int tam = a;
        a = b; // a đang mang giá trị của b
        b = tam;
         */

        // Cách 2: Không sử dụng biến tạm
        a = a + b; // a = a + b;
        b = a - b; // b = a; // b đang mang giá trị của a
        a = a - b; // a = b; a đang mang giá trị của b

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
