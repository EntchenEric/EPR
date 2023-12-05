package digit;

/**
 * The OrderDigitsMaurice class provides methods for checking the ascending order of digits in a number
 * and inserting a digit into a number while maintaining descending order of digits.
 */
public class DistinctDigitsMaurice {

  public static int countDistinctDigits(int number) {
    return (number < 10)
           ? 1
           : 1 + countDistinctDigits(number / 10);
  }

  public static void main(String[] args) {
    System.out.println(countDistinctDigits(10));
  }
}
