package baitap;

import java.util.Scanner;

public class XoaPhanTuTaiViTriIndex {
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

        System.out.print("Giá trị của mảng trước khi xóa tại vị trí index: ");
        xuatMang(a);

        int index = 4;

        a = add(a, index);

        System.out.print("Giá trị của mảng sau khi xóa tại vị trí index: ");
        xuatMang(a);
    }

    static int[] add(int[] a, int index) {
        // Bước 1: Tạo vùng nhớ mới
        int[] b = new int[a.length - 1];

        // Bước 2: Coppy giá trị vùng nhớ cũ qua vùng nhớ mới

        for(int i = 0; i < index; i++) {
            b[i] = a[i];
        }

        int len = b.length;
        for(int i = index; i < len; i++) {
            b[i] = a[i + 1];
        }

        // Bước 3: Trả về vùng nhớ mới
        return b;
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
