package basiclearning;

public class KDLNguyenThuy {
    public static void main(String[] args) {
        int a = 10;

        System.out.println("Giá trị của a trước truyền qua method: " + a);
        changeData(a);
        System.out.println("Giá trị của a sau truyền qua method: " + a);
    }

    static void changeData(int n){
        n = 100;
    }
}
