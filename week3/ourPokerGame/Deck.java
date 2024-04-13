package week3.ourPokerGame;

public class Deck {
  private static char[] suits = {
    Card.CLOVER,
    Card.DIAMOND,
    Card.HEART,
    Card.SPADE
  };

  private static int[] ranks = {
    Card.ACE,
    Card.TWO,
    Card.THREE,
    Card.FOUR,
    Card.FIVE,
    Card.SIX,
    Card.SEVEN,
    Card.EIGHT,
    Card.NINE,
    Card.TEN,
    Card.JACK,
    Card.QUEEN,
    Card.KING
  };

  private Card[] cards;

  public Deck() {
    cards = new Card[52];
    int i = 0;

    for (char suit: suits) {
      for (int rank: ranks) {
        cards[i] = new Card(rank, suit);
        i++;
      }
    }
  }

  public Card[] getCards() {
    return cards;
  }

  public Card getTop() {
    return this.cards[0];
  }

  public void shuffle() {
    Card[] afterShuffle = new Card[52];
    for (int i = 0; i < afterShuffle.length; i++) {
      afterShuffle[i] = cards[]
    }
  }
}
