package week3.newClassExample;

public class person {
  private int age; //no need to set boolean 65+ because using same raw data

  private double salary; //brand new raw data

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public boolean isElderly() {
    return this.age >=65;
  }

  //if (person2.getAge() >= 65 && person.getXXX < 20 || person2) 沒人看得明  
}

