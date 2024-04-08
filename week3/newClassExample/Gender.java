package week3.newClassExample;

public class Gender {

  private String genderName;

  private Gender(String genderName) {
    this.genderName = genderName;
  }

  public void setGenderName(String genderName) {
    this.genderName = genderName;
  }

  public String getGenderName() {
    return this.genderName;
  }

  public static void main(String[] args) {
    Gender FEMALE = new Gender("female");
    Gender MALE = new Gender("male");
    Gender BROCCOLI = new Gender("broccoli"); 
    System.out.println("Gender 1: " + MALE.getGenderName());
    System.out.println("Gender 2: " + FEMALE.getGenderName());
    System.out.println("Gender 3: " + BROCCOLI.getGenderName());
  }
}
