package squareroot;

/**
 * Checks if a number is the Square root of another number.
 */
public class SquareRootEric {
  /**
   * Checks if a Number is the square root of another number.
   * @param n the Number that may is the square root.
   * @param m the Number that shall be checked.
   * @return rather n is the square root of m.
   */
  public static boolean isSquareRoot(int n, long m){
    return ((long) n * n == m) && n > 0;
  }

  /**
   * the main method of the code.
   * @param args not used.
   */
  public static void main(String args[]){
    System.out.println(isSquareRoot(2, 4));
    System.out.println(isSquareRoot(2, 5));
    System.out.println(isSquareRoot(3, 9));
    System.out.println(isSquareRoot(9, 81));
    System.out.println(isSquareRoot(-5, 25));
  }
}
