package basiclearning;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 8.	Viết chương trình nhập thông tin của n nhân viên trong công ty
 *      (n nhập vào từ bàn phím, n <= 5).
 *      Thông tin cần nhập tương tự ở câu trên.
 *      Sau khi nhập xong thì in thông tin đã nhập ra.
 *          Lưu ý: in ra n nhân viên cùng lúc,
 *              không phải nhập nhân viên nào in nhân viên đó ra luôn.
 */
public class Bai8NhapThongTinNNhanVien {
    static String hoTen1;
    static int tuoi1;
    static String gioiTinh1;
    static double luongCB1;
    static double diemTB1;

    static String hoTen2;
    static int tuoi2;
    static String gioiTinh2;
    static double luongCB2;
    static double diemTB2;

    static String hoTen3;
    static int tuoi3;
    static String gioiTinh3;
    static double luongCB3;
    static double diemTB3;

    static String hoTen4;
    static int tuoi4;
    static String gioiTinh4;
    static double luongCB4;
    static double diemTB4;

    static String hoTen5;
    static int tuoi5;
    static String gioiTinh5;
    static double luongCB5;
    static double diemTB5;

    public static void main(String[] args) {
        int n = 2;
        System.out.println("======== Nhập thông tin nhân viên ========");
        if (n == 1) {
            System.out.println("====== Nhập vào thông tin nhân viên thứ 1 ======");
            nhapThongTinNhanVien1();
        } else if (n == 2) {
            System.out.println("====== Nhập vào thông tin nhân viên thứ 1 ======");
            nhapThongTinNhanVien1();
            System.out.println("====== Nhập vào thông tin nhân viên thứ 2 ======");
            nhapThongTinNhanVien2();
        } else if (n == 3) {
            System.out.println("====== Nhập vào thông tin nhân viên thứ 1 ======");
            nhapThongTinNhanVien1();
            System.out.println("====== Nhập vào thông tin nhân viên thứ 2 ======");
            nhapThongTinNhanVien2();
            System.out.println("====== Nhập vào thông tin nhân viên thứ 3 ======");
            nhapThongTinNhanVien3();

        } else if (n == 4) {
            System.out.println("====== Nhập vào thông tin nhân viên thứ 1 ======");
            nhapThongTinNhanVien1();
            System.out.println("====== Nhập vào thông tin nhân viên thứ 2 ======");
            nhapThongTinNhanVien2();
            System.out.println("====== Nhập vào thông tin nhân viên thứ 3 ======");
            nhapThongTinNhanVien3();
            System.out.println("====== Nhập vào thông tin nhân viên thứ 4 ======");
            nhapThongTinNhanVien4();
        } else if (n == 5) {
            System.out.println("====== Nhập vào thông tin nhân viên thứ 1 ======");
            nhapThongTinNhanVien1();
            System.out.println("====== Nhập vào thông tin nhân viên thứ 2 ======");
            nhapThongTinNhanVien2();
            System.out.println("====== Nhập vào thông tin nhân viên thứ 3 ======");
            nhapThongTinNhanVien3();
            System.out.println("====== Nhập vào thông tin nhân viên thứ 4 ======");
            nhapThongTinNhanVien4();
            System.out.println("====== Nhập vào thông tin nhân viên thứ 5 ======");
            nhapThongTinNhanVien5();
        }

        System.out.println("========= Xuất thông tin nhân viên =========");
        if (n == 1) {
            System.out.println("========= Thông tin nhân viên thứ 1 =========");
            xuatThongTinNhanVien1();
        } else if (n == 2) {
            System.out.println("========= Thông tin nhân viên thứ 1 =========");
            xuatThongTinNhanVien1();
            System.out.println("========= Thông tin nhân viên thứ 2 =========");
            xuatThongTinNhanVien2();
        } else if (n == 3) {
            System.out.println("========= Thông tin nhân viên thứ 1 =========");
            xuatThongTinNhanVien1();
            System.out.println("========= Thông tin nhân viên thứ 2 =========");
            xuatThongTinNhanVien2();
            System.out.println("========= Thông tin nhân viên thứ 3 =========");
            xuatThongTinNhanVien3();
        } else if (n == 4) {
            System.out.println("========= Thông tin nhân viên thứ 1 =========");
            xuatThongTinNhanVien1();
            System.out.println("========= Thông tin nhân viên thứ 2 =========");
            xuatThongTinNhanVien2();
            System.out.println("========= Thông tin nhân viên thứ 3 =========");
            xuatThongTinNhanVien3();
            System.out.println("========= Thông tin nhân viên thứ 4 =========");
            xuatThongTinNhanVien4();
        } else if (n == 5) {
            System.out.println("========= Thông tin nhân viên thứ 1 =========");
            xuatThongTinNhanVien1();
            System.out.println("========= Thông tin nhân viên thứ 2 =========");
            xuatThongTinNhanVien2();
            System.out.println("========= Thông tin nhân viên thứ 3 =========");
            xuatThongTinNhanVien3();
            System.out.println("========= Thông tin nhân viên thứ 4 =========");
            xuatThongTinNhanVien4();
            System.out.println("========= Thông tin nhân viên thứ 5 =========");
            xuatThongTinNhanVien5();
        }
    }

