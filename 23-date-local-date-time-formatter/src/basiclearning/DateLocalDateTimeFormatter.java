package basiclearning;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateLocalDateTimeFormatter {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        simpleDateFormat.setLenient(false);
        Date date = null;

        Scanner scanner = new Scanner(System.in);
        boolean isValidDate;
        do {
            isValidDate = true;
            System.out.print("Nhập vào năm sinh ở dạng dd/MM/yyyy: ");
            try {
                date = simpleDateFormat.parse(scanner.nextLine());
            } catch (ParseException e) {
                isValidDate = false;
            }

            if (!isValidDate) {
                System.out.println("Ngày tháng năm không đúng định dạng, xin kiểm tra lại!!!");
            }
        } while (!isValidDate);

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        String strDate= formatter.format(date);
        System.out.println(strDate);
    }
}
