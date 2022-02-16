package basiclearning;

/**
 * 13.	Nhập 2 số nguyên dương a và b.
 * Sau đó in ra ước số chung lớn nhất và bội số chung nhỏ nhất
 * của 2 số nguyên dương a và b đó.
 */
public class Bai13BoiChungNhoNhat {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;

        int min = a < b ? a : b;
        int max = a > b ? a : b;

        for (int i = max; ; i += max) {
            if (i % min == 0) {
                System.out.println("Bội số chung nhỏ nhất: " + i);
                break;
            }
        }
    }
}
