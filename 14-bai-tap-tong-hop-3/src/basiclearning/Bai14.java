package basiclearning;

/**
 * 14.	In hình * sau đây: (chiều dài các cạnh là không cố định)
 *          * * * * * *
 *          *         *
 *          *         *
 *          *         *
 *          *         *
 *          * * * * * *
 */
public class Bai14 {
    public static void main(String[] args) {
        int n = 6;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
               if (i == 1 || i == n || j == 1 || j == n) {
                   System.out.print("* ");
               } else {
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
}
