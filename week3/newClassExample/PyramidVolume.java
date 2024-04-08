package week3.newClassExample;

public class PyramidVolume {
  // Variables to store the dimensions of the pyramid
  private double height;
  private double length;
  private double width;

  // Constructor to initialize the dimensions of the pyramid
  public PyramidVolume(double height, double length, double width) {
      this.height = height;
      this.length = length;
      this.width = width;
  }

  public double calculateVolume() {
      double baseArea = length * width;
      return (1.0 / 3.0) * baseArea * height;
  }

  public double getHeight() {
      return height;
  }

  public double getLength() {
      return length;
  }

  public double getWidth() {
      return width;
  }

  public void setHeight(double height) {
      this.height = height;
  }

  public void setLength(double length) {
      this.length = length;
  }

  public void setWidth(double width) {
      this.width = width;
  }
  
}
