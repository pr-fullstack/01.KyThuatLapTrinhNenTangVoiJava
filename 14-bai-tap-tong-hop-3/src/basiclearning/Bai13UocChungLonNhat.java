package basiclearning;

/**
 * 13.	Nhập 2 số nguyên dương a và b.
 * Sau đó in ra ước số chung lớn nhất và bội số chung nhỏ nhất
 * của 2 số nguyên dương a và b đó.
 */
public class Bai13UocChungLonNhat {
    public static void main(String[] args) {
        int a = 27;
        int b = 45;

        int min = a < b ? a : b;
        int max = a > b ? a : b;

        if (max % min == 0) {
            System.out.println("Ước số chung lớn nhất: " + min);
        } else {
            for(int i = min / 2; ; i--) {
                if (a % i == 0 && b % i == 0) {
                    System.out.println("Ước số chung lớn nhất: " + i);
                    break;
                }
            }
        }
    }
}
