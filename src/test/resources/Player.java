package src.test.resources;

public class Player {

  private final String name;
  private final String posistion;
  private final int stack;
  private final Card playerCard1;
  private final Card playerCard2;

  public Player(String name, String posistion, int stack, Card playerCard1, Card playerCard2){
    this.name = name;
    this.posistion = posistion;
    this.stack = stack;
    this.playerCard1 = playerCard1;
    this.playerCard2 = playerCard2;
  }

  public String name() { return name; }

  public String posistion() { return posistion; }

  public int stack() { return stack; }

  public Card playerCard1() { return playerCard1; }

  public Card playerCard2() { return playerCard2; }

  @Override
  public String toString(){
    return name + " " + posistion + " " + stack + "BB " +
          playerCard1.toString() + " " + playerCard2.toString();
  }

}
