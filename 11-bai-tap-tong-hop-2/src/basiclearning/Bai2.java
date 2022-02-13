package basiclearning;

/**
 * 2.	Nhập vào 1 số tự nhiên từ 1 đến 10, sau đó in ra tiếng Anh của từ đó theo 2 cách:
 * a.	Cách 1: Dùng if else-if.
 * b.	Cách 2: Dùng switch case
 */
public class Bai2 {
    public static void main(String[] args) {
        int number = 3;

        // Cách 1: Dùng if else-if.
        if(number == 1) {
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");
        } else if (number == 3) {
            System.out.println("Three");
        }

        // Cách 2: Dùng switch case
        switch (number) {
            case 1 :
                System.out.println("One");
                break;
            case 2 :
                System.out.println("Two");
                break;
            case 3 :
                System.out.println("Three");
                break;
        }
    }
}
