package tokenizer;

import java.util.Currency;

/**
 * An object of this class breaks a string into tokens.
 */
public class TokenizerEric {
  String currentWord;
  String splitter;
  int lastWordPosition = 0;

  /**
   * Constructs a tokenizer for the specified text and the specified delimiters.
   *
   * @param word       text which is broken into tokens
   * @param splitter delimiters that specify where the tokens end
   */
  public TokenizerEric(String word, String splitter){
    this.currentWord = word;
    this.splitter = splitter;
  }

  /**
   * Skips all delimiters starting from the current position. This means:
   * <ul>
   * <li>If the character to
   * which the current position points is not a delimiter the current position remains unchanged.</li>
   * <li>If the character is a delimiter, the current position is moved to the first position that is no delimiter.</li>
   * <li>If all characters from the current position are delimiters, the new current position will be one
   * index behind the largest valid position in the text.</li>
   * </ul>
   */
  public boolean hasToken(){
    String savedWord = currentWord;
    if(nextToken() != null){
      currentWord = savedWord;
      return true;
    } else{
      currentWord = savedWord;
      return false;
    }
  }

  /**
   * Returns whether the tokenizer has any more tokens to deliver.
   *
   * @return {@code true} if there is at least one more token to deliver
   */
  public boolean nextCharIsSplitter(){
    for (int i = 0; i < splitter.length(); i++) {
      if(currentWord.length() <= 1){
        return false;
      }
      String splitterToCheck = splitter.substring(i, i+1);
      if(currentWord.substring(0, 1).equals(splitterToCheck)){
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the next token from the text.
   *
   * @return the next token from the text or {@code null} if there are no more tokens
   */
  public String nextToken() {

    while (nextCharIsSplitter()){
      currentWord = currentWord.substring(1);
    }
    String savedWord = currentWord;

    while (!nextCharIsSplitter()){
      if(currentWord.length() == 0){
        for (int i = 0; i < splitter.length(); i++) {
          if(splitter.substring(i, i+1).equals(currentWord)){
            return null;
          }
        }
        if(currentWord.isEmpty()){
          return null;
        }
        return currentWord;
      }
      currentWord = currentWord.substring(1);
    }

    String remaining = currentWord;

    currentWord = savedWord;

    String nextToken = currentWord.substring(0, currentWord.indexOf(remaining));

    currentWord = remaining;

    if(nextToken.isEmpty()){
      return null;
    }

    return nextToken;
  }

  /**
   * the main method of the class.
   * @param args not used.
   */
  public static void main(String[] args){
    TokenizerEric tokenizer = new TokenizerEric("-xx--x-", "-");
    System.out.println(tokenizer.nextToken());
    System.out.println(tokenizer.nextToken());
    System.out.println(tokenizer.nextToken());
  }
}
