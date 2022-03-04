package thuattoansapxep;

/**
 * Nổi bọt (Bubble Sort)
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {3, 5, 2, 1};

        bubbleSort(a);
        xuatMang(a);
    }

    static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if ( arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    static void xuatMang(int[] arr) {
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
