package basiclearning;

public class ToanTu3Ngoi {
    public static void main(String[] args) {
        int a = 3, b = 2;

        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        System.out.println("max: " + max);

        int max2 = a > b ? a : b;
        int min2 = a < b ? a : b;
        System.out.println("max2: " + max2);
        System.out.println("min2: " + min2);
    }
}
