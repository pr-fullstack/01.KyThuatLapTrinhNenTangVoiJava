package basiclearning;

/**
 * 19.	Viết chương nhập vào một số nguyên dương n.
 *          Sau đó quy đổi n ra hệ nhị phân. (*)
 */
public class Bai19 {
    public static void main(String[] args) {
        long n = 1000000000000000000L;
        String str = "";
        while (n > 0) {
            str += n % 2;
            n /= 2;
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        //110111100000101101101011001110100111011001000000000000000000
        //110111100000101101101011001110100111011001000000000000000000
    }
}
