package src.test.resources;

public class Card {

  private final String suit;
  private final int rank;

  public Card(String suit, int rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public String suit() { return suit; }

  public int rank() { return rank; }

  @Override
  public String toString(){
    return suit + rank;
  }
}
