public class DemoForLoop3 {
  public static void main(String [] args) {
    for (int i = 0; i<10; i++) {
      if (i>=4) {
        break;
      }
      System.out.println("Capy");
    }
    for (int i = 0; i<10; i++) {
      if (i>=4) {
        continue;
      }
      System.out.println("bara");
    }

  }
}
  
