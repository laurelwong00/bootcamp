package week3.ourRestaurant;

public class Menu {
  public static final String[] items = new String[]{"beef don", "chicken don"};
  public static final int[] prices = new int[]{20, 18};

  public static boolean haveItem(String order) {
    for (int i = 0; i < items.length; i++) {
      if (items[i].equals(order)) {
        return true;
      }
    }
    return false;
  }

  public static int priceOfOrder(String order) {
    for (int i = 0; i < items.length; i++) {
      if (items[i].equals(order)) {
        return prices[i];
      }
    }
    return -1;
  }
}
