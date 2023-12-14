package fraction;

public class FractionTestEric {
  public static void main(String[] args) {
    //Schriit 1
    FractionEric fraction = new FractionEric(8, 2);

    //Schritt 2
    System.out.println(fraction.asText());

    //SChritt 3
    FractionEric fraction2 = new FractionEric(5, 6);

    //Schritt 4
    System.out.println(fraction2.asText());

    //Schritt 5
    fraction.add(fraction2);
    System.out.println(fraction2.add(fraction).asText());

    //Schritt 6
    FractionEric fraction3 = new FractionEric(17, 4);
    System.out.println(fraction3.add(new FractionEric(7/4)).asText());

    //USchrtit 7
    FractionEric fraction4 = new FractionEric(100002, 4);
    System.out.println(fraction4.add(new FractionEric(5)).asText());

    //Schritt 8
    FractionEric fraction5 = new FractionEric(11, 2108303);
    System.out.println(fraction5.add(new FractionEric(31, 2117009))
            .add(new FractionEric(47, 2134421))
            .asText());

    //SChriit 9
    FractionEric fraction6 = new FractionEric(3, 3037000510L);
    System.out.println(fraction6.add(new FractionEric(7, 3037000500L))
            .asText());

    //Schriit 10
    FractionEric fraction7 = new FractionEric(10957693037L, 10967535067L);
    System.out.println(fraction7.add(new FractionEric(10961461793L, 10967639796L))
            .asText());
  }
}
