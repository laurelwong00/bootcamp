package week2;

import java.util.Arrays;

public class ArraySwap {
  public static void main(String[] args) {

    int[] arr3 = new int[] { 10, 3, 9, 4 };
    int temp = arr3[0];
    arr3[0] = arr3[2];
    arr3[2] = temp;

    System.out.println(Arrays.toString(arr3));

    int t = -1;
    for (int i = 0; i < arr3.length - 1; i++) {
      t = arr3[i];
      arr3[i] = arr3[i+1];
      arr3[i+1] = t;
    }
    System.out.println(Arrays.toString(arr3));

    int max = Integer.MIN_VALUE;
    int position = -1;
    for (int j = 0; j < arr3.length; j++) {
      if (arr3[j] > max){
        arr3[j] = max;
        position = j;
      }
    }
    for (int j = position; j > 0; j--) {
      t = arr3[j];
      arr3[j] = arr3[j-1];
      arr3[j-1] = t;
    }
    System.out.println(Arrays.toString(arr3));
  }
}
