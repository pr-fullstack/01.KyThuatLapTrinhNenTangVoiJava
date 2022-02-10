package basiclearning;

import java.util.Scanner;

public class NhapThongTin {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        int a, b, c;
//        System.out.print("Nhập vào a: ");
//        a = scan.nextInt();
//
//        System.out.print("Nhập vào b: ");
//        b = scan.nextInt();
//
//        System.out.print("Nhập vào c: ");
//        c = scan.nextInt();
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);


        Scanner scan = new Scanner(System.in);

        System.out.print("Nhập vào tuổi: ");
        int age = scan.nextInt(); //27enter

        System.out.print("Nhập vào tên: ");
        scan.nextLine(); //  Xóa dấu enter
        String name = scan.nextLine();

        System.out.println("Tuổi: " + age);
        System.out.println("Tên: " + name);
    }
}
