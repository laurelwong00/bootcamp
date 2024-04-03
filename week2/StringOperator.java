package week2;

public class StringOperator {
  public static void main(String[] args) {
    String s = "hello";
    String s2 = ""; //empty, blank
    String s3 = " "; //not empty, blank
    String s4 = "    "; 

    //isblank isEmpty 都是loop, loop到最后先知道系咪blank
    boolean isEmptyResult = s3.isEmpty(); //true
    System.out.println(isEmptyResult);
    
    System.out.println(s3.isBlank());//true
    System.out.println(s4.isEmpty()); //false
    System.out.println(s4.isBlank());//true
    
    // substring()
    String result = s.substring(0,3); //hel (0 to 3-1=2 only, extend to index - 1)
    System.out.println(result);

    result = s.substring(2);
    System.out.println(result); //starts from index 2 and continue

    //lowercase
    System.out.println("YELLOW".toLowerCase()); //yellow
    System.out.println("yellow".toUpperCase()); //YELLOW

    //contains
    System.out.println(s.contains("ll")); // true

    //startsWith()
    System.out.println(s.startsWith("he")); //true
    //endsWith()
    System.out.println(s.endsWith("lo")); //true

    //replace()
    String after = s.replace("l", "z"); //replace "l" with "z"
    System.out.println(after); //hezzo
    //trim() //remove the string
    String s5 = "   hello!world   "; //remove 頭尾既space only
    System.out.println(s5.trim());

    //indexOf()
    char c = s.charAt(2); //c is l //String s = "hello"
    System.out.println(s.indexOf('l')); //the index of the first matching character //2
    System.out.println(s.indexOf("!")); //-1 
    System.out.println(s.lastIndexOf('l')); //3

    System.out.println(s.indexOf("ll")); //2 
    System.out.println(s.lastIndexOf('l')); //2

    //ignore upper lower case
    System.out.println("hello".equals("HELLO"));//false
    System.out.println("hello".equalsIgnoreCase("HELLO"));//true
    System.out.println("hello".equals("HELLO "));//false



  };
}
