package basiclearning;

/**
 * 4.	In dãy số 2, 4, -6, 8, 10, -12 … n (bằng ít nhất 2 cách khác nhau)
 *      (n là số nhập vào từ bàn phím)
 */
public class Bai4 {
    public static void main(String[] args) {
        // Cách 1 => tượng tự bài 3

        // Cách 2
        int distance = 3;
        int count = 0;

        int n = 16;

        for (int i = 2; i <= n; i += 2) {
//            count++;
            if (++count == distance) {
                count = 0;
                System.out.print(-i + "  ");
            } else {
                System.out.print(i + "  ");
            }
        }
    }
}
