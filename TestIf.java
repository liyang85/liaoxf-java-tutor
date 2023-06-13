public class TestIf {
    public static void main(String[] args) {
        String s1 = null;
//        if (s1.equals("hello")) {         // NullPointerException
        if (s1 != null && s1.equals("hello")) {
            System.out.println("hello");
        }
    }
}
