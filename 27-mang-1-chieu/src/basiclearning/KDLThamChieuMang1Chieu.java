package basiclearning;

public class KDLThamChieuMang1Chieu {
    public static void main(String[] args) {
        int[] a = new int[3];

        System.out.print("Miền giá trị của mảng a trước truyền qua method: ");
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + "  ");

        changeData(a);
        System.out.print("\nMiền giá trị của mảng a sau truyền qua method: " );
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + "  ");
    }

    static void changeData(int arr[]){
        for(int i = 0; i < arr.length; i++)
            arr[i] = i * i;
    }
}
