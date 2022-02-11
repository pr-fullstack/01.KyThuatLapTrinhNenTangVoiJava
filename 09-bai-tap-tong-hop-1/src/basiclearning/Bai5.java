package basiclearning;

import java.util.Scanner;

/**
 * 5.	Nhập bán kính của đường tròn.
 *          Tính chu vi và diện tích của hình tròn đó.
 *
 *          Chu vi: c = 2 * r * pi;
 *  		Diện tích: s = r * r * pi
 */
public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào bán kính r: ");
        double r = scanner.nextDouble();

        double c = 2 * r * Math.PI;
        double s = r * r * Math.PI;

        System.out.println("Chu vi: " + c);
        System.out.println("Diện tích: " + s);
    }
}
