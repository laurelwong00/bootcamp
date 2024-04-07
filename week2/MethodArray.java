package week2;
import java.util.Arrays;


public class MethodArray {
  public static double totalAmount(double[] prices, int[] quantities, String whatTotal) {
    double total = 0.0;

    for (int i = 0; i < prices.length; i++) {
      double itemSubTotal = prices[i] * quantities[i];

      if ("Subtotal".equals(whatTotal)) {
        total += itemSubTotal; // Accumulate subtotal
      } else if ("Total".equals(whatTotal)) {
        total += itemSubTotal; // Accumulate total
      }
    }

    return total;
  }

  // or the following
    public static double totalAmount(double[] prices, int[] quantities, String whatTotal) {
      double total = 0.0;

      for (int i = 0; i < prices.length; i++) {
        double itemSubTotal = prices[i] * quantities[i];

        if ("Subtotal".equals(whatTotal)) {
          total += itemSubTotal; // Accumulate subtotal
        } else if ("Total".equals(whatTotal)) {
          total += itemSubTotal; // Accumulate total
        }
      }

      return total;
    }
    String[] ss = new String[] {"a a a", "b bb"};//pass by a value(a copy of the original string object)
    public static String [] trimSpace(String[] ss) {
      return ss.replace(" ","");
    }


    public static void trimSpace1(String[] ss) { //pass by reference
      for (int i = 0; i < ss.length; i++) 
        if (ss[i].contains(" ")) { //actually no need this if 
          ss[i] = ss[i].replace(" ", "");
        }
    }
  }

