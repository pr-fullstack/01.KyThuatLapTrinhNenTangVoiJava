package baitap;

import java.util.Scanner;

/**
 * Xóa phần tử có giá trị k
 */
public class XoaPhanTuCoGiaTriK {
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

        System.out.print("Giá trị của mảng trước khi xóa phần tử k: ");
        xuatMang(a);

        int k = 2;

        a = removeElement(a, k);

        System.out.print("Giá trị của mảng sau khi xóa phần tử k: ");
        xuatMang(a);
    }

    static int[] removeIndex(int[] a, int index) {
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

    static int[] removeElement(int[] a, int k) {
        for(int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                a = removeIndex(a, i); // 1 2 2 3 4
                i--;
            }
        }
        return a;
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
