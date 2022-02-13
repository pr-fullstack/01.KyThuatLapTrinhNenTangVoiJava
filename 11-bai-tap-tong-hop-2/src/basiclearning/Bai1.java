package basiclearning;

/**
 * 1.	Tính giá trị của biến c và biến d:
 * boolean a = true&&false;
 * boolean b = (3 > 100) || (25%5 == 0)
 * boolean c = a && b;
 * boolean d = !a || b;
 */
public class Bai1 {
    public static void main(String[] args) {
        boolean a = true && false; // false
        boolean b = (3 > 100) || (25 % 5 == 0); // true
        boolean c = a && b; // false
        boolean d = !a || b; // true

        System.out.println(c);
        System.out.println(d);
    }
}
