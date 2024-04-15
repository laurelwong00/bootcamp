
package week4.CurrencyDemo;

public class Transaction {

  private Sign sign;
  private Currency currency;
  private int amount;
  
  public Transaction(Sign sign, Currency currency, int amount) {
    this.sign = sign;
    this.currency = currency;
    this.amount = amount;
  }

  public Sign getSign() {
    return this.sign;
  }

  public int getAmount() {
    return this.amount;
  }

  public Currency currency() {
    return this.currency;
  }

  public double getAmountInHKD() {
    return this.currency.getFxRate()*amount;
  }

}

  
