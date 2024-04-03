package week2;
import java.util.Arrays;

public class ArraySwap2 {
  public static void main(String[] args) {
    
    int[] arr5 = new int[] {-10, -5, -30, 9, 1, -100};
    for (int i = 1; i < arr5.length; i++){
      int key = arr5[i];
      int j;
      for (j = i - 1; j >= 0 ; j--) {
        if (arr5[j] <= key) {
          break; //盡量break 係in if instead of else
        } 
        arr5[j+1] = arr5[j];
      }
      arr5[j+1] = key;
    }
    System.out.println(Arrays.toString(arr5));
  }
}
