package basiclearning;

public class Mang2Chieu {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}, {5, 6}};

        xuatMang(a);

        changeData(a);
        System.out.println("\nSau khi thay đổi");
        xuatMang(a);
    }

    static void xuatMang(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void changeData(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] += 100;
            }
        }

    }
}
