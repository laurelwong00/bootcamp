package week4.dice;

public class Player {
  
  public int start() {
    Roll[] dices = new Roll[] {new Dice1(), new Dice2()};
    int sum = 0;
    for (Roll dice: dices) {
      sum+= dice.roll();
    }
    return sum;
  }

  public Result start2() {
    Result result = new Result();
    result.setColor(New Dice1().roll2());
    result.setFCP(new Dice2().roll2());
    return result;
  }
  public static void main(String[] args) {
    Player p = new Player();
    System.out.println(p.start());
    System.out.println(p.start());
  }
}
