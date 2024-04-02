package week2;

import java.util.Arrays;

public class ArrayExercise {
  public static void main(String[] args) {
    char[] characters1 = new char[] { 'a', 'b', '!', 'e', '!' };
    int[] indexes = new int[characters1.length];
    int j = 0;
    for (int i = 0; i < characters1.length; i++) {
      if (characters1[i] == '!') {
        indexes[j++] = i;
        // j++;
      }
    }
    System.out.println(Arrays.toString(indexes));

    //
    String[] balls = new String[] { "RED", "YELLOW", "BLACK", "YELLOW" };
    double[] prices = new double[] { 5.5, 7.8, 10.0, 7.8 };
    int[] quantity = new int[] { 1, 3, 4, 5 }; 
    double sum = 0.0;
    // Yellow balls (price*quantity);

    for (int k = 0; k < balls.length; k++) {
      if ("YELLOW".equals(balls[k])) {
        sum += prices[k] * quantity[k];
      }
    }
    System.out.println(sum);
  }
}
