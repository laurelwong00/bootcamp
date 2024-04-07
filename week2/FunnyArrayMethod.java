package week2;

public class FunnyArrayMethod {
  public static String [] trimSpace1(String[] ss) { //pass by reference
      for (int i = 0; i < ss.length; i++) 
        if (ss[i].contains(" ")) { //actually no need this if 
          ss[i] = ss[i].replace(" ", "");
      }
      return ss;
    } 
  }
