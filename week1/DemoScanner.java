public class DemoScanner {
  public static void main(String[] args) {

    int age = 18;
    String lastName = "Lau";

//if the left condition pass, the right one will be skipped
    if (age == 18 || "Lau".equals(lastName)) {
      System.out.println("Man!");
    }
    if (age == 18 || "Lau".equals(lastName) && x ==3) {

    }
    if ((age == 18 || "Lau".equals(lastName)) && x == 3) {

    }//And
    System.out.println(true && false); {//false

    }
    System.out.println(true && true); {//true

    }
    System.out.println(false && true); {//false

    }
    System.out.println(false && false); {//false (first satisfied next will skip)

    }

    // Or 
    System.out.println(true || false) {//true

    }
    System.out.println(true || true) {//true

    }
    System.out.println(false || true) {//true

    }
    System.out.println(false || false) {//false

    }
  }
}