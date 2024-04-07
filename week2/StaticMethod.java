package week2;

public class StaticMethod { // 一定要有呢句
  public static void main(String[] args) { // 可以沒呢句 //String array[]
    // void is a return type, representing it should not return anything
  }

  // 1+3 = ?
  // 2+5 =?
  int result = sum(1, 3);
  int result2 = sum(2, 5);
  // call method
  result=

  sum(1,3);
  result2 = sum(2,5);

  sum(1.3, 1.4);

  public static int sum(int x, int y) { // void is a 出口, 出口要declare一個type
    // static method
    // "sum" is a method name
    // "(int x, int y)" is a declaration of input parameters for methods
    // int is also a return type
    // keyword "return"; for all non-void scenario
    int z = x + y;
    // return (short) z; //承受精度損失 or overflow
    return z;
  }

  public static int subtract(int x, int y) { // name become subtract then x y will be refreshed
    // 新名新method
    return x - y; // x - y java already knows its an int - int = int
  }

  // Method Definition: Method Name + input parameter
  public static int sum(double x, double y) {
    return (int) (x + y);
  }

  public static int sum(String x, String y) {
    sum("1", "2");
    Integer z = Integer.valueOf(x + y); // convert String to Integer
    return z; // unbox
  }

  public static int compare(int x, int y){
    Integer m = 3;
    Integer n = 4;
    //do not write if (m>n) because compare address number
    if (m.compareTo(n) == 0){
      
    }
    }

  public static int sum1(String x, String y) {
    // Integer z = Integer.valueOf(x) + Integer.valueOf(y) //convert String to
    // Integer
    // Integer Object -> int value
    return Integer.valueOf(x) + Integer.valueOf(y); // Integer + Integer -> int + int -> int
  }
  public static double area(double x) {
    double pi = Math.PI;
    double area = pi * Math.pow(3.2, 2);
    return area;
  }

}
