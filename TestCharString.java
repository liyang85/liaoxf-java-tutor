public class TestCharString {
    public static void main(String[] args) {
//        String s1 = "Hello";
//        String s2 = "world";
//        String s = s1 + " " + s2 + "!";
//        System.out.println(s);

//        int age = 25;
//        String s3 = "age is " + age;
//        System.out.println(s3);

//        Java 13 and later can use """...""" to indicate a Text Blocks.
//        String mls = """
//                    select * from users
//                    where id > 100
//                    order by name desc
//                    """;
//        System.out.println(mls);

//        String s4 = null;
//        String s5 = s4;
//        System.out.println("s4 is " + s4);
//        System.out.println("s5 is " + s5);

        // 请将下面一组int值视为字符的Unicode码，把它们拼成一个字符串：
        int a = 72;
        int b = 105;
        int c = 65281;      // 对应的Unicode字符是中文全角感叹号。

//        FIXME:
//        String s6 = a + b + c;
        String s6 = "" + (char) a + (char) b + (char) c;
        System.out.println(s6);
    }
}
