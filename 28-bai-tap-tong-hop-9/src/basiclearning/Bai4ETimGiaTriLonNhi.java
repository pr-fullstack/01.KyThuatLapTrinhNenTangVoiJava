package basiclearning;

import java.util.Scanner;

/**
 * 4.	Các thao tác tìm kiếm
 *  f.	Tìm giá trị lớn nhì của mảng a.
 *      (Theo 2 cách: cách 1 dùng 2 vòng for. Cách 2 dùng 1 vòng for). (*)
 */
public class Bai4ETimGiaTriLonNhi {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n, a[];
        boolean isValid;
        do {
            do {
                System.out.print("Nhập vào số lượng phần tử mảng: ");
                n = scanner.nextInt();

                if (n <= 1) {
                    System.out.println("Mảng phải bao gồm 2 ít nhất phần tử, xin kiểm tra lại!!!");
                }
            } while (n <= 1);

            a = new int[n];

            System.out.printf("Nhập vào các phần tử của mảng: ");
            nhapMang(a);

            isValid = isValidArray(a);

            if (!isValid) {
                System.out.println("Mảng toàn số trùng nhau, không thể tìm ra số lớn nhì, xin kiểm tra lại!!!");
            }
        } while (!isValid);

        System.out.print("Giá trị lớn nhì của mảng là: " + findSecondMax2(a));
    }

    static int findSecondMax(int[] arr) {
        int[] temp = clone(arr);
        interchangeSort(temp);

        for (int i = temp.length - 2; i >= 0; i--) {
            if (temp[temp.length - 1] != temp[i]) {
                return temp[i];
            }
        }

        return 0;
    }

    static int findSecondMax2(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        int len = arr.length;
        for(int i = 0; i < len; i++) {
            if (max < arr[i]) {
                secondMax = max;
                max = arr[i];
            } else if (max > arr[i] && secondMax < arr[i]) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }

    static int[] clone(int[] arr) {
        int[] temp = new int[arr.length];
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            temp[i] = arr[i];
        }
        return temp;
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

    static boolean isValidArray(int[] arr) {
        int len = arr.length;
        for(int i = 1; i < len; i++) {
            if (arr[0] != arr[i]) {
                return true;
            }
        }

        return false;
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
