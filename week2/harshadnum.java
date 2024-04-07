package week2;

public class harshadnum {
  public int harshadnumbersum (int x){
    int y = x;
    int digitsum = 0;
    while (y > 0) {
      digitsum += y % 10;
      y /= 10; 
    }
    return x % digitsum == 0 ? digitsum : -1;
  }
}
