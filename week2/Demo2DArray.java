package week2;

public class Demo2DArray {
  public static void main(String[] args) {
    int[] arr = new int[] {2,1,3};
  //2D array
  int[] [] arr2 = new int[][]{{2,3},{3,1},{2,3}};
  int[] [] arr3 = new int[3][2]; //2 is row 3 is column
  arr3[0][0] = 2;
  arr3[0][1] = 3;
  arr3[1][0] = 3;
  arr3[1][1] = 1;
  arr3[2][0] = 2;
  arr3[2][1] = 3;
  
  int sum = 0;
  for (int i = 0; i < arr3.length; i++) {
    for (int j = 0; j < arr3[i].length; j++) {
      sum += arr3[i][j];
    }
  }
  System.out.println(sum);
  }

}
