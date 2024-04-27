package week4.Recursive;

public class Exception1 {
  public static void main(String[] args) {
    //checked exception (compile error)
    //unchecked exception (run-time error)
    int total = 0;
    try{
      total = totalSalary(new int[] {100, -10, 45}); //java.lang.IllegalArgumentException
    } catch (IllegalArgumentException e) {
      total = 0;
    }
    System.out.println(total);

    int divisor = 1;
    try{
      divisor = division(0);
    } catch (ArithmeticException e) {
      divisor = -1;
    }
    System.out.println("divisor");

    try {
      getString(new char[] {'c','a'}, -2, 2);
    } catch (ArrayIndexOutOfBoundsException e) {
      
    }

    int n1= 7;
    int n2 = -8;
    try {
      if (n1 + n2 > 0) {
        System.out.println("correct");
      } 
    }
  }

  public static int totalSalary(int[]arr) {
    int sum = 0;
    for(int x : arr) {
      if (x < 0) {
        throw new IllegalArgumentException(); //an error event
      }
      sum += x;
    }
    return sum;
  }

  public static int division(int n) {
    int divisor = 1;
    divisor = 100 / n;
    return divisor;
  }

  public static String getString(char[] characters, int beginIdx, int endIdx) {
    StringBuilder sb = new StringBuilder();
    for (int i = beginIdx; i <= endIdx; i++) {
      sb.append(characters[i]); 
    }
    return sb.toString();
  }
}
