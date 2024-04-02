import java.util.ArrayList;

public class DemoForEqual {
  public static void main(String [] args) {
    int x = 0;
    float y = x; // implicit conversion (from int to float, widening)
    System.out.println(y);

    //float z = 0.0f;
    //int w = z; // implicit convsersion (from float to int, narrowing)

    float a = 0.0f;
    int b = (int) a; // explicit conversion (from float to int, narrowing) 
    System.out.println(b);
    System.out.println("--------------");

    long c = 101010101010L; //64 bit 拿頭32bit only when -> int
    int d = (int) c; // 32 bit
    System.out.println(d);

    long e = 10101010L;
    short f = (short) e;
    System.out.println(f);

    double g = 0.314566789;
    short h = (short) g;
    System.out.println(h);

    int i = 0; //primitive
    char j = 'A'; //primitive
    double k = 0.0;
    String l = "33"; //non-primitive

    // i = (int) j;
    // System.out.println(i);

    j++;
    j++;
    ++j;
    System.out.println(j);

    int m = 0;
    System.out.println(m++); // print m, m = m+1
    System.out.println(m); // print m 

    int n= 0;
    System.out.println(++n); // n = n+1, print n;
    System.out.println(m); // print m 

    int p = 0;
    int q = p++; // assign p to q, p = p + 1;

    int r = 0;
    for (int t = 0; t < 3; t+=2) { 
      int s = ++r; // r = r + 1, assign r to s;
      System.out.println("----------");
      System.out.println(s);
      System.out.println(r);

    }

    ArrayList<String> myList = new ArrayList<String>();
    int index = 0;
    myList.add(index, "Amy"); //0沒加, 加amy落0位
    myList.add(index++, "Bob"); //先放"bob"落0位, index 0 -> 1（amy會自動移左去1)
    myList.add(++index, "Cherry");//index 1-> 2; 加"cherry"落2位 
    myList.add(index++, "Dr.Chan");//加"Dr. Chan"落2位, index 2 -> 3 (cherry 移左去3)

    
    System.out.println(myList);
    System.out.println(index);
}

}
