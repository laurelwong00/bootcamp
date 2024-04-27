package week4.Recursive;

public class BootcampException extends Exception{
  //"extends Exception" imples BootcampException is a check exception
  //because Exception class is a checked exception

  public static void main(String[] args) {

    try {
      calculate(10,0);
      System.out.println("End of Calculate() method");
    } catch (BootcampException e) {
      System.out.println("Exception in calculate() method, recovery step...");
    } finally {
      System.out.println("done");
    }
  }

  public static int divide(int x, int y) {
    return x/y;
  }

  public static void calculate(int x, int y) throws BootcampException {
    try {
      divide(10, 0);
    } catch (ArithmeticException e) {
      throw new BootcampException(); 
      //because its a checked exception, so we have to handle it before compilation
    }
  }
}
