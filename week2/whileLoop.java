package week2;

import java.util.Arrays;

public class whileLoop {
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {

    }
    int[] arr = new int[] {2,10,3,-1};
    System.out.println(arr[1]);
    //for each
    //if you want to loop through all eleent from the beginning, you can use for each
    for (int i : arr) {
      System.out.println(i); //print the value //can't use the index
    }

    String[] strings = new String[] {"abc", "def"};
    for (String str: strings) {
      System.out.println(str);
    }
    
    //while loop
    int count = 0;
    while (count < strings.length) {
      System.out.println(strings[count]);
      count++;
    }
    //count = 0
    //count < strings.length 
    //print strings [0]
    //count 0 -> 1
    //count < strings.length
    //print strings [1]
    //count 1 -> 2
    //count !< strings.length
    //exit

    // byte b = 0;
    // while (b < 128) {
    //   b++;
    // }
    // System.out.println(b); //-128 to 127 infinity loop

    // int a = 1023;
    // int b = a / 1000;
    // int c = (a % 1000) / 100;
    // int d = (a % 100) / 10; 
    // int e = a % 10;
    // int[] list = new int[] {b,c,d,e};
    // System.out.println(Arrays.toString(list));

    //do-while
    int counts = 5;
    do {
      if (counts == 1); {
        break;
      } 
      System.out.println("hello");
      count++;

    } while(counts<3);
  }
}
