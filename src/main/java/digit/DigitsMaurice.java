package digit;

/**
 * Class representing digit operations.
 */
public class DigitsMaurice {

  /**
   * Calculates the product of the digits of a given number.
   *
   * @param a The input number.
   * @return The product of the digits.
   */
  static long productOfDigits(int a) {
    return (a <= 10)
           ? a
           : (a % 10) * productOfDigits(a / 10);
  }

  /**
   * Checks if a digit is contained in the decimal representation of a number.
   *
   * @param number The input number.
   * @param digit  The digit to check for.
   * @return True if the digit is present, otherwise false.
   */
  static boolean containsDigit(long number, int digit) {
    return (number == 0)
           ? digit == 0
           : (number % 10 == digit) || containsDigit(number / 10, digit);
  }

  /**
   * Counts how often a digit appears in the decimal representation of a number.
   *
   * @param number The input number.
   * @param digit  The digit to count.
   * @return The count of the digit.
   */
  static int countDigit(long number, int digit) {
    return (number == 0)
           ? (digit == 0
              ? 1
              : 0)
           : ((number % 10 == digit)
              ? 1
              : 0) + countDigit(number / 10, digit);
  }

  /**
   * Main method to demonstrate the digit operations.
   *
   * @param args Command line arguments (not used in this example).
   */
  public static void main(String[] args) {
    // Product of Digits
    System.out.println(productOfDigits(4));      // Output: 4
    System.out.println(productOfDigits(0));      // Output: 0
    System.out.println(productOfDigits(5201));   // Output: 0
    System.out.println(productOfDigits(12345));  // Output: 120

    // Contains Digit
    System.out.println(containsDigit(4711, 1)); // true
    System.out.println(containsDigit(4711, 2)); // false
    System.out.println(containsDigit(789, 9));  // true
    System.out.println(containsDigit(0, 0));    // true

    // Count Digit
    System.out.println(countDigit(4711, 1)); // 2
    System.out.println(countDigit(4711, 2)); // 0
    System.out.println(countDigit(789, 9));  // 1
    System.out.println(countDigit(0, 0));    // 1
  }
}
