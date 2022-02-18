package basiclearning;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 7.	Viết chương trình nhập thông tin của một nhân viên trong công ty.
 *      Thông tin cần nhập vào bao gồm:
 *          họ tên
 *          tuổi
 *          giới tính
 *          mức lương cơ bản
 *          điểm trung bình tốt nghiệp đại học (theo thang điểm 10).
 *      Sau khi nhập xong thì in thông tin đã nhập ra.
 */
public class Bai7NhapThongTinMotNhanVien {
    static String hoTen = "";
    static int tuoi = 0;
    static String gioiTinh = "";
    static double luongCB = 0.0;
    static double diemTB = 0.0;

    public static void main(String[] args) {
        nhapThongTinMotNhanVien();
        xuatThongTinMotNhanVien();
    }

    static void nhapThongTinMotNhanVien() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào họ tên: ");
        hoTen = scanner.nextLine();

        System.out.print("Nhập vào tuổi: ");
        tuoi = scanner.nextInt();

        System.out.print("Nhập vào giới tính: ");
        scanner.nextLine();
        gioiTinh = scanner.nextLine();

        System.out.print("Nhập vào lương cơ bản: ");
        luongCB = scanner.nextDouble();

        System.out.print("Nhập vào điểm TB: ");
        diemTB = scanner.nextDouble();
    }

    static void xuatThongTinMotNhanVien() {
        System.out.println("Họ Tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Lương cơ bản: " + new BigDecimal(luongCB));
        System.out.println("Điểm TB: " + diemTB);
    }
}
