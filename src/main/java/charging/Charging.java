package charging;

/**
 * This class calculates and prints the cost of electricity consumption.
 */
public class Charging {
  /**
   * The main method of the program.
   *
   * @param args not used
   */
  public static void main(String[] args) {
    // Cost per kilowatt-hour (kWh)
    int costPerkWh = 50;

    // Cost per minute
    int costPerMin = 30;

    // Calculate and print the cost for the first scenario
    System.out.println((costPerkWh * 50 + costPerMin * 60));

    // Calculate and print the cost for the second scenario
    System.out.println((costPerkWh * 70 + costPerMin * 90));

    // Calculate and print the cost for the third scenario
    System.out.println((costPerkWh * 55 + costPerMin * 70));

    // Calculate and print the total cost for all scenarios
    System.out.println(
            (costPerkWh * (50 + 70 + 55) + costPerMin * (60 + 90 + 70)));
  }
}
