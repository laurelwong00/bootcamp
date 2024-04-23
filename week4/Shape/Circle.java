package week4.Shape;
import java.math.BigDecimal;

public class Circle extends Shape{
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }
  
  @Override
  public double area() {
    return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(this.radius)).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
  }

  @Override
  public boolean equals(Object o) { //Method Signature
    if (this == 0) {
      return true;
    } 
    if (!(o instanceOf Circle)) { //The relationship between Object object and Circle object
      return false;
    }
    Circle circle = (Circle) o;
    return this.radius == circle.getRadius()
  }


  public static void main(String[] args) {
    Circle c = new Circle(12);
    Circle c2 = new Circle(13);
    Circle c3 = c;

    System.out.println(c.equals(c2));
    System.out.println(c.equals(c3));
  }

}
