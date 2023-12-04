package digit;

public class DigitsMaurice {
  static long productOfDigits(int a) {
    return (a <= 10)
           ? a
           : productOfDigits(a / 10) + (a % 10);

  }
//
//  static boolean containsDigit(long, int) {
//    return false;
//  }

//  static int countDigit(long, int) {
//    return 0;
//  }

  public static void main(String[] args) {
    System.out.println(productOfDigits(4));      // Ausgabe: 4
   System.out.println(productOfDigits(0));      // Ausgabe: 0
  System.out.println(productOfDigits(5201));   // Ausgabe: 0
   System.out.println(productOfDigits(12345));  // Ausgabe: 120
  }
}
