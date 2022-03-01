package baitap;

import java.util.Scanner;

/**
 * Tìm kiếm một phần tử trong mảng
 *      Trả về vị trí index đầu tiên nếu tìm thấy
 *      Trả về -1 nếu không tìm thấy
 */
public class TimKiemPhanTuTrongMang {
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

        int index = indexOf(a, 5);
        if (index == -1) {
            System.out.println("Mảng a không tồn tại phầ tử k!");
        } else {
            System.out.println("Vị trí index đầu tiên là: " + index);
        }
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

    static int indexOf(int[] arr, int k) {
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            if (arr[i] == k) {
                return i;
            }
        }

        return -1;
    }
}