    static void nhapThongTinNhanVien1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào họ tên: ");
        hoTen1 = scanner.nextLine();

        System.out.print("Nhập vào tuổi: ");
        tuoi1 = scanner.nextInt();

        System.out.print("Nhập vào giới tính: ");
        scanner.nextLine();
        gioiTinh1 = scanner.nextLine();

        System.out.print("Nhập vào lương cơ bản: ");
        luongCB1 = scanner.nextDouble();

        System.out.print("Nhập vào điểm TB: ");
        diemTB1 = scanner.nextDouble();
    }

    static void nhapThongTinNhanVien2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào họ tên: ");
        hoTen2 = scanner.nextLine();

        System.out.print("Nhập vào tuổi: ");
        tuoi2 = scanner.nextInt();

        System.out.print("Nhập vào giới tính: ");
        scanner.nextLine();
        gioiTinh2 = scanner.nextLine();

        System.out.print("Nhập vào lương cơ bản: ");
        luongCB2 = scanner.nextDouble();

        System.out.print("Nhập vào điểm TB: ");
        diemTB2 = scanner.nextDouble();
    }

    static void nhapThongTinNhanVien3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào họ tên: ");
        hoTen3 = scanner.nextLine();

        System.out.print("Nhập vào tuổi: ");
        tuoi3 = scanner.nextInt();

        System.out.print("Nhập vào giới tính: ");
        scanner.nextLine();
        gioiTinh3 = scanner.nextLine();

        System.out.print("Nhập vào lương cơ bản: ");
        luongCB3 = scanner.nextDouble();

        System.out.print("Nhập vào điểm TB: ");
        diemTB3 = scanner.nextDouble();
    }

    static void nhapThongTinNhanVien4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào họ tên: ");
        hoTen4 = scanner.nextLine();

        System.out.print("Nhập vào tuổi: ");
        tuoi4 = scanner.nextInt();

        System.out.print("Nhập vào giới tính: ");
        scanner.nextLine();
        gioiTinh4 = scanner.nextLine();

        System.out.print("Nhập vào lương cơ bản: ");
        luongCB4 = scanner.nextDouble();

        System.out.print("Nhập vào điểm TB: ");
        diemTB4 = scanner.nextDouble();
    }

    static void nhapThongTinNhanVien5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào họ tên: ");
        hoTen5 = scanner.nextLine();

        System.out.print("Nhập vào tuổi: ");
        tuoi5 = scanner.nextInt();

        System.out.print("Nhập vào giới tính: ");
        scanner.nextLine();
        gioiTinh5 = scanner.nextLine();

        System.out.print("Nhập vào lương cơ bản: ");
        luongCB5 = scanner.nextDouble();

        System.out.print("Nhập vào điểm TB: ");
        diemTB5 = scanner.nextDouble();
    }

    static void xuatThongTinNhanVien1() {
        System.out.println("Họ Tên: " + hoTen1);
        System.out.println("Tuổi: " + tuoi1);
        System.out.println("Giới tính: " + gioiTinh1);
        System.out.println("Lương cơ bản: " + new BigDecimal(luongCB1));
        System.out.println("Điểm TB: " + diemTB1);
    }

    static void xuatThongTinNhanVien2() {
        System.out.println("Họ Tên: " + hoTen2);
        System.out.println("Tuổi: " + tuoi2);
        System.out.println("Giới tính: " + gioiTinh2);
        System.out.println("Lương cơ bản: " + new BigDecimal(luongCB2));
        System.out.println("Điểm TB: " + diemTB2);
    }

    static void xuatThongTinNhanVien3() {
        System.out.println("Họ Tên: " + hoTen3);
        System.out.println("Tuổi: " + tuoi3);
        System.out.println("Giới tính: " + gioiTinh3);
        System.out.println("Lương cơ bản: " + new BigDecimal(luongCB3));
        System.out.println("Điểm TB: " + diemTB3);
    }

    static void xuatThongTinNhanVien4() {
        System.out.println("Họ Tên: " + hoTen4);
        System.out.println("Tuổi: " + tuoi4);
        System.out.println("Giới tính: " + gioiTinh4);
        System.out.println("Lương cơ bản: " + new BigDecimal(luongCB4));
        System.out.println("Điểm TB: " + diemTB4);
    }

    static void xuatThongTinNhanVien5() {
        System.out.println("Họ Tên: " + hoTen5);
        System.out.println("Tuổi: " + tuoi5);
        System.out.println("Giới tính: " + gioiTinh5);
        System.out.println("Lương cơ bản: " + new BigDecimal(luongCB5));
        System.out.println("Điểm TB: " + diemTB5);
    }
}
