package percentage;

import org.w3c.dom.ls.LSOutput;

public class PercentageIncreaseFinn {

    public static double increase(double amount, int percentage, int decimalPlaces) {
      // Berechnung des erhöhten Betrags
      double result = amount * (1 + percentage / 100.0);

      // Rundung auf n Nachkommastellen ohne Math.round
      double factor = Math.pow(10, decimalPlaces);
      result = result * factor;
      result = (int) result;
      result = result / factor;

      return result;
    }

   
    public static void main(String[] args) {
      System.out.println(increase(1024.0, 13, 1));
    }
  }

