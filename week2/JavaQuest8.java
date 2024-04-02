package week2;

public class JavaQuest8 {
    public static void main(String[] args) {
        int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 };
        
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] > max) {
                secondMax = max;
                max = nums2[i];
            } else if (nums2[i] > secondMax && nums2[i] != max) {
                secondMax = nums2[i];
            }
        }
        
        System.out.println("Second max = " + secondMax);
    }
}
