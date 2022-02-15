package basiclearning;

/**
 * 10.	Viết chương trình tính :
 *  S = 1 + 1/2 + 1/3 + .... + 1/n
 *  Số n được nhập từ bàn phím
 */
public class Bai10 {
    public static void main(String[] args) {
        int n = 2;
        double s = 0;

        for (int i = 1; i <= n; i++) {
            s +=  1.0 / i;
        }

        System.out.println("S = " + s);
    }
}
