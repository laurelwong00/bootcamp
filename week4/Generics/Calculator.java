package week4.Generics;

public class Calculator {
  
  public static int sum(int x,int y) {
    return x + y;
  }

  public static <T extends Number> double sum(T x,T y) { //T can be any objects, so only can wrapper class
    //T can be Byte, Short, Integer, Long, Double // can't be primitive
    return x.doubleValue() + y.doubleValue();
  } //limit the type range of x and y, so that x and y must be able to call doubleValue()
  //calling doubleValue() from that class of the x or y; 

  public static void main(String[] args) {
    System.out.println(sum(2,3.7d));;
    System.out.println(sum(3.07f, 10000L));//run-time polymorphism
  }      
}
