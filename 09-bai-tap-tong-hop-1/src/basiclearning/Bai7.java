package basiclearning;

/**
 * 7.	Tìm a biết:
 *
 *      h.	int a = 10;
 *          a += a++ + ++a;
 */
public class Bai7 {
    public static void main(String[] args) {
        int a = 10;
        a += a++ + ++a;
        // a = a + a++ + ++a;
        //    10 + 10 + 12
        //a = 12;

        System.out.println(a);
    }
}
