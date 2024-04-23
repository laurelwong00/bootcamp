package week4.Comparator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ball implements Comparable<Ball>{

  private Color color;
  private double size;

  public Ball(Color color, Double size) {
    this.color = color;
    this.size = size;
  }

  public double getSize() {
    return this.size;
  }

  public Color getColor() {
    return this.color;
  }


  @Override
  public int compareTo(Ball b){
    return this.size > b.getSize()? -1:1; 
  }
//only can write one compareTo, if u needa keep change the rule then 麻煩
  @Override
  public int compareTo(Ball b){
    return "YELLOW".equals(this.color.toString())? -1:1; //if -1, 將this 向前移
    //return this.color == Color.YELLOW? -1: 1; should write this for enum
    //becuz enum alr tied with memory
  }

  @Override
  public int compareTo(Ball b) {
    if (this.color == Color.YELLOW) {
      return -1;
    }
    return this.color == b.color && this.size > b.getSize()? -1: 1;
  }

  @Override
  public String toString() {
    return "Ball(" + "size= " + this.size + " color= " + this.color + ")";
  }

  public static void main(String[] args) {
    List<Ball> balls = new LinkedList<>();
    balls.add(new Ball(Color.BLACK, 10.3d));
    balls.add(new Ball(Color.YELLOW, 2.0d));
    balls.add(new Ball(Color.YELLOW, 3.2d));
    Collections.sort(balls); //compile time check if the list of the objects implements a contract "comparable"
    //have comparable sin can call compareTo
    System.out.println(balls);
  }
}
