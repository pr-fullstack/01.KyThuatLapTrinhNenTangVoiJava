package basiclearning;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 9.	Sử dụng file để xử lý bài nhập thông tin cho n nhân viên ở bài trước.
 * Thông tin của mỗi nhân viên nằm trên mỗi dòng,
 * mỗi thông tin của nhân viên ngăn cách nhau bằng dấu “,”.
 * Số lượng nhân viên nhập vào là không giới hạn.
 */
public class Bai9NhapThongTinNNhanVien {
    static ArrayList<String> hoTen = new ArrayList<>();
    static ArrayList<Integer> tuoi = new ArrayList<>();
    static ArrayList<String> gioiTinh = new ArrayList<>();
    static ArrayList<Double> luongCB = new ArrayList<>();
    static ArrayList<Double> diemTB = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Paths.get("35-bai-tap-tong-hop-12/src/resources/input.txt"));

        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            String[] info = str.split(",");
            nhapThongTinNhanVien(info);
        }
        scanner.close();

        System.out.println("========= Xuất thông tin nhân viên =========");
        for (int i = 0; i < hoTen.size(); i++) {
            System.out.printf("========= Thông tin nhân viên thứ %d =========\n", i + 1);
            xuatThongTinNhanVien(i);
        }
    }

    static void nhapThongTinNhanVien(String[] info) {
        hoTen.add(info[0]);
        tuoi.add(Integer.parseInt(info[1]));
        gioiTinh.add(info[2]);
        luongCB.add(Double.parseDouble(info[3]));
        diemTB.add(Double.parseDouble(info[4]));
    }

    static void xuatThongTinNhanVien(int index) {
        System.out.println("Họ Tên: " + hoTen.get(index));
        System.out.println("Tuổi: " + tuoi.get(index));
        System.out.println("Giới tính: " + gioiTinh.get(index));
        System.out.println("Lương cơ bản: " + new BigDecimal(luongCB.get(index)));
        System.out.println("Điểm TB: " + diemTB.get(index));
    }
}
