package basiclearning;

public class ThamTriVaThamChieu {
    public static void main(String[] args) {
        int a = 10;

        changeValue(a, 5); // Giá trị của a không bị thay đổi
        System.out.println(a); // a = 100
    }
    static int changeValue(int a, int b) {
        a = 100;
        return 5;
    }
}
