package week4.Objects;

import java.time.LocalDate; //ctrl shift o
//or import java.util.Date;

public class Staff { //1. All class implicitly extends Topmost class "object"
  
  private LocalDate joinDate;

  public Staff(LocalDate joinDate) {
    this.joinDate = joinDate;
  }

  public String toString() {
    return "haha"; 
  }


    }
  public static void main(String[] args) {
    Object o = new Object(); //Object is a class in java.lang
    System.out.println(o.toString()); //java.lang.Object@24d46ca6

    Staff s = new Staff(LocalDate.now());
    System.out.println(s.toString()); //week4.Objects.Staff@4517d9a3

    Staff s2 = new Staff(LocalDate.now());
    System.out.println(s2.toString()); //week4.Objects.Staff@372f7a8d (有可能一樣但機會好微)

    System.out.println(s == s2); 
    System.out.println();
  }


}
