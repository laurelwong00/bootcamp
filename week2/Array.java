package week2;

public class Array {
  public static void main(String[] args) {
    int [] integers2 = new int[]{1,2,3,4,5,6,7};
    for (int i = 0; i < integers2.length + 1 ; i++) {
      if (i%2 != 0) {
        System.out.println(i);
      }
    }
    System.out.println("------------------");

    int count = 0;//must be int
    double sum = 0;//might 除單數 become 點數
    for (int i = 0; i < integers2.length + 1; i++) {
      if (i % 2 == 0) {
        count++;
        sum += integers2[i];
      }
  } System.out.println(sum/ count);
    
    //find the maa value within the int array
    int max = Integer.MIN_VALUE; // the min value of int
    for (int j = 0; j < integers2.length; j++){
      if (integers2[j] > max) {
        max = integers2[j];
      }
    }
    System.out.println("max= " + max);

    //Searching
    char[] characters = new char[] {'a', 'b', 'e', '!', '！'};
// Check if the array contains char '!'
  int index = -1;
  for (int k = 0; k < characters.length; k++) {
      if (characters[k] == '!') {
        index = k; // Print the index where '!' is found
        break; 

} System.out.println(k);

System.out.println("---------------");

char[] characters1 = new char[] {'a', 'b', '!', 'e', '!'};
int counts = 0;
for (int x = 0; x < characters.length; x++) {
  if (characters[x] == '!') {
    counts++; 
   } 
  }
  System.out.print(counts + " ");
  }
}
    }
  

  

