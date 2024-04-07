package week2;

public class StaticMethod2 {
  public static double area(double x) {
    double pi = Math.PI;
    double area = pi * Math.pow(3.2, 2);
    return area;
  }

  public static double area(String s, double r) {
    double pi = Math.PI;
    double area = 0.0;
    if ("circle".equals(s)) {
      area = pi * Math.pow(r, 2);
    } else if ("square".equals(s)) {
      area = Math.pow(r, 2);
    }
    return area;
  }

  public static double calculation(String s, String t, double x) {
    double pi = Math.PI;
    double calculation = 0.0;
    if ("circle".equals(s) && "area".equals(t)) {
      calculation = pi* Math.pow(x,2);
    } 
    else if ("square".equals(s) && "area".equals(t)){
      calculation = Math.pow(x,2);
    } 
    else if ("circle".equals(s) && "perimeter".equals(t)){
      calculation = 2*pi*x;
    }
    else if ("square".equals(s) && "perimeter".equals(t)){
      calculation = 4*x;

    }
    return calculation;
  } //should not write like this haha, should write if in if write less thing
  public static boolean isAdult(int age) {
    //approach 1
    // if (age >= 18) 
    // return true;
    // return false;

    //approach 2
    //return age >= 18? true: false;or 1: -1

    //approach 3
    return age >=18;
  }
}
