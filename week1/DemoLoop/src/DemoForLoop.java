public class DemoForLoop {
    public static void main(String[] args) {

        int x = 2;
        x = x * x; // 2x2=4
        x *= x; // 4x2=8

        System.out.println("hello capybara");

        // for (initialization; continue condition; incremental rule)
        // 中間continue condition empty then keep loop

        for (int i = 0; i < 10; i++) { // can ++i, 獨立自己, 沒分別
            // int i = 0; i < 3 ; i*=i
            // step 1: initialize i = 0
            // step 2: i<3? yes
            // step 3: Print hello world
            // step 4: i++ -> i = 1
            // step 5: i<3? yes
            // step 6: Print hello world
            // step 7: i++ -> i = 2
            // step 8: i<3? yes
            // step 9: Print hello world
            // step 10: i++ -> i = 3
            // step 11: i<3? no -> end of loop

            // Never to re-assign value to i within the loop
            System.out.println("hello capybara " + i);
        }
        for (int j = 5; j > 0; j--) {
            System.out.println("hello capybara " + j);
        }

        for (int k = 1; k < 10; k += 2) {
            System.out.print(k + " ");

        }
        System.out.println();
        for (int p = 1; p < 6; p++) {

            int consecutive = 2 * p - 1;

            System.out.print(consecutive + " ");

        }
        System.out.println();
        for (int q = 0; q < 10; q++) {
            if (q % 2 == 1) {
                System.out.print(q + " ");
            }

        }
        System.out.println();

        String s = "abcdefg";
        for (int c = 0; c <= s.length(); c += 2) {
            System.out.print(s.charAt(c) + " ");
        }
        // for (int i = 0; i<s.length(); i++) {
        // string result = "";
        // if (i%2==0){
        // result += s.charAt(i);
        // System.out.print(i + " ") abcdefg
        System.out.println();

        String str = "hello world";
        int count = 0;
        
        // count the number of 'l' ->3
        for (int t = 0; t < s.length(); t++) {
            if (str.charAt(t) == 'l') {
                count++ ;
            }
            
        } System.out.print(count);
        System.out.println();
        //1-2+3-4+5....-10
        int sum = 0;

        for (int u = 1; u <= 10; u++) {
            if (u%2 == 0) {
                sum -= u;
            } else {
                sum += u;
            }
        }
        System.out.print(sum);
}
}