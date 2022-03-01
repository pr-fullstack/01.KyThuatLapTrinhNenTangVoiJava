package basiclearning;

public class Mang1Chieu {
    public static void main(String[] args) {
        // int a[] = new int[]{1, 2, 3};
        // int b[] ;
        // b = new int[]{1, 2, 3};
        // int[] a = {1, 2, 3};
        // int a[]; //int[] a
        // a = new int[]{1, 2, 3};
        // System.out.println(a[-1]);

        int[] a = new int[10];

        for (int i = 0; i < 10; i++)
            a[i] = i * i;

        for (int i = 0; i < 10; i++)
            System.out.println(a[i]);
    }
}
