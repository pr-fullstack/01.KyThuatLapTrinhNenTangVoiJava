package basiclearning;

import java.util.Scanner;

/**
 * 4.	Các thao tác tìm kiếm
 * d.	Nhập vào phần tử k, tìm xem k có xuất hiện trong mảng a không.
 *          Nếu có chỉ ra các vị trí của k trong mảng. (*)
 */
public class Bai4CacViTriXuatHienPhanTuK {
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

        int k = 2;

        int[] indexes = returnsIndexWithElementK2(a, k);

        if (indexes.length == 0) {
            System.out.println("Phần tử k không tồn tại ở trong mảng");
        } else {
            System.out.print("Các vị trí index xuất hiện phần tử k: ");
            xuatMang(indexes);
        }
    }

    static int[] returnsIndexWithElementK(int[] arr, int k) {
        // B1: Đếm số phần tử k ở trong mảng
        int count = 0;
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            if (arr[i] == k) {
                count++;
            }
        }

        // B2: Khởi tạo mảng temp[] với số lượng phần tử đếm được ở bước 1
        int[] temp = new int[count];

        // B3: Lưu các vị trí index tương ứng vào mảng temp[]
        int tempIndex = 0;
        for(int i = 0; i < len; i++) {
            if (arr[i] == k) {
                temp[tempIndex++] = i;
                // tempIndex++;
            }
        }

        // B4: Trả về mảng temp
        return temp;
    }

    static int[] returnsIndexWithElementK2(int[] arr, int k) {
        // B1: Khởi tạo mảng temp[] rỗng
        int[] temp = new int[0];

        // Nếu có vị trí index nào thỏa mãn thì gọi đến method add
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            if (arr[i] == k) {
                temp = add(temp, i);
            }
        }

        // B3: Trả về mảng temp
        return temp;
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
