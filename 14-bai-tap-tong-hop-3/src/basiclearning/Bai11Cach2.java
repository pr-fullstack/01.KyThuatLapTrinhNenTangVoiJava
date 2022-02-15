package basiclearning;

/**
 * 11.	Viết chương trình tính  :
 * S = 1 + 1/3! + 1/5! + ….. + 1/(2n-1)!    (*)
 * Số n được nhập từ bàn phím
 */
public class Bai11Cach2 {
    public static void main(String[] args) {
        int n = 2;

        double s = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            s += 1.0 / factorial;
            factorial *= (2 * i) * (2 * i + 1);// tính cho bước tiếp theo
        }
        System.out.println("S = " + s);
        //Bước 1 => 1!
        // Bước 2 => 3!
        // Bước 3 => 5!
    }
}
