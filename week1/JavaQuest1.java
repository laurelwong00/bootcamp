public class JavaQuest1 {

  /**
   * @param args
   */
  public static void main(String[] args) {

    System.out.println("I am going to add two numbers together:");
    int first = 31;
    int second = 42;
    
    
    System.out.println("The first one: " + first);
    System.out.println("The second one: " + second);


    // Add two numbers and print it out
    int sum = first + second;
    System.out.println("The sum is " + sum);

    // subtraction
    int subtract = Math.abs(first - second);
    System.out.println("The subtraction result is " + subtract);

    // another sum
    byte b1 = 60;
    byte b2 = 70;
    int bsum = (int) (b1 + b2);
    System.out.println("The another sum result is " + bsum);

    // declare two boolean variable with true and false value
    boolean varB = false;
    boolean varC = true;
    System.out.println("The variable varB is " + varB);
    System.out.println("The variable varC is " + varC);

    // Reading Example
    float fnumber = -130.20f; // By default, numbers are treated as double in Java.
    // Use suffix 'f' with value to make it float.
    double dnumber = -20.50;
    System.out.println("The variable fnumber is " + fnumber);
    System.out.println("The variable dnumber is " + dnumber);

    // Find reminder. Declare variable a & reminder
    int a = 7;
    int b = 3;
    // Fix it ...
    int reminder = a % b;
    System.out.println("The variable reminder is " + reminder);

    // declare a variable x and assign value to it.
    int e = 7;
    int o = 8;
    int y = 4;
    int x = 2;
    int result = e - o * x / y;
    System.out.println("The result is " + result);
    System.out.println("/");
    //Primitive types and operators
  }
}