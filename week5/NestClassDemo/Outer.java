package NestClassDemo;

public class Outer {
  private int x = 10;
  private static int y = 100;

  public int getY() {
    return y;
  }

  public int getX() {
    return this.x;
  }

  private static class StaticNested {
    void print() {
      System.out.println("hello" + y);//can't read x
    }
  }

  public void print() {
    class LocalInner {
      int x;
      LocalInner(int x) {
        this.x = x;
      }
      void print() {
        System.err.println("hello3 " + this.x);
      }
    }
    LocalInner li = new LocalInner(20);
    li.print();
  }

  private class Inner{ //non static
    void print() {
      System.err.println("hello2" + x + y); //can read x and y 
      //can't write this.x becuz x is outer object
    }
  }

  public static void main(String[] args) {
    Outer o1 = new Outer();
    System.out.println(o1.x);
    System.out.println(Outer.y);

    Outer.StaticNested o2 = new Outer.StaticNested(); //唔寫Outer都得in 自己範圍static
    o2.print();

    Outer o3 = new Outer();
    Outer.Inner o4 = o3.new Inner();
    Outer.Inner o5 = o3.new Inner();

    o4.print();
    o5.print(); 

    Outer o6 = new Outer();
    o6.print();
    
    Drivable vincent = new Drivable() {
      @Override
      public void drive() {
        System.out.println("I am driving");
      }
    };
    vincent.drive();
  }
}
