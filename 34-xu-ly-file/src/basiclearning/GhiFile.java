package basiclearning;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class GhiFile {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter("34-xu-ly-file/src/resources/output.txt");
        Scanner scanner = new Scanner(Paths.get("34-xu-ly-file/src/resources/input2.txt"));

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n > 0) {
                printWriter.println(n);
            }
        }
        scanner.close();
        printWriter.close();
    }
}
