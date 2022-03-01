package basiclearning;

public class KDLThamChieuStringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Nguyễn Ngọc Quang");

        System.out.println("Giá trị của str trước truyền qua method: " + str);
        changeData(str);
        System.out.println("Giá trị của str sau truyền qua method: " + str);
    }

    static void changeData(StringBuilder target){
        target.append(" - 1995");
        target = new StringBuilder("Nguyễn Ngọc Quang");
        target.append(" - 1995");
    }
}
