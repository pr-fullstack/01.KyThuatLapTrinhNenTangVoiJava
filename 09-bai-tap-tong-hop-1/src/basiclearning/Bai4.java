package basiclearning;

import java.util.Scanner;

/**
 * 4.	Nhập điểm thi và hệ số 3 môn Toán, Lý, Hóa của một học sinh.
 *          Tính điểm trung bình của học sinh đó.
 *
 *          Điểm trung bình = (điểm toán * hệ số toán + điểm lý * hệ số lý + điểm hóa * hệ số hóa)
 *                       / (hệ số toán + hệ số lý + hệ số hóa)
 */
public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào điểm toán: ");
        double mathScore = scanner.nextDouble();

        System.out.print("Nhập vào hệ số toán: ");
        double mathCoefficient = scanner.nextDouble();

        System.out.print("Nhập vào điểm lý: ");
        double physicsScore = scanner.nextDouble();

        System.out.print("Nhập vào hệ số lý: ");
        double physicsCoefficient = scanner.nextDouble();

        System.out.print("Nhập vào điểm hóa: ");
        double chemistryScore = scanner.nextDouble();

        System.out.print("Nhập vào hệ số hóa: ");
        double chemistryCoefficient = scanner.nextDouble();

        double averageScore = (mathScore * mathCoefficient
                + physicsScore * physicsCoefficient
                + chemistryScore * chemistryCoefficient)
                / (mathCoefficient + physicsCoefficient + chemistryCoefficient);

        System.out.println("Điểm trung bình của bạn là: " + averageScore);
    }
}
