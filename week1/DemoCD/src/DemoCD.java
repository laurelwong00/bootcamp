public class DemoCD {
    public static void main(String[] args) {
        String s = "abcdefg";
        for (int i = 0; i < s.length() - 1; i++) {
            if ('c' == s.charAt(i) && 'd' == s.charAt(i + 1)) {
                System.out.println("true");
            } else {

            }
        }
    }
}
