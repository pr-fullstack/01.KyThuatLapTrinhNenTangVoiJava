package basiclearning;

/**
 * 8.	Nhập vào tháng & năm. Hãy cho biết tháng đó trong năm đó có bao nhiêu ngày.
 */
public class Bai8 {
    public static void main(String[] args) {
        // 1. Năm nhuận là năm chia hết cho 4 nhưng không chia hết cho 100
        // 2. Năm nhuận là năm chia hết cho 400

        int month = 2;
        int year = 2000;

        if (month == 2) {
            // Kiểm tra năm nhuận
            if ( year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.printf("Tháng %d năm %d có %d ngày", month, year, 29);
            } else {
                System.out.printf("Tháng %d năm %d có %d ngày", month, year, 28);
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.printf("Tháng %d năm %d có %d ngày", month, year, 30);
        } else {
            System.out.printf("Tháng %d năm %d có %d ngày", month, year, 31);
        }
    }
}
