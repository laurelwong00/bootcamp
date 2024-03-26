public class Datatype {
  public static void main(String[] args) {
    //variable 變數
    //integer 整數
    int x = 3;
    int y = 0;
    x = 3;
    System.out.println("x"); //x (string)
    System.out.println(x); //3
    

    int price = 8;
    int quantity = 10;
    int total = price * quantity;
    System.out.println(total);

    int price2 = 20;
    int quantity2 = 7;
    int total2 = price2 * quantity2;
    double averagePrice = (double)(total + total2)/(quantity + quantity2);
    //averagePrice (java) average_price (python)
    System.out.println(averagePrice);
    float k = 5.444444444444444444444444444444f;
    System.out.println(k);
    double k1 = 0.1 ;
    double k2 = 0.2;
    double k6 = k1 + k2;
    System.out.println(k6);
    float k3 = 0.1f;
    float k4 = 0.2f;
    float k5 = k3 + k4;
    System.out.println(k6);
  }
  
}
