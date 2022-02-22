package basiclearning;

public class StringStackHeap {
    public static void main(String[] args) {
        String str1 = "Nguyễn Ngọc Quang";
        String str2 = "Nguyễn Ngọc Quang";
        String str3 = new String("Nguyễn Ngọc Quang");

        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2)); // true

        System.out.println(str1 == str3); // false
        System.out.println(str1.equals(str3)); // true

        int a = 2, b = 2;
        System.out.println(a);
    }
}
