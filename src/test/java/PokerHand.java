package src.test.java;

import src.test.resources.Player;
import src.test.resources.Card;

import java.util.*;
import java.time.*;


public class PokerHand {

  public static void main(String[] args) {

    Player play = new Player("Stefan", "Button", 20, new Card("Hearts", 10), new Card("Spades", 4));

    System.out.println(play.toString());

    System.out.println(play.name());
    System.out.println(play.posistion());
    System.out.println(play.stack());
    System.out.println(play.card1());
    System.out.println(play.card2());

    LocalDateTime ldt = LocalDateTime.now();
    //it cole DateTimeFormatter formmat1 = DateTimeFormatter.ofLocalizedDateTime(RFC_1123_DATE_TIME);
    //LocalDateTime parsedldt = LocalDateTime.parse(ldt, formmat1);
    System.out.println(ldt);


  }

}
