package week4;

/*
 * Question : 
 * given a string s of even length. 
 * Split this string into two halves of equal lengths, 
 * and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').
Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. 
Otherwise, return false.
 */

//hints : substring() , toCharArray() ?
public class JavaQuest23 {
  public static boolean sameNumberOfVowels(String s) {
    String a1 = s.substring(0,s.length()/2);
    String b1 = s.substring(s.length()/2, s.length());

    int a1Count = countVowels(a1);
    int b1Count = countVowels(b1);
    return a1Count==b1Count;

  }

  public static int countVowels(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if ("aeiouAEIOU".contains(s.substring(i,i+1))) {
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    String s1 = "aeiouuoiea";
    System.out.println(sameNumberOfVowels(s1));
  }
}