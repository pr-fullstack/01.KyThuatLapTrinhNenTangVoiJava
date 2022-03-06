package basiclearning;

import java.util.Scanner;

/**
 * 5.	Các thao tác xử lý
 * a.	Tách các số nguyên tố có trong mảng a đưa vào mảng b.
 *
 * Ctrl + Shift + F: Tìm kiếm
 */
public class Bai5ATachSoNguyenTo {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhập vào số lượng phần tử mảng: ");
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Bạn phải nhập vào số nguyên dương, xin kiểm tra lại!!!");
            }
        } while (n <= 0);

        int[] a = new int[n];

        System.out.printf("Nhập vào các phần tử của mảng: ");
        nhapMang(a);

        System.out.print("Mảng b chứa tất cả các số nguyên tố của mảng a là: ");
        int[] b = splitPrimes(a);
        xuatMang(b);
    }

    static int[] splitPrimes(int[] a) {
        int countPrime = 0;
        int len = a.length;
        for(int i = 0; i < len; i++) {
            if (isPrime(a[i])) {
                countPrime++;
            }
        }

        int[] temp = new int[countPrime];

        int tempIndex = 0;
        for(int i = 0; i < len; i++) {
            if (isPrime(a[i])) {
                temp[tempIndex++] = a[i];
            }
        }

        return temp;
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

    static void nhapMang(int[] arr) {
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            System.out.printf("[%d]: ", i);
            arr[i] = scanner.nextInt();
        }
    }

    static void xuatMang(int[] arr) {
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
