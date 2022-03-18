package baitap;

import java.util.Scanner;

/**
 * Tính tổng các phần tử trên hàng/cột/toàn mảng 2 chiều
 */
public class TinhTongCacPhanTuTrenHangCotToanMang2Chieu {

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

        int[] tongTrenCacHang = tinhTongTrenCacHang(a);
        int[] tongTrenCacCot = tinhTongTrenCacCot(a);
        int tongMang = tinhTongMang(a);

        System.out.println("Tổng trên các hàng");
        for(int i = 0; i < tongTrenCacHang.length; i++) {
            System.out.println(tongTrenCacHang[i]);
        }

        System.out.println("Tổng trên các cột");
        for(int i = 0; i < tongTrenCacCot.length; i++) {
            System.out.print(tongTrenCacCot[i] + "\t");
        }

        System.out.println("\nTổng mảng: " + tongMang);
    }

    static int[] tinhTongTrenCacHang(int[][] arr) {
        int hang = arr.length;
        int cot = arr[0].length;

        int[] tam = new int[hang];
        for(int i = 0; i < hang; i++) {
            int tong = 0;
            for(int j = 0; j < cot; j++) {
                tong += arr[i][j];
            }
            tam[i] = tong;
        }

        return tam;
    }

    static int[] tinhTongTrenCacCot(int[][] arr) {
        int hang = arr.length;
        int cot = arr[0].length;

        int[] tam = new int[cot];
        for(int i = 0; i < cot; i++) {
            int tong = 0;
            for(int j = 0; j < hang; j++) {
                tong += arr[j][i];
            }
            tam[i] = tong;
        }

        return tam;
    }

    static int tinhTongMang(int[][] arr) {
        int hang = arr.length;
        int cot = arr[0].length;

        int tong = 0;
        for(int i = 0; i < cot; i++) {
            for(int j = 0; j < hang; j++) {
                tong += arr[j][i];
            }
        }

        return tong;
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
