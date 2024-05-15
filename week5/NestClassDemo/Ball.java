package NestClassDemo;

public class Ball {
  private Color color;
  private double weight;

  enum Color {
    RED, YELLOW, BLACK,;
  }

  public Ball(Color color, double weight) {
    this.color = color;
    this.weight = weight;
  }

  //Builder Pattern (Coding Pattern)
  //1. avoid setter, so to create ball object with all attribute value;
  //2. avoid all-args constructor;
  public static class BallBuilder {
    private Color color;
    private double weight;

    public BallBuilder setColor(Color color) {
      this.color = color;
      return this;
    }

    public BallBuilder setWeight(double weight) { //chain method
      this.weight = weight;
      return this;
    }

    public Ball build() {
      return new Ball(this.color, this.weight);
    }

    public static BallBuilder builder() {
      return new Ball(this.color, this.weight);
    }

    public static void main(String[] args) {
      Ball ball = new Ball.BallBuilder()// empty constructor of BallBuilder
      .setColor(Color.RED).setWeight(30.0d).build();

      Ball ball2 = Ball.builder(BallBuilder.of(ball2.setColor(Color.RED).setWeight(30.0d)));
    }  
  }
}
