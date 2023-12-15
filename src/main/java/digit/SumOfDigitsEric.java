package digit;

/**
 * calculates the sum of digits.
 */
public class SumOfDigitsEric {
  /**
   * Calculates the sum of the Digits of the number n.
   * @param n The number you want to calculate the sum of the digits from.
   * @return the sum of digits.
   */
  public static int sumOfDigits(long n){
    int sum = 0;
    String nAsString = String.valueOf(n);
    for (int i = 0; i < nAsString.length(); i++) {
      String chari = String.valueOf(nAsString.charAt(i));
      int digit = Integer.parseInt(chari);
      sum += digit;
    }

    return sum;
  }

  /**
   * the main method of the class.
   * @param args not used.
   */
  public static void main(String[] args){
    System.out.println(sumOfDigits(11111111111111L));
  }
}
