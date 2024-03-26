public class Operator {
  public static void main(String[] arg) {
    // increment
    int x = 1;
    x = x + 1; //1+1=2
    x = x + 1; //2+1=3
    x++;// 3+1 = 4
    x++;// 4+1 = 5
    x += 1; //self + 1
    //int a = 4;
// int b = ++a; // Now, a = 4, b = 4
// int b = a++; // Now, a = 4, b = 4

    int a = 3 // 3
    int b = ++3 // 4
    int c = 3++ // 4
    int d = ++ a 

    int e = 10;
    e--; 
    --e;
    e = e - 1;
    e -= 1;

    int predecrement = --e
    System.out.println(x);

    //int x = 8;
    //int y = --x + x--;
    // x become 6 because 8-1-1
    // y become (8-1) + (8-1) because x-- 跟前面--x value     
  }
  
}
