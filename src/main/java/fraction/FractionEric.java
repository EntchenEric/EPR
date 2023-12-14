package fraction;

public class FractionEric {
    long calculatedFraction;
    public FractionEric (long fraction) {
        calculatedFraction = fraction / 1;
    }

    public FractionEric (long fraction1, long fraction2) {
        calculatedFraction = fraction1 / fraction2;
    }

    public FractionEric add(FractionEric fraction){
        return new FractionEric(fraction.calculatedFraction, calculatedFraction);
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

