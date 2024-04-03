package week2;

public class WrapperClass {
  public static void main(String[] args) {
    int x = 1; //+ - * / %
    Integer x2 = 1; //Integer wrapper class String.class -> String.object
    Integer x3 = new Integer("1");
    Short x4 = new Short("1");
    Boolean x5 = new Boolean("true");
    Long x6 = new Long ("10");
    Double x7 = new Double("0.3");
    Float x8 = new Float(0.3);
    Character x9 = new Character('3');
    Byte x10 = new Byte("3");

    if (x2.equals(1)) {
      System.out.println("x2 = 1");
    }
    if (x2 == 1) {
      System.out.println("x2 = 1");
    }

    x2 = 128;
    if (x2 == 128) {
      System.out.println("x2=128");
    }

    Integer num1 = Integer.valueOf(127); //valueOf() -> "new" an Integer object;
    Integer num2 = Integer.valueOf(127);
    System.out.println(num1 == num2); //true

    Integer num3 = Integer.valueOf(128); 
    Integer num4 = Integer.valueOf(128); 
    System.out.println(num3 == num4); //false? // java認爲-128 to 127 係常用integer 
    System.out.println(num3.equals(num4)); //true
    //equals() is checking if they are with same value
    //== is checking if they are same object (same address)
    //same object must be same value, but same value 未必 same object

    String str = "hello";
    String str2 = "hello"; 
    String str3 = new String ("hello"); 
    String str4 = String.valueOf("hello");
    System.out.println(str == str2);//true //if java found string value same, won't open one for u
    System.out.println(str == str3);//false 因爲你强行開個新different Object
    //equals all true
    System.out.println(str == str4);//true String.valueOf same mechanism with string str = "x"

    Double d2 = 1.0;
    Double d3 = 1.0; // == is false, two objects
    System.out.println(d2.equals(d3)); //true


    System.out.println(d2.compareTo(d3)); //0

    Integer i3 = 10;
    long l4 = i3; // Integer -> int (unbox) -> long (upcast)
    //short s4 = i3; //Integer -> int (unbox) -> short (un-secure)

    int i5 = 12;
    //Long l5 = i5 //can't
    Long l5 = (long) i5; //int -> long (upcast) -> Long (autobox)

    Character char3 = Character.valueOf('a');
  }
}
