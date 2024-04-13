package week3.ourPokerGame;

public class Card {
  public static int ACE = 1;
  public static int TWO = 2;
  public static int THREE = 3;
  public static int FOUR = 4; 
  public static int FIVE = 5;
  public static int SIX = 6;
  public static int SEVEN = 7;
  public static int EIGHT = 8;
  public static int NINE = 9;
  public static int TEN = 10;
  public static int JACK = 11;
  public static int QUEEN = 12;
  public static int KING = 13;

  public static char HEART = 'h';
  public static char SPADE = 's';
  public static char CLOVER = 'c';
  public static char DIAMOND = 'd';

  private int rank;
  private char suit;

  public Card(int rank, char suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public int getRank() {
    return this.rank;
  }

  public void setRank(int rank) {
    this.rank = rank;
  }

  public char getSuit() {
    return this.suit;
  }

  public void setSuit(char suit) {
    this.suit = suit;
    System.out.println("Suit has changed!");
  }
}
