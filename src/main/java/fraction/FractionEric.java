package fraction;

public class FractionEric {
  long numerator;
  long denumerator;

  public FractionEric(long numerator) {
    this.numerator = numerator;
    this.denumerator = 1;
  }

  public FractionEric(long numerator, long denumerator) {
    this.numerator = numerator;
    this.denumerator = denumerator;
  }

  public FractionEric add(FractionEric fraction) {
    long numerator = this.numerator * fraction.denumerator;
    numerator += fraction.numerator * this.denumerator;
    long denumerator = this.denumerator * fraction.denumerator;
    return new FractionEric(numerator, denumerator);
  }

  public String asText() {
    long ggT = ggT(this.numerator, this.denumerator);
    this.numerator = this.numerator / ggT;
    this.denumerator = this.denumerator / ggT;
    return this.numerator + "/" + this.denumerator;
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

