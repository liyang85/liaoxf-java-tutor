public class TestArray {
    public static void main(String[] args) {
//        Array style 1 数组语法1
//        int[] ns = new int[5];
//        ns[0] = 68;
//        ns[1] = 79;
//        ns[2] = 91;
//        ns[3] = 85;
//        ns[4] = 62;
//        System.out.println("ns' length is: " + ns.length);
//        System.out.println("ns[3] is: " + ns[3]);
//        System.out.println("ns[6] is: " + ns[6]);     // error

//        Array style 2 数组语法2
//        int[] a2 = new int[] { 68, 79, 91, 85, 62 };
//        System.out.println(a2.length);

//        Array style 3 数组语法3
//        int[] a3 = { 68, 79, 91, 85, 62, 58 };
//        System.out.println(a3.length);

//        A String array
        String[] names = { "ABC", "XYZ", "zoo" };
        String s = names[1];
        names[1] = "cat";
        System.out.println(s);
    }
}
