package fraction;

public class FractionMaurice {
  long calculatedFraction;
  public FractionMaurice (long fraction) {
    calculatedFraction = fraction / 1;
  }

  public FractionMaurice (long fraction1, long fraction2) {
    calculatedFraction = fraction1 / fraction2;
  }

  public FractionMaurice add(FractionMaurice fraction){
    return new FractionMaurice(fraction.calculatedFraction, calculatedFraction);
  }

  public String asText(){
    return "calculatedFraction";
  }
  public static int ggT(int m, int n){
    return n == 0
            ? m
            : ggT(n, m%n);
  }
}

