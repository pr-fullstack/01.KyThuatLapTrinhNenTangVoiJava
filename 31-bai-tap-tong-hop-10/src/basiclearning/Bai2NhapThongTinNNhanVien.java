package basiclearning;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2.	Sử dụng các ArrayList để xử lý bài nhập thông tin cho n nhân viên ở bài trước.
 */
public class Bai2NhapThongTinNNhanVien {
    static ArrayList<String> hoTen = new ArrayList<>();
    static ArrayList<Integer> tuoi = new ArrayList<>();
    static ArrayList<String> gioiTinh = new ArrayList<>();
    static ArrayList<Double> luongCB = new ArrayList<>();
    static ArrayList<Double> diemTB = new ArrayList<>();

    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);

        char option;

        System.out.println("======== Nhập thông tin nhân viên ========");
        do {
            System.out.printf("====== Nhập vào thông tin nhân viên thứ %d ======\n", n + 1);
            nhapThongTinNhanVien();
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
    }

    static void nhapThongTinNhanVien() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào họ tên: ");
        hoTen.add( scanner.nextLine());

        System.out.print("Nhập vào tuổi: ");
        tuoi.add(scanner.nextInt());

        System.out.print("Nhập vào giới tính: ");
        scanner.nextLine();
        gioiTinh.add(scanner.nextLine());

        System.out.print("Nhập vào lương cơ bản: ");
        luongCB.add(scanner.nextDouble());

        System.out.print("Nhập vào điểm TB: ");
        diemTB.add(scanner.nextDouble());
    }

    static void xuatThongTinNhanVien(int index) {
        System.out.println("Họ Tên: " + hoTen.get(index));
        System.out.println("Tuổi: " + tuoi.get(index));
        System.out.println("Giới tính: " + gioiTinh.get(index));
        System.out.println("Lương cơ bản: " + new BigDecimal(luongCB.get(index)));
        System.out.println("Điểm TB: " + diemTB.get(index));
    }
}
