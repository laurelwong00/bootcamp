package week4.InterfaceDemo;

import java.math.BigDecimal;

public interface Shape {
  //100% abstraction -> no any implementation in interface
  // Interface is a contract that the class should implement

  // No instance variable in interface
  // You can only define public static final variable in interface
  //public static final String s = "hello";

  String s = "hello"; 
  BigDecimal PI = BigDecimal.valueOf(Math.PI);

  // implicitly public
  double area();
  String print();

  //static method, with implementation class
  //public static double area(Square[] squares) {

  //}

  //public static double area(Circle[] squares) {
    
 // }

 public static double area(Shape[] shapes) {
  BigDecimal sum = BigDecimal.valueOf(0.0);
  for (Shape shape : shapes) {
    sum = sum.add(BigDecimal.valueOf(shape.area()));
  }
  return sum.doubleValue();
 }
  public static void main(String[] args) {
    System.out.println(Shape.s);

    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle(); //circle object put into shape array
    shapes[1] = new Square(); //square object put into shape array
    //shapes[1] = new shape(); //cannot
  }
}
