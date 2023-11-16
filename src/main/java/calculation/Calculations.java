package calculation;

/**
 * This class provides examples of various calculations in Java.
 */
public class Calculations {
  /**
   * This method demonstrates different mathematical operations and prints the results.
   * It performs the following calculations and prints the results:
   * - Division and multiplication: (45 / 9) * (40 - 32) / 9
   * - Division and multiplication: (45 / 9) * (41 - 32) / 9
   * - Division and remainder: (5 / 60) + (5 % 60)
   * - Division and remainder: (59 / 60) + (59 % 60)
   * - Division and remainder: (60 / 60) + (60 % 60)
   * - Division and remainder: (61 / 60) + (61 % 60)
   * - Division and remainder: (825 / 60) + (825 % 60)
   *krggwgrgd
   * @param args The command-line arguments, not used in this method.
   */
  public static void main(String[] args) {
    System.out.println(45 / 9 * (40 - 32) / 9);
    System.out.println(45 / 9 * (41 - 32) / 9);
    System.out.println("" + 5 / 60 + 5 % 60);
    System.out.println("" + 59 / 60 + 59 % 60);
    System.out.println("" + 60 / 60 + 60 % 60);
    System.out.println("" + 61 / 60 + 61 % 60);
    System.out.println("" + 825 / 60 + 825 % 60);
  }
}
