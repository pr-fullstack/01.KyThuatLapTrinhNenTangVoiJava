package basiclearning;

/**
 * 11.	Viết chương trình tính  :
 * S = 1 + 1/3! + 1/5! + ….. + 1/(2n-1)!    (*)
 * Số n được nhập từ bàn phím
 */
public class Bai11 {
    public static void main(String[] args) {
        int n = 2;

        double s = 0;
        int x, factorialX, j;
        for (int i = 1; i <= n; i++) {
            x = 2 * i - 1;
            factorialX = 1; //Tính toán dc giai thừa của x
            for (j = 2; j <= x; j++) {
                factorialX *= j;
            }
            s += 1.0 / factorialX;
        }
        System.out.println("S = " + s);
    }
}
