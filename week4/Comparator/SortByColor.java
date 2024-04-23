package week4.Comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SortByColor implements Comparator<Ball> {
  
  @Override
  public int compare(Ball b1, Ball b2) {
    return b1.getColor().name().charAt(0) > b2.getColor().name().charAt(0)? -1: 1;
  }

  public static void main(String[] args) {
    List<Ball> balls = new LinkedList<>();
    balls.add(new Ball(Color.BLACK, 10.3d));
    balls.add(new Ball(Color.YELLOW, 2.0d));
    balls.add(new Ball(Color.YELLOW, 3.2d));
    balls.add(new Ball(Color.RED, 7.4d));
    balls.add(new Ball(Color.RED, 2.4d));

    int random = new Random().nextInt(2); //0 or 1
    Comparator<Ball> formula = null;
    if (random == 0) {
      formula = new SortByColor();
    } else if (random == 1) {
      formula = new SortBySize();
    }


    Collections.sort(balls, new SortByColor()); //compile time check if the list of the objects implements a contract "comparable"
    //have comparable sin can call compareTo
    System.out.println(balls);
  }
}
