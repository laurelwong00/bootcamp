package week4.CurrencyDemo;

public enum Currency {
  
  HKD(1.00d),
  USD(7.80d),
  AUD(5.10d),
  JPY(0.05d)
;

  private double fxRate;

  public double getFxRate() {
    return this.fxRate;
  }

  public void setFxRate(double fxRate) {
    this.fxRate = fxRate;
  }

  private Currency(double fxRate){
    this.fxRate = fxRate;
  }
}
