package week4.LambdaDemo.java.Shape.java;

public class Shape {
  double area;

  public static void main(String[] args) {
    Shape circle = () -> {
      return 3.0d * 3.0d * Math.PI;
    }
  }

}
