package basiclearning;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * b.	Tìm nhân viên theo họ tên.
 */
public class Bai8BTimNhanVienTheoHoTen {
    static String[] hoTen = new String[5];
    static int[] tuoi = new int[5];
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

        String name = "Quang";
        System.out.println("========= Xuất thông tin nhân viên theo tên =========");
        int[] indexes = findIndexByName(hoTen, name);
        for (int i = 0; i < indexes.length; i++) {
            System.out.printf("========= Thông tin nhân viên thứ %d =========\n", i + 1);
            xuatThongTinNhanVien(indexes[i]);
        }
    }

    static int[] findIndexByName(String[] arr, String name) {
        // Đếm xem có bao nhiêu phần tử trùng với name
        int countMax = 0;
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            if (arr[i] != null && arr[i].toUpperCase().contains(name.toUpperCase())) {
                countMax++;
            }
        }

        // Khởi tạo mảng với số lượng phần tử tương ứng
        int[] temp = new int[countMax];

        // Gán giá trị vị trí index tương ứng
        int tempIndex = 0;
        for(int i = 0; i < len; i++) {
            if (arr[i] != null && arr[i].toUpperCase().contains(name.toUpperCase())) {
                temp[tempIndex++] = i;
            }
        }

        return temp;
    }

    static double findMax(double[] arr) {
        double max = arr[0];

        int len = arr.length;
        for(int i = 1; i < len; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
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
}
