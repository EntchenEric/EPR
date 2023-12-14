package fraction;

public class FractionTestMaurice {
  public static void main(String[] args) {
    //Schriit 1
    FractionMaurice fraction = new FractionMaurice(8, 2);

    //Schritt 2
    System.out.println(fraction.asText());

    //SChritt 3
    FractionMaurice fraction2 = new FractionMaurice(5, 6);

    //Schritt 4
    System.out.println(fraction2.asText());

    //Schritt 5
    fraction.add(fraction2);
    System.out.println(fraction2.add(fraction).asText());

    //Schritt 6
    FractionMaurice fraction3 = new FractionMaurice(17, 4);
    System.out.println(fraction3.add(new FractionMaurice(7/4)).asText());

    //USchrtit 7
    FractionMaurice fraction4 = new FractionMaurice(100002, 4);
    System.out.println(fraction4.add(new FractionMaurice(5)).asText());

    //Schritt 8
    FractionMaurice fraction5 = new FractionMaurice(11, 2108303);
    System.out.println(fraction5.add(new FractionMaurice(31, 2117009))
        .add(new FractionMaurice(47, 2134421))
        .asText());

    //Schriit 9
    FractionMaurice fraction6 = new FractionMaurice(3, 3037000510L);
    System.out.println(fraction6.add(new FractionMaurice(7, 3037000500L))
        .asText());

    //Schriit 10
    FractionMaurice fraction7 = new FractionMaurice(10957693037L, 10967535067L);
    System.out.println(fraction7.add(new FractionMaurice(10961461793L, 10967639796L))
        .asText());
  }
}
