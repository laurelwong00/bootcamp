package week4.Generics;

public class IntegerPrinter {
  private Integer data;

  public IntegerPrinter(Integer data) {
    this.data = data;
  }
  public void  print() {
    System.err.println(this.data);
  }
  public static void main(String[] args) {
    IntegerPrinter ip = new IntegerPrinter(3);
    ip.print();
  }
}
