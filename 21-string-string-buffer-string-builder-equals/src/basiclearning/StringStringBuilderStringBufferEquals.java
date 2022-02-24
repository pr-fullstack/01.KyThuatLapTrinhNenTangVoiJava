package basiclearning;

public class StringStringBuilderStringBufferEquals {
    public static void main(String[] args) {
//        String str1 = "Hello";
//        String str2 = str1;
//        str2 = str2 + " World";
//
//        System.out.println(str1);
//        System.out.println(str2);
//
//        System.out.println(str1 == str2);
//
//        StringBuilder strBuilder1 = new StringBuilder("Hello");
//        StringBuilder strBuilder2 = strBuilder1;
//        strBuilder2.append(" World");
//        System.out.println(strBuilder1);
//        System.out.println(strBuilder2);
//
//        System.out.println(strBuilder1 == strBuilder2);

        String str = "abc";

        System.out.println(str.equals("abc"));

        StringBuilder stringBuilder1 = new StringBuilder("abc");
        StringBuilder stringBuilder2 = new StringBuilder("abc");
        System.out.println(stringBuilder1.equals(stringBuilder2));
    }
}
