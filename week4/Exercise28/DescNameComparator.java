package week4.Exercise28;

import java.util.Comparator;

public class DescNameComparator implements Comparator<Movies> {
  
  public int compare(Movies m1, Movies m2) {
    return m1.getName().charAt(0) > m2.getName().charAt(0)? -1:1;
  }
}
