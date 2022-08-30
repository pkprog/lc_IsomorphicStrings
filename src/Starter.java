public class Starter {

    private static void testRun(String s, String t) {
        System.out.println("*****");
        System.out.println("String1=" + s);
        System.out.println("String2=" + t);
        System.out.println("Isomorphic test=" + new Solution().isIsomorphic(s, t));
    }

    public static void main(String[] props) {
        testRun("121", "111");
        testRun("111", "121");
        testRun("egg", "add");
        testRun("eggss", "addqt");
        testRun("d", "d");
        testRun("yyyyyyyyy", "yyyyyyyyy");
        testRun("yyyyyy1yy", "yyyyyyyyy");
        testRun("12345", "qwert");
        testRun("123451", "qwerty");
    }

}
