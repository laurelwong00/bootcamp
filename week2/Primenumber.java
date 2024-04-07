package week2;

public class Primenumber {
  public static void main(String[] args) {
    for (int i = 3; i < 102; i+=2) {
      boolean isPrime = true;
      for (int j = 2; j < i/2; j++) {
        if (i%j == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime == true) {
        System.out.print(i + " ");
      }
    }
    
  }
}
