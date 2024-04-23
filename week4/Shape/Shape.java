package week4.Shape;

public abstract class Shape extends Object {
  
  private double area;

  public Shape() {

  }

  public abstract double area();

  public String toString() {
    return this.area;
  }
}
