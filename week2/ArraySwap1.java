package week2;

import java.util.Arrays;

public class ArraySwap1 {
  public static void main(String[] args) {

    int arr4[] = new int[] { -10, -42, 8, 19, 1 };

    for (int i = 0; i < arr4.length - 1; i++) { //i 組織每round都改變既 j
      for (int j = 0; j < arr4.length - i - 1; j++) {
        if (arr4[j] > arr4[j + 1]) {
          // Swap arr4[j] and arr4[j + 1]
          int temp = arr4[j];
          arr4[j] = arr4[j + 1];
          arr4[j + 1] = temp;
        }

      }
    }
    System.out.println(Arrays.toString(arr4));
  }
}
