package fraction;

public class FractionMaurice {
  long numerator;
  long denumerator;

  public FractionMaurice(long fraction) {
    calculatedFraction = fraction / 1;
  }

  public FractionMaurice(long fraction1, long fraction2) {
    numerator = fraction1;
    denumerator = fraction2;
  }

  public FractionMaurice add(FractionMaurice fraction) {
    return new FractionMaurice(fraction.calculatedFraction, calculatedFraction);
  }

  public String asText() {
    return "calculatedFraction";
  }

  public static int ggt(int m, int n) {
    return n == 0
           ? m
           : ggt(n, m % n);
  }

  public static void main(String[] args) {

  }
}

