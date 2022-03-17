package basiclearning;

public class WrapperClassAutoboxingUnboxing {
    public static void main(String[] args) {

        Integer obj1 = new Integer(127); // -128~127
        Integer obj2 = new Integer(127); // -128~127

        System.out.println(obj1 == obj2);
    }
}
