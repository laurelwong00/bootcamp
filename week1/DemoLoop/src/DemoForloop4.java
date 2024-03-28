public class DemoForloop4 {
  public static void main(String [] args) {
String a = " ";
    
    for (int i = 1; i < 5; i++) {
      System.out.print(a);
      for (int p = 1; p < i ; p++) { 
        System.out.print("* "); 
      } 
      System.out.println();

    }
    for (int k = 5; k > 1; k--) { //height
      for (int p = 1; p < k; p++) { //length
      System.out.print("* "); 
    } 
    System.out.println();
  }
  }
}
