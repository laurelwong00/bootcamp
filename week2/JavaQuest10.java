package week2;

import java.util.Arrays;
import java.util.Scanner;

public class JavaQuest10 {
  public static void main(String[] args) {
    int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

    Scanner input = new Scanner(System.in);

    System.out.print("Input an index for inserting the value: ");
    int indexPosition = input.nextInt();

    System.out.print("Input the value: ");
    int newValue = input.nextInt();

    System.out.println("Original Array : " + Arrays.toString(my_array));

    if (indexPosition >= 0 && indexPosition < my_array.length) {
      for (int i = my_array.length - 1; i > indexPosition; i--) {
        int newarr[i] = new [my_array[i-1]];
      }
      my_array[indexPosition] = newValue;
    }
    else if (indexPosition == my_array.length) {
      System.out.println();
    }

    // my_array = newArr;
    System.out.println("New Array: " + Arrays.toString(newArr));
  }
}
