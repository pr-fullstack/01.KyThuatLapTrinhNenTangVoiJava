package basiclearning;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Bai3KiemTraEmail {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Paths.get("37-bai-tap-tong-hop-13/src/resources/input3.txt"));

        while (scanner.hasNextLine()) {
            String email = scanner.nextLine().trim();

            if(email.matches("\\w{6,32}@\\w{2,12}[.]\\w{2,12}")) {
                System.out.println(email);
            }
        }

        scanner.close();
    }
}
