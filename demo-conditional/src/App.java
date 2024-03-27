public class App {
    public static void main(String[] args) throws Exception {
        int x = -1;
        if (x > 3) {
            int y = 10;
            System.out.println("Hello, World! " + y);
        } else {
            System.out.println("Hello, I am capybara! " + x); // can't + y here
        }
        if (x > 2) {
            System.out.println("x > 2");

        } else if (x >= 0 && x <= 2) { // AND events
            System.out.println("x>=0 and x<=2");

        } else {
            System.out.println("Oh no");

        }
        // boolean result = x > 2 // x>2 is a true/false
        int a = 12;
        int b = 10;
        int max = a;
        if (b > a) {
            max = b;
        }
        System.out.println("The max number is " + max + ".");
        String day = "Monday";
        // Example 2
        String target = "weekend";//
        if ("Monday".equals(day) || day.equals("Tuesday") || //
                day.equals("Wednesday") || //
                day.equals("Thursday") || //
                day.equals("Friday"))
            target = "weekday";
        System.out.println(day + " is " + target);

        //example 3
        int score = 85;
        String result = "";
        char grade = ' ';
        
        if (score > 90) {
            grade = 'A';
        } else if (score > 80) { //no need && score<90 because 85 is not >90 then automatically next one
            grade = 'B';
        } else if (score > 70) {
            grade ='C';
        } else {
            grade = 'F';
        }
        if (score > 70) {
            result = "passed";
        } else {
            result = "failed";
        }
        System.out.println("The grade is " + grade + " and " + result +'.');
        }
        
    }


