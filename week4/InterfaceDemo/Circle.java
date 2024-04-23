package week4.InterfaceDemo;

import java.math.BigDecimal;

//1. You can implement more than 1 Interface in a class
public class Circle implements Shape {
  
  private double radius;

  public double getRadius() {
    return this.radius;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(this.radius)).multiply(PI).doubleValue();
  }

  @Override
  public String print() {
    return String.valueOf(this.radius);
  }

  public static void main(String[] args) {
    // Polymorphism
    Shape s = new Circle(); //OK 
    s.area(); //shape 有既野 circle一定有 繼承者一定要履行所有合約内用
    s.print();
    //繼承者獨有既method, parent 仍然call唔到;
  }
}