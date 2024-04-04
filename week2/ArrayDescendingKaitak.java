package week2;
import java.util.Arrays;

public class ArrayDescendingKaitak {
  public static void main(String[] args) {
    int[] arr1 = new int[] {1,30,31,8,200,7};
    for (int i = 1; i < arr1.length; i++){
      int temp = arr1[i];
      int j;
      for (j = i-1; j >= 0; j--){
        if (temp > arr1[j]) {
          arr1[j+1] = arr1[j];
        } else {
          break;
        }
      }
      arr1[j+1] = temp;
    }
    System.out.println(Arrays.toString(arr1));
  }
}
