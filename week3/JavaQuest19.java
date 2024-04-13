package week3;

import java.util.HashMap;
import java.util.Map;

/**
 * Expected Output:
 * Car Year=2020, Car Model=ModelY
 */
public class JavaQuest19 {
  private int carYear;
  private String carModel;
  // Constructor with variables carYear and carModel
  public JavaQuest19(int carYear, String carModel) {
    this.carYear = carYear;
    this.carModel = carModel;
  }

  public String toString() {
    return "Car Year=" + this.carYear + ", Car Model=" + this.carModel;
  }

  public static void main(String[] args) {
    JavaQuest19 myCar = new JavaQuest19(2020, "ModelY");
    System.out.println(myCar.toString());
    System.out.println(myCar); //Java will help you to convert to String using toString() when you print
    
  }
}
