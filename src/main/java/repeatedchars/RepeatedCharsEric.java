package repeatedchars;

/**
 * Repeats a String n times.
 */
public class RepeatedCharsEric {
  /**
   * Repeats a String s n times.
   * @param text the String you want to repeat
   * @return the String repeated n times.
   */
  public static String longestRepetition(String text){
    String currentLongestWord = "";
    String wordRecord = "";
    for (int i = 0; i < text.length(); i++) {
      String chari = String.valueOf(text.charAt(i));
      System.out.println("Now checking " + chari + " with i=" + i + "\n" + "Currentwordrecord: " + wordRecord + "\n\n");
      if(currentLongestWord.isEmpty()){
        currentLongestWord = chari;
      }
      else if(currentLongestWord.substring(currentLongestWord.length() - 1).equals(chari)){
        currentLongestWord += chari;
      }
      else{
        if(currentLongestWord.length() > wordRecord.length()){
          wordRecord = currentLongestWord;
        }
        currentLongestWord = chari;
      }
    }
    if(currentLongestWord.length() > wordRecord.length()){
      wordRecord = currentLongestWord;
    }
    return wordRecord;
  }

  /**
   * the main method of the class.
   * @param args not used.
   */
  public static void main(String[] args){
    System.out.println(longestRepetition("aaabbbbccccccaaaacccdddddddddd"));
  }
}
