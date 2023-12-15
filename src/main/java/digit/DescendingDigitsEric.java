package digit;

public class DescendingDigitsEric {
  public static boolean isDescending(int n){
    String nAsString = String.valueOf(n);
    int lastDigit = 0;
    for (int i = 0; i < nAsString.length(); i++) {
      String chari = String.valueOf(nAsString.charAt(i));
      int digit = Integer.parseInt(chari);
      if(digit < lastDigit){
        return false;
      }
      lastDigit = digit;
    }
    return true;
  }

  public static void main(String[] args){
    System.out.println(isDescending(12345));
    System.out.println(isDescending(123456789));
    System.out.println(isDescending(1234567898));

  }
}
