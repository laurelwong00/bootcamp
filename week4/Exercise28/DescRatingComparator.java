package week4.Exercise28;

import java.util.Comparator;

public class DescRatingComparator implements Comparator<Movies> {
  
  @Override
  public int compare (Movies m1, Movies m2) {
    return m1.getRating() > m2.getRating() ? -1:1;
  }
}
