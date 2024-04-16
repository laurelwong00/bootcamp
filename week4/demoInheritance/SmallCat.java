package week4.demoInheritance;

public class SmallCat extends Cat{
  
  private double weight;

  public SmallCat(int age, String name, double weight) {
    super(age, name);
    this.weight = weight;
  }

  public double getWeight() {
    return this.weight;
  }

  public static void main(String[] args) {
    SmallCat sc = new SmallCat(3, "Merry", 5.5); //calling super() --> empty cat constructor()

    System.out.println(sc.getAge());
    System.out.println(sc.getAnimalName());
    System.out.println(sc.getCatName());
    System.out.println(sc.getWeight());
  }
}
