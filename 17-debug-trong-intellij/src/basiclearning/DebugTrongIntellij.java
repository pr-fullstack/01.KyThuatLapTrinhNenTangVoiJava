package basiclearning;

/**
 * Debug trong intellij
 */
public class DebugTrongIntellij {
    static void method1(int n) {
        int temp = n + 2;
        temp++;
        method2(temp);
    }

    static void method2(int n) {
        System.out.print(n + "  ");
    }

    public static void main(String[] args) {
        System.out.println("Debug trong intellij");

        int n = 10;

        for (int i = 0; i < n; i++) {
            int x = i + 2;
            method1(x);
        }

        System.out.println("Kết thúc chương trình!!!");
    }
}
