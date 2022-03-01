package basiclearning;

public class KDLThamChieuString {
    public static void main(String[] args) {
        String str = "Nguyễn Ngọc Quang";

        System.out.println("Giá trị của str trước truyền qua method: " + str);
        changeData(str);
        System.out.println("Giá trị của str sau truyền qua method: " + str);
    }

    static void changeData(String target){
        target = "abc";
    }
}
