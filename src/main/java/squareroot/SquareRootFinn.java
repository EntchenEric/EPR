package squareroot;

public class SquareRootFinn {

  public static boolean isSquareRoot(int base, long radical) {

    return ((long) base * base == radical) && (base >= 0);
  }


  public static void main(String[] args) {

    System.out.println(isSquareRoot(5, 25));
    System.out.println(isSquareRoot(-5,25));
  }


}
