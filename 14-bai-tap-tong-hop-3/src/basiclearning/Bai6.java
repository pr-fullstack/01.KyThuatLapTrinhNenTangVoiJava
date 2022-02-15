package basiclearning;

/**
 * 6.	In dãy số 2, -4, 6, 8, -10, 12, 14, 16, -18, ….., n (**)
 */
public class Bai6 {
    public static void main(String[] args) {
        int distance = 2;
        int count = 0;

        int n = 18;

        for (int i = 2; i <= n; i += 2) {
            if (++count == distance) {
                distance++;
                count = 0;
                System.out.print(-i + "  ");
            } else {
                System.out.print(i + "  ");
            }
        }
    }
}
