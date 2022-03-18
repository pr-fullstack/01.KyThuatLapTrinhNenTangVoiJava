package basiclearning;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1.	Viết chương trình thực hiện các công việc như sau :
 * a.	Nhập một Arraylist tên gọi là a gồm n phần tử kiểu nguyên int.
 * b.	In giá trị của các phần tử a
 */
public class Bai1ArrayList {

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

        ArrayList<Integer> a = new ArrayList<>();

        System.out.printf("Nhập vào các phần tử của mảng: ");
        nhapMang(a, n);

        System.out.print("Giá trị của mảng: ");
        xuatMang(a);
    }

    static void nhapMang(ArrayList<Integer> arr, int n) {
        for(int i = 0; i < n; i++) {
            System.out.printf("Nhập vào phần tử thứ %d: ", i + 1);
            arr.add(scanner.nextInt());
        }
    }

    static void xuatMang(ArrayList<Integer> arr) {
        int size = arr.size();
        for(int i = 0; i < size; i++) {
            System.out.print(arr.get(i) + "\t");
        }
    }
}
