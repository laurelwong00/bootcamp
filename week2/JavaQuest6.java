public class JavaQuest6 {
  /**
   * Expected output:
   * 1 1 2 3 5 8 13 21 ...
   * 
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // Code here ...
    // for loop to print first 15 numbers in Fibonacci Sequence
    int n = 15;
    int[] Fibonacci = new int[n];
    Fibonacci[0] = 0;
    Fibonacci[1] = 1;

    for (int i = 2; i < n; i++) {
      Fibonacci[i] = Fibonacci[i-2] + Fibonacci[i-1];
    } 
    
    for (int i = 0; i < n; i++){
      System.out.print(Fibonacci[i] + " ");
    }
    
  }
}
