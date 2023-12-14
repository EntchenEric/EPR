package digit;

/**
 * Practice from the Task Digits.
 */
public class DigitsEric {
  /**
   * Calculates the product of the digits of n.
   * @param n The Number witch digits should be added together.
   * @return the product of the digits of the number n.
   */
  public static long productOfDigits(int n){
    return n < 9
            ?n
            :(n % 10) * productOfDigits(n / 10);
  }

  /**
   * Checks if the digit m is in the number m.
   * @param n the Number that the digit could be in.
   * @param m the Digit that should be in n.
   * @return rather the Digit is in the Number.
   */
  public static boolean contiansDigit(long n, int m){
    return n == 0
            ?n == m
            : n % 10 == m
              ? true
              : contiansDigit(n/10, m);
  }

  /**
   * Counts how often the Number m is contained in the Number n.
   * @param n the number that shall hold the digit m
   * @param m the Number that is may contain in n.
   * @return how often the digit m is contained in the number m.
   */
  public static int countDigit(long n, int m){
    return n == 0
            ? n == m
              ? 1
              : 0
            : n % 10 == m
              ? 1 + countDigit(n / 10, m)
              : countDigit(n / 10, m);
  }

  /**
   * The main Method of the Class.
   * @param args not used
   */
  public static void main(String[] args){
    System.out.println(productOfDigits(4));
    System.out.println(productOfDigits(0));
    System.out.println(productOfDigits(5201));
    System.out.println(productOfDigits(12345));

    System.out.println(contiansDigit(4711, 1));
    System.out.println(contiansDigit(4711, 2));
    System.out.println(contiansDigit(789, 9));
    System.out.println(contiansDigit(0, 0));

    System.out.println(countDigit(787, 7));

  }
}
