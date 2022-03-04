package thuattoansapxep;

/**
 * Đổi chỗ trực tiếp (Interchange Sort)
 */
public class InterchangeSort {
    public static void main(String[] args) {
        int[] a = {3, 5, 2, 1};

        interchangeSort(a);
        xuatMang(a);
    }

    static void interchangeSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void xuatMang(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
