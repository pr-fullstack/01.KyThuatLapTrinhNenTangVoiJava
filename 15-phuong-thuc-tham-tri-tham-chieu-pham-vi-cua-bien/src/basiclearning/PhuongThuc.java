package basiclearning;

/**
 * Khi học C/C++ => Hàm, Thủ tục
 * Khi học Java => Phương thức (method)
 */
public class PhuongThuc {
    public static void main(String[] args) {
        int a = 1, b = 2;

        int total = tinhTong(a, b);

        System.out.println(total);
    }

    static int tinhTong(int x, int y) {
        int s = x + y;
        return s;
    }
}
