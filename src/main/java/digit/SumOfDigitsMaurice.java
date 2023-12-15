package digit;

public class SumOfDigitsMaurice {
    public static int sumOfDigits(int number) {
        return (number == 0) ? 0 : (number % 10 + sumOfDigits(number / 10));
    }

    public static void main(String[] args) {
        int result = SumOfDigitsMaurice.sumOfDigits(25);
        System.out.println(result);
    }

}
