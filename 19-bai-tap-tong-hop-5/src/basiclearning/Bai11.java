package basiclearning;

public class Bai11 {
    public static void main(String[] args) {
        //•	Chuyển đổi String thành int trong java
//        String str = "123";
//
//        long a = Long.parseLong(str);

//•	Chuyển đổi int thành String trong java
//        int a = 123;
//
//        String str = String.valueOf(a);

        String a = "Nguyễn Ngọc Quang";
        String b = "Nguyễn Ngọc Quang";

        int comparison = a.compareTo(b);

        if (comparison > 0) {
            System.out.println("a > b");
        } else if (comparison == 0) {
            System.out.println("a = b");
        } else {
            System.out.println("a < b");
        }
    }
}
