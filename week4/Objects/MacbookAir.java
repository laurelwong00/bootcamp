package week4.Objects;

import java.util.Objects;

public class MacbookAir {

  private double inch;
  private double cpu;
  private double ram;
  private double disk; // 判斷product, if yes then same price
  private Color color;

  public MacbookAir(double inch, double cpu, double ram, double disk, Color color) {
    this.inch = inch;
    this.cpu = cpu;
    this.ram = ram;
    this.disk = disk;
    this.color = color;
  }

  public double getInch() {
    return this.inch;
  }

  public double getCpu() {
    return this.cpu;
  }

  public double getRam() {
    return this.ram;
  }

  public double getDisk() {
    return this.disk;
  }

  public Color getColor() {
    return this.color;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof MacbookAir))
      return false;
    MacbookAir ma = (MacbookAir) obj;
    //return this.inch == ma.getInch()
    // && this.cpu == ma.getCpu()
    // && this.ram == ma.getRam()
    // && this.disk == ma.getDisk()
    // && this.color == ma.getColor();
    return Objects.equals(this.cpu, ma.getCpu())
      && Objects.equals(this.ram, ma.getRam())
      && Objects.equals(this.disk, ma.getDisk())
      && Objects.equals(this.color, ma.getColor());
  }
    @Override
    public int hashCode() {
      return Objects.hash(this.inch, this.cpu, this.ram, this.disk, this.color);
  }
    
    public static void main(String[] args) {
      MacbookAir ma1 = new MacbookAir(15,3,32,512,Color.BLACK);
      MacbookAir ma2 = new MacbookAir(15,3,32,512,Color.BLACK);

      System.out.println(ma1.hashCode());
      System.out.println(ma2.hashCode()); 
      System.out.println(System.identityHashCode(ma1));
      System.out.println(System.identityHashCode(ma2));
    }
}

