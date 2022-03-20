package basiclearning;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Bai1KiemTraSoDienThoai {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Paths.get("37-bai-tap-tong-hop-13/src/resources/input.txt"));

        while (scanner.hasNextLine()) {
            String phone = scanner.nextLine().trim();

            if (phone.matches("(0|[(][+]84[)])3[2-9][0-9]{7}")) {
                System.out.println(phone);
            }

//            if (phone.startsWith("0") || phone.startsWith("(+84)")) {
//                String temp;
//                if (phone.startsWith("0")) {
//                    temp = phone.substring(1);
//                } else {
//                    temp = phone.substring(5);
//                }
//
//                if (temp.length() == 9 && isNumber(temp)) {
//                    String str = temp.substring(0, 2);
//                    if (str.equals("32") || str.equals("33") ||
//                            str.equals("34") || str.equals("35") ||
//                            str.equals("36") || str.equals("37") ||
//                            str.equals("38") || str.equals("39")
//                    ) {
//                        System.out.println(phone);
//                    }
//                }
//            }
        }
        scanner.close();
    }

    static boolean isNumber(String target) {
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) < '0' || target.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}
