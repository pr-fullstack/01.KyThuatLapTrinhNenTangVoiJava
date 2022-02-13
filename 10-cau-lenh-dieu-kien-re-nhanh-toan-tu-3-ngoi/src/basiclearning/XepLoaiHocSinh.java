package basiclearning;

/**
 * Xếp loại học sinh theo điểm (***)
 * [0, 5) => Yếu
 * [5, 8) => Khá
 * [8, 10] => Giỏi
 */
public class XepLoaiHocSinh {
    public static void main(String[] args) {
        double score = 5;

        if (score < 0 || score > 10) {
            System.out.println("Điểm không hợp lệ!!!");
        } else if (score < 5) {
            System.out.println("Yếu");
        } else if (score < 8) {
            System.out.println("Khá");
        } else {
            System.out.println("Giỏi");
        }
    }
}
