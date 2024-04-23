package week4.dice;

import java.util.Arrays;
import java.util.Random;

public class Dice1 implements Roll, Color {
  
  private final Color[] colors = {Color.RED, Color.YELLOW, Color.BLUE, Color.PINK, Color.BLACK, Color.WHITE};

  public Color[] getClass() {
    return this.colors;
  }

  @Override
  public String toString() {
    return "Dice1(" + "colors = " + Arrays.toString(this.colors) + ")";
  }

  @Override
  public int roll() {
    //Random 0-2 numbers from array
    int idx = new Random().nextInt(3); //0-2
    return Colors[idx].getValue();
  }

  public static void main(String[] args) {
    Dice1 d = new Dice1();
    d.getColors()[1] = Color.RED;
  }
}
