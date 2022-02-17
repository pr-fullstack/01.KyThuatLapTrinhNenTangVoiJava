package basiclearning;

/**
 * 23.	Nhập một số nguyên dương n (n > 0).  Hãy cho biết:
 *      a. Có phải là số đối xứng? Ví dụ: 121, 12021, …
 *      b. Có phải là số chính phương? Ví dụ: 0, 1, 4, 9, 16, 25 …
 *      c. Có phải là số nguyên tố? Ví dụ: 2, 3, 5, 7, 11, 13…
 *      d. Các chữ số có tăng dần hay giảm dần không?
 *          Lưu ý ở chỗ này cần phải phân biệt rõ ràng giữa tăng dần“nghiêm ngặt”
 *              và “không nghiêm ngặt”
 *          Tăng dần nghiêm ngặt: Chữ số đằng sau bắt buộc phải lớn hơn đằng trước.
 *              Vd: 123456 Tăng dần không nghiêm ngặt: Chữ số đằng sau có thể
 *                  >= chữ số đằng trước. Vd: 1122334566
 */
public class Bai23SoNguyenTo {
    public static void main(String[] args) {
        int n = 1;

        boolean isPrime = true;
        if (n < 2) {
            isPrime = false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // 51~99
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.printf("%d là số nguyên tố", n);
        }else {
            System.out.printf("%d không phải là số nguyên tố", n);
        }
    }
}
