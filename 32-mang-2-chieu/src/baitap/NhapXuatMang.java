package baitap;

import java.util.Scanner;

/**
 * Nhập & xuất mảng
 */
public class NhapXuatMang {
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

    static void nhapMangRangCua(int[][] arr) {
        int hang = arr.length;
        for(int i = 0; i < hang; i++) {
            System.out.printf("Nhập vào số lượng cột của hàng %d: ", i + 1);
            int cot = scanner.nextInt();
            arr[i] = new int[cot];
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
