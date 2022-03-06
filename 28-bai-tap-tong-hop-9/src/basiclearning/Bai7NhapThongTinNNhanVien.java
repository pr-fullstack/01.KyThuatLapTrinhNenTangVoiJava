package basiclearning;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 7.	Viết chương trình nhập thông tin của n nhân viên trong công ty (n <= 5).
 * Thông tin cần nhập tương tự ở câu trên.
 * Người dùng không nhập trước số n từ bàn phím mà sau khi nhập người đầu tiên,
 * chương trình sẽ hỏi người dùng có muốn nhập tiếp không.
 * Nếu người dùng gõ 'N' hoặc số lượng nhân viên đã đủ 5 người rồi,
 * thì chương trình sẽ dừng nhập. Sau khi nhập xong thì in thông tin đã nhập ra.
 * Lưu ý: in ra n nhân viên cùng lúc,
 * không phải nhập nhân viên nào in nhân viên đó ra luôn. (*)
 */
public class Bai7NhapThongTinNNhanVien {

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
            System.out.print("Bạn có nhập tiếp hay không? Nhấn 'N' để kết thúc, Nhấn phím bất kỳ để tiếp tục: ");
            option = scanner.nextLine().charAt(0);

            if (++n == 5) {
                break;
            }
        } while (option != 'N' && option != 'n');

        System.out.println("========= Xuất thông tin nhân viên =========");
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
}
