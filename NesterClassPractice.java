import NesterClassPractice.School.StudentAssistant;

public class NesterClassPractice {
  // Outer class
class School {
  private String name;
  private static String name1;
  public static String name2;
  private int x = 3;
  private static int y = 5;
  protected int p = 3;
  private final boolean b = true;

  // Inner class representing a Student assistant
  class StudentAssistant {

    private static int z = 4;
    public static int i = 5;
    private int j = 6;
      public void welcomeMessage() {
          System.out.println("Welcome to " + name + "!" + x + y + name1 + name2 + p + b + z);
      } //all attributes都access到

      public void displaySchoolName() {
          System.out.println("School Name: " + name);
      }

      public static int getZ() {
        return z; //static method no need instance, just Class.getZ()
      }

      public int getJ() {
        return j; //need instance to .getJ()
      }

   } //end of studentAssistant-belonged class content

  //school methods
  public School(String name) {
      this.name = name;
  }

  public void enrollStudent(String studentId) {
      StudentAssistant assistant = new StudentAssistant();
      assistant.welcomeMessage();// Accessing private member 'name' of the outer class
      System.out.println(StudentAssistant.i);
  }

  // Private method of the outer class
  private void performAdminTasks() {
      System.out.println("Performing administrative tasks for " + name + p //
      + StudentAssistant.getZ() + StudentAssistant.i + );
  } // private method can't access without a getter

  // Public method to allow inner class access to private method
  public void studentAssistantPerformTasks() {
      StudentAssistant assistant = new StudentAssistant();
      assistant.displaySchoolName(); // Accessing private member 'name' of the outer class
      performAdminTasks(); // Accessing private method of the outer class
  }
}

public class Main {
  public static void main(String[] args) {
      School school = new School("XYZ School");

      // Create an instance of School.StudentAssistant using an instance of School
      School.StudentAssistant assistant = school.new StudentAssistant();
      //有school先有student assistant
      
      // Access methods of StudentAssistant
      assistant.welcomeMessage(); // Accessing private member 'name' of the outer class
      assistant.displaySchoolName(); // Accessing private member 'name' of the outer class
      
      // Accessing private method of the outer class using an instance of StudentAssistant
      school.studentAssistantPerformTasks();
      assistant.getJ();
      School.StudentAssistant.getZ();
      school.welcomeMesage(); 
      assistant.enrollStudent();
      assistant.performAdminTasks();
      assistant.welcomeMessage();
      
  }
}

}
