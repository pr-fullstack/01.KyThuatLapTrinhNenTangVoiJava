package baitap;

import java.util.Scanner;

/**
 * Kiểm tra giá trị k có nằm trong mảng 2 chiều hay không
 */
public class KiemTraTonTaiPhanTuK {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // m hàng - n cột
        int m;
        do {
            System.out.print("Nhập vào số hàng của mảng: ");
            m = scanner.nextInt();

            if (m <= 0) {
                System.out.println("Bạn phải nhập vào số nguyên dương, xin kiểm tra lại!!!");
            }
        } while (m <= 0);

        int n;
        do {
            System.out.print("Nhập vào số cột của mảng: ");
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Bạn phải nhập vào số nguyên dương, xin kiểm tra lại!!!");
            }
        } while (n <= 0);

        int[][] a = new int[m][n];

        System.out.printf("Nhập vào các phần tử của mảng: ");
        nhapMang(a);

        System.out.println("Giá trị của mảng: ");
        xuatMang(a);

        int k = 2;
        if (isExistK(a, k)) {
            System.out.println("Tồn tại phần tử k ở trong mảng");
        } else {
            System.out.println("Không tồn tại phần tử k ở trong mảng");
        }
    }

    static boolean isExistK(int[][] arr, int k) {
        int hang = arr.length;
        int cot = arr[0].length;
        for(int i = 0; i < hang; i++) {
            for(int j = 0; j < cot; j++) {
                if (arr[i][j] == k) {
                    return true;
                }
            }
        }
        return false;
    }

    static void nhapMang(int[][] arr) {
        int hang = arr.length;
        int cot = arr[0].length;
        for(int i = 0; i < hang; i++) {
            for(int j = 0; j < cot; j++) {
                System.out.printf("Nhập [%d][%d]: ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    static void xuatMang(int[][] arr) {
        int hang = arr.length;
        for(int i = 0; i < hang; i++) {
            int cot = arr[i].length;
            for(int j = 0; j < cot; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
