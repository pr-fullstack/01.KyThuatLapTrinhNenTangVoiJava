package baitap;

import java.util.Scanner;

public class NhapXuatMang {
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

        System.out.print("Giá trị của mảng: ");
        xuatMang(a);
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
