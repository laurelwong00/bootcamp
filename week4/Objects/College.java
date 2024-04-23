package week4.Objects;

import java.util.Objects;

public class College {
  private double area;

  public double getArea() {
    return this.area;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof College))
      return false;
    College c = (College) obj;
    return Objects.equals(this.area, c.getArea());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.area);
  }
  @Override
  public String toString() {
    return "College(" + "area = " + this.area + ")";
  }
  public static void main(String[] args) {
    Object o = new College();
    // College c = new Object(); //not ok
    //College c = new College(); // ok
    o.hashCode(); //address => int //31
    o.equals(new College()); //true after override equals()
    new College().hashCode();  //31, after override hashCode()

    if (o instanceof College) { //ask if o is an object of College.class return true/false
      College c2 = (College) o;
    }

    Class<?>s = o.getClass();
    System.out.println(s.getName());
  }
}
