package week5.LambdaDemo.Shape;

public interface Shape {
  double area();

  public static void main(String[] args) {
    Shape circle = () -> {
      return 3.0d * 3.0d * Math.PI;
    };
  }

}
