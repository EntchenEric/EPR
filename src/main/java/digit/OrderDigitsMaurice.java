package digit;

/**
 * The OrderDigitsMaurice class provides methods for checking the ascending order of digits in a number
 * and inserting a digit into a number while maintaining descending order of digits.
 */
public class OrderDigitsMaurice {

  /**
   * Checks if the digits in the given number are in ascending order.
   *
   * @param number the number to be checked
   * @return {@code true} if digits are in ascending order, {@code false} otherwise
   */
  public static boolean isAscending(int number) {
    return (number == 0)
           ? true
           : (number % 10 > (number / 10) % 10) && isAscending(number / 10);
  }

  /**
   * Inserts a digit into a number while maintaining descending order of digits.
   *
   * @param number the number into which the digit is to be inserted; must have digits in descending order
   * @param digit  the digit to be inserted
   * @return the number after inserting the digit while maintaining descending order of digits
   */
  public static long insertOrdered(long number, int digit) {
    return (number == 0 || digit < number % 10)
           ? number * 10 + digit
           : insertOrdered(number / 10, digit) * 10 + (int) (number % 10);
  }

  /**
   * The main method contains test cases for the isAscending and insertOrdered methods.
   *
   * @param args command-line arguments (not used)
   */
  public static void main(String[] args) {
    System.out.println(isAscending(4));      // true
    System.out.println(isAscending(1234));   // true
    System.out.println(isAscending(1144478)); // false
    System.out.println(isAscending(1144435)); // false

    System.out.println(insertOrdered(4, 0));      // 40
    System.out.println(insertOrdered(4, 7));      // 74
    System.out.println(insertOrdered(0, 4));      // 40
    System.out.println(insertOrdered(0, 0));      // 0
    System.out.println(insertOrdered(54221, 3));  // 543221
    System.out.println(insertOrdered(66420, 6));  // 666420
  }
}
