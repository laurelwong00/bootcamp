package week3;

import java.util.Arrays;

// Input: n = 5
// Output: [-7,-1,1,3,4]
// Explanation: These arrays are also accepted [-5,-1,1,2,3], [-3,-1,2,-2,4].

// Input: n = 3
// Output: [-1, 1, 0] or [-3, 1, 2] or ...

// Input: n = 2
// Output: [-2, 2] or [-1, 1] or ...

// Input: n = 1
// Output: [0]

public class JavaQuest16 {
  // Given an integer n (n > 0), Find n unique Integers Sum up to Zero

  // Do not change anything in main method
  public static void main(String[] args) {
    int[] nums = sumToZero(5); // n = 5
    int[] nums1 = sumToZero(3); // n = 3
    int[] nums2 = sumToZero(2); // n = 2
    int[] nums3 = sumToZero(1); // n = 1
    System.out.println("n = 5: " + Arrays.toString(nums));
    System.out.println("n = 3: " + Arrays.toString(nums1));
    System.out.println("n = 2: " + Arrays.toString(nums2));
    System.out.println("n = 1: " + Arrays.toString(nums3));

  }

  public static int[] sumToZero(int n) {
    int[] nums = new int[n];
    
    // Fill the array with alternating positive and negative numbers
    for (int i = 0; i < n - 1; i++) {
        if (i % 2 == 0) {
            nums[i] = 1;
        } else {
            nums[i] = -1;
        }
    }
    
    // Set one entry to 0 to ensure total sum is zero for odd n
    if (n % 2 != 0) {
        nums[n - 1] = 0;
    } else {
        nums[n - 1] = -1; // Set the last element to -1 for even n
    }
    
    return nums;
}

}