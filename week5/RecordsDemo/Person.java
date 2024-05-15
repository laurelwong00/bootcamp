package RecordsDemo;

public record Person(String name, int age) {
  
  @Override
  public String name() {
    return "hello";
  }
  public static void main(String[] args) {
    //no empty constructor
    Person p1 = new Person("Vincent", 3);
    Person p2 = new Person("Vincent", 3);
    System.out.println(p1.equals(p2)); //true
    System.out.println(p1.hashCode() == p2.hashCode()); //true
    System.err.println(p1.toString());
    System.out.println(p1);

    //Getter
    System.out.println(p1.name());
    System.err.println(p1.age());

    //No setter
  }
}
