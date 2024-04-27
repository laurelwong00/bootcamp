package week4.Generics.Shape;

public class Square implements Shape {

  private double length;

  public Square(double length) {
    this.length = length;
  }

  public double getLength() {
    return this.length;
  }

  public void setRadius(double length) {
    this.length = length;
  }

  @Override
  public double area() {
    return this.length * this.length;
  }
}
