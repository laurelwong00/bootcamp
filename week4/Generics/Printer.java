package week4.Generics;

public class Printer<T> {

  public T data;

  public Printer(T data){
    this.data = data;
  }

  public void print() {
      System.out.println(data.toString());
  }

  public static void main(String[] args) {
    Printer<String> ps = new Printer<>("hello");
    ps.print();
    ps.data

    Printer<Integer> ip = new Printer<>(3);
    ip.print();
  }
}
