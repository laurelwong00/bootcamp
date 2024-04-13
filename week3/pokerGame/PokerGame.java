package week3.pokerGame;

public class PokerGame {
  public static void main(String[] args) {
    Card myCard = new Card(Card.THREE, Suit.DIAMOND);

    // System.out.println(myCard.rank); //cannot!
    System.out.println(myCard.getRank()); //CAN!;
  }

}
