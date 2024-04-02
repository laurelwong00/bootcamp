public class JavaQuest8 {
  public static void main(String[] args) {
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int Max = Integer.MIN_VALUE;
    int SecondMax = Integer.MIN_VALUE;
    int j = 0;
    // code here ...
    for (int i = 0; i < nums2.length; i++){
      if (nums2[i] > Max) {
        Max = nums2[i];
      } if (nums2[i] > Max) {
        SecondMax = nums2[j] ;
    } 
      }
      System.out.println("Second max= " + Max);

    }
  }
    