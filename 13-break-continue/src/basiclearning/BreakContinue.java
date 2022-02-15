package basiclearning;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; ; i++) { // Không có phần điều kiện lặp.
            if (i > 3) // Điều kiện dừng lại nằm ở đây
                break;
            if (i % 2 != 0) // 1, 3, 5
                continue;
            System.out.println(i);
        }
        // Bước 1: i = 1 => thỏa mãn => ko break => continue => Bỏ qua bước lặp hiện tại => không xuất ra i
        // Bước 2: i = 2 => thỏa mãn => ko break => ko continue => Xuất ra i = 2
        // Bước 3: i = 3 => thỏa mãn => ko break => continue => Bỏ qua bước lặp hiện tại => không xuất ra i
        // Bước 4: i = 4 => thỏa mãn => break => Kết thúc vòng lặp
    }
}
