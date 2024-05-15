package week5.LambdaDemo;
import java.util.function.Function;

@FunctionalInterface
public interface Trifunction {
  String apply (String a, String b, String c);
}

  public static void main(String[] args) {
      Trifunction R = (a, b, c) -> a.toUpperCase().replace(b, c){
      System.out.println(result); 
      };
      R.apply("hello", "ll", "PP");
  }

