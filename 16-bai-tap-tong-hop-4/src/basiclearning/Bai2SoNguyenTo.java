package basiclearning;

public class Bai2SoNguyenTo {
    public static void main(String[] args) {
        int n = 5;

        int a  = 1;
        int b = 100;
        int count = 0;
        for (int i = a; i <= b; i ++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println("count: " + count);
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // 51~99
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
