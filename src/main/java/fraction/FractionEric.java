package fraction;

public class FractionEric {
  long numerator;
  long denominator;

  /**
   * Creates a new Fraction with the given numerator and denominator.
   * @param numerator The numerator of the new Fraction.
   */
  public FractionEric(long numerator) {
    this.numerator = numerator;
    this.denominator = 1;
  }

  /**
   * Creates a new Fraction with the given numerator and denominator.
   * @param numerator The numerator of the new Fraction.
   * @param denominator The denominator of the new Fraction.
   */
  public FractionEric(long numerator, long denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  /**
   * Adds the given Fraction to this Fraction and returns the result as a new Fraction.
   * @param fraction The Fraction to add to this Fraction.
   * @return The result of the addition.
   */
  public FractionEric add(FractionEric fraction) {
    shorten();
    fraction.shorten();
    long numerator = this.numerator * fraction.denominator;
    numerator += fraction.numerator * this.denominator;
    long denumerator = this.denominator * fraction.denominator;
    FractionEric newFraction = new FractionEric(numerator, denumerator);
    newFraction.shorten();
    return newFraction;
  }

  /**
   * Returns the textual representation of this Fraction.
   * @return The textual representation of this Fraction.
   */
  public String asText() {
    shorten();
    return this.numerator + "/" + this.denominator;
  }

  /**
   * Shortens the Fraction.
   */
  public void shorten(){
    long ggT = ggT(this.numerator, this.denominator);
    this.numerator = this.numerator / ggT;
    this.denominator = this.denominator / ggT;
  }

  /**
   * Calculates the greatest common divisor of the given numbers.
   * @param m The first number.
   * @param n The second number.
   * @return The greatest common divisor of the given numbers.
   */
  public static long ggT(long m, long n) {
    return n == 0
            ? m
            : ggT(n, m % n);
  }

  /**
   * Main method. Only used for debugging purposes.
   * @param args Command line arguments.
   */
  public static void main(String[] args){
    FractionEric fraction = new FractionEric(4, 1);
    FractionEric fraction2 = new FractionEric(8, 2);
    System.out.println(fraction.asText());
    System.out.println(fraction2.asText());

    FractionEric fraction3 = fraction.add(fraction2);
    System.out.println(fraction3.asText());
  }
}

