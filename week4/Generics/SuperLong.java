package week4.Generics;

public interface SuperLong extends Number implements Swim {
  
  @Override
  public void swim() {
    System.out.println("I am swimming");
  }

  @Override
  public doubleValue() {
    return (double) super.shortValue();
  }
}
