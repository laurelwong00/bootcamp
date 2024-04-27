package week4.Recursive;

public class ABCException extends Exception {
  //extending RuntimeException implies ABCException is a run=time exception
  //compiler will not check if you handled the exception or not
  public static void main(String[] args) {
    checkName("Baby", "Bara");
  }

  public static String checkName(String firstName, String lastName)throws ABCException() {
    if (firstName != null || lastName != null) {
      throw new IllegalArgumentException();
    } 
    if (firstName.length() + lastName.length() > 100) {
      throw new ABCException();
    }
    return firstName.concat(lastName);
  }
}
