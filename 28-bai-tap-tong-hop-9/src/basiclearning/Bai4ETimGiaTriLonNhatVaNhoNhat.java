package basiclearning;

import java.util.Scanner;

/**
 * 4.	Các thao tác tìm kiếm
 *  e.	Tìm giá trị lớn nhất và nhỏ nhất của mảng a.
 *      (Theo 2 cách: cách 1 dùng 2 vòng for. Cách 2 dùng 1 vòng for).
 */
public class Bai4ETimGiaTriLonNhatVaNhoNhat {
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

        System.out.print("Giá trị của mảng trước khi tìm kiếm: ");
        xuatMang(a);

        System.out.println("Max = " + findMax(a));
        System.out.println("Min = " + findMin(a));


        System.out.print("Giá trị của mảng sau khi tìm kiếm: ");
        xuatMang(a);
    }

    static int findMax(int[] arr) {
        int[] temp = clone(arr);
        interchangeSort(temp);

        return temp[temp.length - 1];
    }

    static int findMax2(int[] arr) {
        int max = arr[0];

        int len = arr.length;
        for(int i = 1; i < len; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int findMin2(int[] arr) {
        int min = arr[0];

        int len = arr.length;
        for(int i = 1; i < len; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    static int[] clone(int[] arr) {
        int[] temp = new int[arr.length];
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    static int findMin(int[] arr) {
        int[] temp = clone(arr);
        interchangeSort(temp);

        return temp[0];
    }

    static void interchangeSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
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
}
