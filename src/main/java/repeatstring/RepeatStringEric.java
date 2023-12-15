package repeatstring;

/**
 * Repeats a String n times.
 */
public class RepeatStringEric {
  /**
   * Repeats a String s n times.
   * @param s the String you want to repeat
   * @param n how often you want to repeat the String,
   * @return the String repeated n times.
   */
  public static String repeat(String s, int n){
    String str = "";
    for (int i = 0; i < n; i++) {
      str += s;
    }
    return str;
  }

  /**
   * Repeats a String s n times and adds a string between the strings.
   * @param s1 The string you want to repeat
   * @param n how often you want to repeat the String.
   * @param s2 the String Seperator.
   * @return the String repeated n times.
   */
  public static String repeat(String s1, int n, String s2){
    String str = "";
    for (int i = 0; i < n; i++) {
      if(i % 2 == 1) str += s2;
      str += s1;
    }
    return str;
  }

  /**
   * the main method of the class.
   * @param args not used.
   */
  public static void main(String[] args){
    System.out.println(repeat("wau", 2));
    System.out.println(repeat("wau", 2, "--"));
  }
}
