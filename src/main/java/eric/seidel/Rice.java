package eric.seidel;

/**
 * The Rice class calculates the number of rice grains on a chessboard where the number
 * of grains on each square is increased by a certain percentage.
 */
public class Rice {
  /**
   * The main method of the Rice class.
   * It calculates and prints the number of rice grains on each square of a chessboard.
   *
   * @param args not used
   */
  public static void main(String[] args) {
    // Declare and initialize variables for the initial rice count and percentage increase
    int riceOnFirstField = 1;
    int percentageIncrease = 100;
    int totalRice = 0;

    // Output the number of rice grains on the first square
    System.out.println(riceOnFirstField);

    // Calculate and output the number of rice grains on the remaining squares
    int riceOnCurrentField = riceOnFirstField;


    riceOnCurrentField += (riceOnCurrentField * percentageIncrease) / 100;
    System.out.println(riceOnCurrentField);
    totalRice += riceOnCurrentField;
    riceOnCurrentField += (riceOnCurrentField * percentageIncrease) / 100;
    System.out.println(riceOnCurrentField);
    totalRice += riceOnCurrentField;
    riceOnCurrentField += (riceOnCurrentField * percentageIncrease) / 100;
    System.out.println(riceOnCurrentField);
    totalRice += riceOnCurrentField;
    riceOnCurrentField += (riceOnCurrentField * percentageIncrease) / 100;
    System.out.println(riceOnCurrentField);
    totalRice += riceOnCurrentField;
    riceOnCurrentField += (riceOnCurrentField * percentageIncrease) / 100;
    System.out.println(riceOnCurrentField);
    totalRice += riceOnCurrentField;
    riceOnCurrentField += (riceOnCurrentField * percentageIncrease) / 100;
    System.out.println(riceOnCurrentField);
    totalRice += riceOnCurrentField;
    riceOnCurrentField += (riceOnCurrentField * percentageIncrease) / 100;
    System.out.println(riceOnCurrentField);
    totalRice += riceOnCurrentField;


    // Calculate and output the total number of rice grains on all squares
    totalRice += riceOnFirstField;
    System.out.println(totalRice);
  }
}
