package basiclearning;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class BaiTapDocFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Paths.get("34-xu-ly-file/src/resources/input2.txt"));

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n > 0) {
                System.out.println(n);
            }
        }
        scanner.close();
    }
}
