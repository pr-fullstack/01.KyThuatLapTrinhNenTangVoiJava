package basiclearning;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class XuLyFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Paths.get("34-xu-ly-file/src/resources/input.txt"));

        String str = scanner.nextLine();
        String str2 = scanner.nextLine();

        System.out.println(str);
        System.out.println(str2);

        scanner.close();
    }
}
