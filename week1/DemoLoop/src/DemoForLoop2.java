public class DemoForLoop2 {
  public static void main(String[] args) { //main enter
    
    //loop
    for (int i = 0; i < 5; i++) {
      System.out.print("*");
    }
    //Nested loop
    for (int i = 0; i < 3; i++) { 
      for (int j = 0; j < 2; j++) {
        System.out.println("i=" + i + ",j=" + j);
        //first loop runs from i = 0 until i = 2, everytime i+1, j works 2 times
        //j loop 消耗曬 先返返 i loop
      } System.out.println("capybara");
    }


    //pyramid exercise
    //k = 6, k>1, p=1, p<k, p=2, p=3, p=4, p=5 -> k=5
    for (int k = 6; k > 1; k--) { //height
      for (int p = 1; p < k; p++) { //length
      System.out.print("* "); 
    } 
    System.out.println();
  }
  //searching // find the index of the second of space character
  String str2 = "abcdefg hello world!"; 
  int spaceCount = 0;
  for (int n = 0; n < str2.length(); n++) {
    if (str2.charAt(n) == ' ') {
      System.out.println(str2.charAt(n));
      spaceCount++;

    } if (spaceCount == 2) {
      System.out.println("index is " + n);
      break;
    }
  }

}
}
