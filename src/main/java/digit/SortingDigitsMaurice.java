package digit;

public class SortingDigitsMaurice {

  /**
   * Returns a power of ten that can be used to divide the argument in half by applying the divide
   * or remainder operation.
   *
   * @param z the number for which the power of ten is determined
   * @return power of ten {@code p}, so that {@code z / p} and {@code z % p} return the two halves
   * of {@code z}
   */
  private static long splitter(long z) {

    return 0;  // hier muss nat�rlich etwas Anderes stehen
  }

  /**
   * Dokumentation selbst schreiben
   */
  public static long merge(long a, long b) {

    return 0;  // hier muss nat�rlich etwas Anderes stehen
  }

  /**
   * Dokumentation selbst schreiben
   */
  public static long sort(long z) {

    long splitter = splitter(z);

    return 0;  // hier muss nat�rlich etwas Anderes stehen
  }

  /**
   * Prints values of some expressions containing calls to the methods of this class to the screen.
   *
   * @param args not used
   */
  public static void main(String[] args) {

    /* Ihre Testaufrufe, wie z.B. ... */
    System.out.println(sort(1)); //1
    System.out.println(sort(5001)); //15
    System.out.println(sort(13542)); //12345
    System.out.println(sort(504030209)); //23459


    System.out.println(merge(1, 2)); //12
    System.out.println(merge(11569, 2278)); //112256789
    System.out.println(merge(5, 11234678)); //112345678




  }
}
