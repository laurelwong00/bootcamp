package week4.Generics;

public class StringPrinter {
  
  private String data;

  public StringPrinter(String data) {
    this.data = data;
  }
  public void print() {
    System.err.println(this.data);
  }

  public void setData(String data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "StringPrinter(data= " + this.data + ")";
  }
  public static void main(String[] args) {
    StringPrinter sp = new StringPrinter("hello");
    sp.print();
  }
}
