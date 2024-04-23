package week4;

public class Square {
  private final int length;

  public Square(int length) {
    this.length = length;
  }

  public int getLength() {
    return this.length;
  }

  public int area() {
    return this.length * this.length;
  }

  public static void main(String[] args) {
    Square s = new Square(3);
    
  }

}
