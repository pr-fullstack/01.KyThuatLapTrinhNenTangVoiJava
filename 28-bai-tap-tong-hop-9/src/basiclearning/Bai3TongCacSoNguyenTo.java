package basiclearning;

import java.util.Scanner;

/**
 * Tổng các số nguyên tố có trong mảng
 */
public class Bai3TongCacSoNguyenTo {
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

        System.out.print("Tổng các số nguyên tố có trong mảng: " + totalPrime(a));
    }

    static void nhapMang(int[] arr) {
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            System.out.printf("[%d]: ", i);
            arr[i] = scanner.nextInt();
        }
    }

    static int totalPrime(int[] arr) {
        int total = 0;
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            if (isPrime(arr[i])) {
                total += arr[i];
            }
        }

        return total;
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
