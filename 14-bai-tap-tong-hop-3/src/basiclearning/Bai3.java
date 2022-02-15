package basiclearning;

/**
 * 3.	In dãy số 2, -4, 6, -8, 10 … n (n là số nhập vào từ bàn phím) (*)
 */
public class Bai3 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 2; i <= n; i += 2) {
            if (i % 4 == 0) {
                System.out.print(-i + "  ");
            } else {
                System.out.print(i + "  ");
            }
        }
    }
}
