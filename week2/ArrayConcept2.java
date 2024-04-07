package week2;

public class ArrayConcept2 {
  public static void main(String[] args) {

    String[] arr = new String[2];
    System.out.println(arr.hashCode());
    arr = new String[] {"cat", "dog"};
    String[] arr2 = arr;
    System.out.println(arr.hashCode());
    System.out.println(arr2.hashCode());
    String c = arr[0];
    String d = arr[1];
    System.out.println(arr[0].hashCode());
    System.out.println(c.hashCode());
    System.out.println("cat".hashCode());
    System.out.println(arr[1].hashCode());
    System.out.println(d.hashCode());
    System.out.println("dog".hashCode());

  }
}
