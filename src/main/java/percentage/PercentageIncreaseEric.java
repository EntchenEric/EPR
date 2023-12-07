package percentage;

/**
 * Increases a Number based on a percentage increase and rounds it to n decimal places
 */
public class PercentageIncreaseEric {
    /**
     * Increases a Number based on a percentage increase and rounds it to n decimal places
     * @param base
     * the number that shuld be increased
     * @param percentage
     * The Percentage the numebr shuld be increased with
     * @param decimalPlaces
     * the decimal places that the number shuld be rounded to
     * @return
     * The increased number
     */
    public static double increase(double base, int percentage, int decimalPlaces){
        double result = base * (double) ( 1 + ((double) percentage / 100));
        result = (int) (result * (Math.pow(10, decimalPlaces)) + 0.5);
        result = result / (Math.pow(10, decimalPlaces));
        return result;
    }
    public static void main(String[] args) {
    System.out.println(increase(17.9515, 33, 4));
    }
}
