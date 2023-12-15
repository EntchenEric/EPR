package fraction;

public class FractionEric {
  long numerator;
  long denominator;

  public FractionEric(long numerator) {
    this.numerator = numerator;
    this.denominator = 1;
  }

  public FractionEric(long numerator, long denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

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

  public String asText() {
    shorten();
    return this.numerator + "/" + this.denominator;
  }

  public void shorten(){
    long ggT = ggT(this.numerator, this.denominator);
    this.numerator = this.numerator / ggT;
    this.denominator = this.denominator / ggT;
  }

  public static long ggT(long m, long n) {
    return n == 0
            ? m
            : ggT(n, m % n);
  }

  public static void main(String[] args){
    FractionEric fraction = new FractionEric(4, 1);
    FractionEric fraction2 = new FractionEric(8, 2);
    System.out.println(fraction.asText());
    System.out.println(fraction2.asText());

    FractionEric fraction3 = fraction.add(fraction2);
    System.out.println(fraction3.asText());
  }
}

