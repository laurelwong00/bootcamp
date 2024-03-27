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
    double m1 = 0.1378;
    double m2 = 0.87;
    double m3 = m1 / m2;
    System.out.println(m3);
    float f1 = 0.1378f;
    float f2 = 0.87f;
    float f3 = f1/f2;
    System.out.println(f3);

    int u = 10 % 3; 
    System.out.println(u);

    byte b1 = 10 ;
    byte b2 = 127;
    //byte b3 = 128; compile time error 
    byte b4 = -128;
    short s1 = -32768;
    //short s2 = -32769; compile time error
    boolean o1 = true;
    //boolean o2 = haha; compile time error

    //conversion
    int i1 = 100;
    long l1 = i1;
    //short l1 = 100; no exception
    System.out.println(l1);
    //java ensures security, short is subset of int, so int ->/ short
    // during compile time java don't know 100 fulfils both data type
    //int i1 = 100;
    //short l1 = i1; compile time error
    

    //smaller ranges to higher ranges upgrade ok 
    //larger ranges to smaller ranges downgrade not ok.
    short n1 = 100; //hidden type at the right side
    int n2 = n1;
    System.out.println(n2);//subset to mother set ok.all uncovered

    double d3 = i1;
    System.out.println(d3); //int to double is ok. 
    float a4 = i1;
    System.out.println(a4); //int to float is ok.
    //double d3 = 3.2d //explicitly assigning double from other group
    //float f3 = 3.2f //人手地改頭換面
    int r1 = 10; //exception, bad thing from java
    byte b10 = 4; //if in range, int downgrade to byte 
    //byte b12 = r1 cannot 
    int y1 = 10;
    short h1 = 2; // if in range, int downgrade to short
    System.out.println(h1);

    long l6 = 10000; //10000 int -> long
    long l7 = 10000L; //10000 is a long value, no transformation happened


    //char (character)
    char c1 = 'a';
    char c2 = '3';
    //char c3 = '4a' '^*&^*^*' 'aa' Can't multiple characters
    char c4 = ' '; //space is fine
    String c5 = ""; //String no space is fine
    // int t1 = 10 + 300L // Can't let 300L downgrade to int
    long t1 = 10 + 300L; // 10 int upgrade to Long is ok
    System.out.println(t1);

    

      }
  
}
