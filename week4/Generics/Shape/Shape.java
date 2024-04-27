package week4.Generics.Shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public interface Shape {
  
  double area();

  static double area(List<Shape> shapes) {
    BigDecimal bd = BigDecimal.valueOf(0);
    for (Shape s : shapes) {
      bd = bd.add(BigDecimal.valueOf(s.area()));
    }
    return bd.doubleValue();
  }

  static <T extends Shape> double area2(List<T> shapes) {
    BigDecimal bd2 = BigDecimal.valueOf(0);
    for (T s : shapes) {
      bd2 = bd2.add(BigDecimal.valueOf(s.area()));
    }
    return bd2.doubleValue();
  }

  public static void main(String[] args) {
    Circle c = new Circle(3);
    Square s = new Square(5);
    List<Shape> shapes = new LinkedList<>();
    shapes.add(c);

    List<String> strings = new ArrayList<>();

    List<Object> shapes2 = new LinkedList<>();
    shapes2.add(c);
    shapes2.add(3);//Integer wrapper class //Array都係object
    shapes2.add(strings);
  }
} 
