package repeatstring;

public class RepeatStringEric {
  public static String repeat(String s, int n){
    String str = "";
    for (int i = 0; i < n; i++) {
      str += s;
    }
    return str;
  }

  public static String repeat(String s1, int n, String s2){
    String str = "";
    for (int i = 0; i < n; i++) {
      if(i % 2 == 1) str += s2;
      str += s1;
    }
    return str;
  }

  public static void main(String[] args){
    System.out.println(repeat("wau", 2));
    System.out.println(repeat("wau", 2, "--"));
  }
}
