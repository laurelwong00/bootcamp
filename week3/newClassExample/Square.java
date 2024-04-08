package week3.newClassExample;

public class Square {
  private double length;

  public void setLength(double length) {
    this.length = length;
  }
  public double getLength() {
    return this.length;
  }
  public double area() {
    return Math.pow(this.length, 2.0);
  }

  public static void main(String[] args) {
    Square square = new Square();
    square.setLength(17.0);
    System.out.println(square.area());
  }
}
