public class Demoforloopmk2 {
  public static void main(String [] args) {
    String str = "heelocapy" ;
    int duplicateCount = 0;
    String haveDuplicate = "N";

    for (int i = 0; i < str.length()-1; i++) {
      if (str.charAt(i) == str.charAt(i+1)) {
        System.out.println(str.charAt(i));
        duplicateCount++; // count += 1
        haveDuplicate = "Yes";
      }
    } 
    
    if (duplicateCount == 0 || haveDuplicate == "N") {
      System.out.println("none");
    }
  }
}
