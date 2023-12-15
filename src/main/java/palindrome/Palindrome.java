package palindrome;

public class Palindrome {
  /**
   * Checks if a String is a palindrome.
   * @param text the Text you want to check.
   * @return rather the Text is a palindrome.
   */
  public static boolean isPalindrome(String text){
    int textLength = text.length();
    for (int i = 0; i < textLength; i++) {
      if(text.charAt(i) != text.charAt(textLength - (i + 1))){
        return false;
      }
    }
    return true;
  }

  /**
   * the main method of the class.
   * @param args Not used.
   */
  public static void main(String[] args){
    System.out.println(isPalindrome("Anna"));
    System.out.println(isPalindrome("anna"));
    System.out.println(isPalindrome("787"));
    System.out.println(isPalindrome("reger"));
    System.out.println(isPalindrome("0123456789-9876543210"));
    System.out.println(isPalindrome("0123456789-98765432100"));
    System.out.println(isPalindrome("0123456789-8876543210"));
    System.out.println(isPalindrome("01234567899876543210"));
  }
}
