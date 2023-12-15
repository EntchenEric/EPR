package digit;

/**
 * Checks if digits of a Number are in decending order.
 */
public class DescendingDigitsEric {
  /**
   * checks rather the digits of a number are in descending order.
   * @param n the number you want to check
   * @return rather the digits are in descending order.
   */
  public static boolean isDescending(int n){
    String nAsString = String.valueOf(n);
    int lastDigit = 10;
    for (int i = 0; i < nAsString.length(); i++) {
      String chari = String.valueOf(nAsString.charAt(i));
      int digit = Integer.parseInt(chari);
      if(digit >= lastDigit){
        return false;
      }
      lastDigit = digit;
    }
    return true;
  }

  /**
   * the main Method of the class.
   * @param args Not used.
   */
  public static void main(String[] args){
    System.out.println(isDescending(12345));
    System.out.println(isDescending(123456789));
    System.out.println(isDescending(1234567898));
    System.out.println(isDescending(987654321));

  }
}
