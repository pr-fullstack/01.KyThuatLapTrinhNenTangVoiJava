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
public class Bai23SoDoiXung {
    public static void main(String[] args) {
        long n = 12021;

        String str =  n + "";
        int len = str.length();
        boolean isSymmetrical = true;
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                isSymmetrical = false;
                break;
            }
        }

        if (isSymmetrical) {
            System.out.println("Là số đối xứng");
        } else {
            System.out.println("Không phải là số đối xứng");
        }
    }
}
