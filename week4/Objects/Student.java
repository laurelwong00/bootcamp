package week4.Objects;

public class Student {
  


  @Override
  public boolean equals(Object obj) {
    if (this == obj){
      return true;
    } 
    if (!(obj instanceof Student)){
      return true;
    }
}
