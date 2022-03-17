package basiclearning;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *  d.	Sắp xếp nhân viên theo độ tuổi tăng dần. (*)
 */
public class Bai8DSapXepNhanVienTheoTuoi {
    static String[] hoTen = new String[5];
    static int[] tuoi = new int[5]; // 3 1 2 0 0
    static String[] gioiTinh = new String[5];
    static double[] luongCB = new double[5];
    static double[] diemTB = new double[5];

    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);

        char option;

        System.out.println("======== Nhập thông tin nhân viên ========");
        do {
            System.out.printf("====== Nhập vào thông tin nhân viên thứ %d ======\n", n + 1);
            nhapThongTinNhanVien(n);
            if (++n == 5) {
                break;
            }

            System.out.print("Bạn có nhập tiếp hay không? Nhấn 'N' để kết thúc, Nhấn phím bất kỳ để tiếp tục: ");
            option = scanner.nextLine().charAt(0);
        } while (option != 'N' && option != 'n');

        System.out.println("========= Xuất thông tin nhân viên =========");
        for (int i = 0; i < n; i++) {
            System.out.printf("========= Thông tin nhân viên thứ %d =========\n", i + 1);
            xuatThongTinNhanVien(i);
        }

        interchangeSort(n);

        System.out.println("========= Xuất thông tin nhân viên sau khi sắp xếp tuổi tăng dần =========");
        for (int i = 0; i < n; i++) {
            System.out.printf("========= Thông tin nhân viên thứ %d =========\n", i + 1);
            xuatThongTinNhanVien(i);
        }
    }

    static void nhapThongTinNhanVien(int index) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào họ tên: ");
        hoTen[index] = scanner.nextLine();

        System.out.print("Nhập vào tuổi: ");
        tuoi[index] = scanner.nextInt();

        System.out.print("Nhập vào giới tính: ");
        scanner.nextLine();
        gioiTinh[index] = scanner.nextLine();

        System.out.print("Nhập vào lương cơ bản: ");
        luongCB[index] = scanner.nextDouble();

        System.out.print("Nhập vào điểm TB: ");
        diemTB[index] = scanner.nextDouble();
    }

    static void xuatThongTinNhanVien(int index) {
        System.out.println("Họ Tên: " + hoTen[index]);
        System.out.println("Tuổi: " + tuoi[index]);
        System.out.println("Giới tính: " + gioiTinh[index]);
        System.out.println("Lương cơ bản: " + new BigDecimal(luongCB[index]));
        System.out.println("Điểm TB: " + diemTB[index]);
    }

    static void interchangeSort(int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (tuoi[i] > tuoi[j]) {
                    String hoTentemp = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = hoTentemp;

                    int tuoiTemp = tuoi[i];
                    tuoi[i] = tuoi[j];
                    tuoi[j] = tuoiTemp;

                    String gioiTinhTemp = gioiTinh[i];
                    gioiTinh[i] = gioiTinh[j];
                    gioiTinh[j] = gioiTinhTemp;

                    double luongCBTemp = luongCB[i];
                    luongCB[i] = luongCB[j];
                    luongCB[j] = luongCBTemp;

                    double diemTBTemp = diemTB[i];
                    diemTB[i] = diemTB[j];
                    diemTB[j] = diemTBTemp;
                }
            }
        }
    }
}
