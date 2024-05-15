package week5.LambdaDemo;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
  public static void main(String[] args) {
    int age = 18;
    boolean isElderly = age > 65;

    Predicate<Integer> isElderly2 = age2 -> age2 > 65;
    isElderly2.test(3); // true
    isElderly2.test(66); //false

    BiPredicate<String, Integer> isCharacterS = (str, idx) -> str.charAt(idx) == 'S';

    BiPredicate<String,String> isUpperCase = (str1, str2) -> str1.toUpperCase() == str2;
    System.out.println(isUpperCase.test("hello", "HELLO"));

    BiPredicate<String, String> startsWith = (s1, s2) -> s1.startsWith(s2);
    System.out.println(startsWith.test("hello", "he")); //true

    BiPredicate<String, String> endsWith = (s1, s2) -> s1.endsWith(s2);
    System.out.println(startsWith.test("hello", "lo")); //true

    BiPredicate<String, String> combined = (s1, s2) -> s1.startsWith(and(endsWith(s2)));
    System.out.println(combined.test("lollo", "lo")); //true
    

    BiPredicate<String, String> combined2 = (s1, s2) -> startsWith.or(endsWith);
    System.out.println(combined.test("hello", "lo")); //true
    System.out.println(combined.test("hello", "he")); //true

    BiPredicate<String, Integer> isLengthLargerThan = (s1,length) -> s1.length()>length;
    System.out.println(isLengthLargerThan.test("hello", 4)); //true
  }
}
