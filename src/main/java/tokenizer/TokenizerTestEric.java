package tokenizer;

/**
 * An object of this class breaks a string into tokens.
 */
public class TokenizerTestEric {
  /**
   * the main method of the class.
   * @param args not used.
   */
  public static void main(String[] args){
    //operation 1
    TokenizerEric tokenizer = new TokenizerEric("--xx+-yy--abc--", "+-");

    //operation 2
    System.out.println(tokenizer.hasToken());

    //operation 3
    System.out.println(tokenizer.hasToken());

    //operation 4
    System.out.println(tokenizer.nextToken());

    //operation 5
    System.out.println(tokenizer.hasToken());

    //operation 6
    System.out.println(tokenizer.hasToken());

    //operation 7
    System.out.println(tokenizer.nextToken());

    //operation 8
    System.out.println(tokenizer.nextToken());

    //operation 9
    System.out.println(tokenizer.hasToken());

    //operation 10
    System.out.println(tokenizer.hasToken());

    //operation 11
    System.out.println(tokenizer.nextToken());
  }
}
