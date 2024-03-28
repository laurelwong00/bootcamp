public class DemoQuest4 {
  public static void main(String [] args) {
    int count = 0;

    for (int i = 0; i < 100; i++) {
      if (i%6 ==0 && i!= 0) {
        System.out.println(i);
        count++;
      } if (count == 10) {
        break;
      }
    }
  }
}
