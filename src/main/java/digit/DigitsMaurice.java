package digit;
public class DigitsMaurice {
  static long productOfDigits(int number) {
    // Initialisiere das Produkt mit 1
    int product = 1;

    // Extrahiere jede Ziffer und multipliziere sie mit dem Produkt
    while (number != 0) {
      int digit = number % 10;

      // Falls die Ziffer nicht null ist, multipliziere sie mit dem Produkt
      if (digit != 0) {
        product *= digit;
      }

      // Teile die Zahl durch 10, um die nächste Ziffer zu erhalten
      number /= 10;
    }

    return product;
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
