package basiclearning;

public class ReNhanhSwitchCase {
    public static void main(String[] args) {
        String type = "B";

        switch (type){
            case "A":
                System.out.println("Xếp loại tốt");
                break;
            case "B":
                System.out.println("Xếp loại Khá");
                break;
            default:
                System.out.println("Bình thường");
        }
    }
}
