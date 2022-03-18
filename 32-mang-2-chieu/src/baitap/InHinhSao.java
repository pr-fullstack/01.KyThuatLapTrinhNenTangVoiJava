package baitap;

import java.util.Scanner;

/**
 * Sử dụng mảng 2 chiều để lưu bài vẽ hình, sau đó xuất ra
 */
public class InHinhSao {
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

        char[][] a = new char[m][n];

        System.out.printf("Nhập vào các phần tử của mảng: ");
        ghiMang(a);

        System.out.println("Giá trị của mảng: ");
        xuatMang(a);
    }

    static void ghiMang(char[][] arr) {
        int hang = arr.length;
        int cot = arr[0].length;
        for(int i = 0; i < hang; i++) {
            for(int j = 0; j < cot; j++) {
                if (i == 0 || i == hang - 1 || j == 0 || j == cot - 1) {
                    arr[i][j] = '*';
                } else {
                    arr[i][j] = ' ';
                }
            }
        }
    }

    static void xuatMang(char[][] arr) {
        int hang = arr.length;
        for(int i = 0; i < hang; i++) {
            int cot = arr[i].length;
            for(int j = 0; j < cot; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
