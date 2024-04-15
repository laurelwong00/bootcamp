package week4.CurrencyDemo;

public class Account {
  private Transaction[] transactions; //銀行唔需要儲存Balance

  public double balance() {
    double balance = 0.0d;
    for (int i = 0; i < transactions.length; i++) {
      if (transactions[i].getSign() == Sign.CREDIT) {
        balance += transactions[i].getAmountInHKD();
      } else {
        balance -= transactions[i].getAmountInHKD();
      }
    }
    return balance;
  }

  public Account() {
    this.transactions = new Transaction[0];
  }

  public void add(Transaction transaction) {
    Transaction[] copyArr = this.transactions;
    this.transactions = new Transaction[copyArr.length + 1];
    int idx = 0;
    for (Transaction t: copyArr) {
      this.transactions[idx++] = t;
    }
    this.transactions[idx] = transaction;
  }

  public static void main(String[] args) {
    Account account = new Account();
    account.add(new Transaction(Sign.CREDIT, Currency.HKD, 2500));
    account.add(new Transaction(Sign.DEBIT, Currency.HKD, 1300));
    System.out.println(account.balance()); //1200
  }
}
