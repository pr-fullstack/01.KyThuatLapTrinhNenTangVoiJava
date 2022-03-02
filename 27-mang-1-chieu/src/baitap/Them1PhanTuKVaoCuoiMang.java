package baitap;

import java.util.Scanner;

/**
 * Thêm một phần tử k vào cuối mảng
 */
public class Them1PhanTuKVaoCuoiMang {
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

        System.out.print("Giá trị của mảng trước khi thêm phần tử k: ");
        xuatMang(a);

        int k = 10;

        a = add(a, k);

        System.out.print("Giá trị của mảng sau khi thêm phần tử k: ");
        xuatMang(a);
    }

    static int[] add(int[] a, int k) {
        // Bước 1: Tạo vùng nhớ mới (Độ dài của vùng nhớ mới = Độ dài của vùng nhớ cũ + 1)
        int[] b = new int[a.length + 1];

        // Bước 2: Coppy giá trị vùng nhớ cũ qua vùng nhớ mới
        int len = a.length;
        for(int i = 0; i < len; i++) {
            b[i] = a[i];
        }

        // Bước 3: Gán phần tử muốn thêm vào cuối mảng mới
        b[b.length - 1] = k;

        // Bước 4: Trả về vùng nhớ mới
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
