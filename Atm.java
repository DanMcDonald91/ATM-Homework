

public class Atm{

  private int cash;
  private String locations;
  private int maximumwithdraw;

  public Atm (int cash, int maximumwithdraw, String locations) {
    
    this.cash = cash;
    this.locations = locations;
    this.maximumwithdraw = maximumwithdraw;
  }

  public int getCash() {
    return this.cash;
  }

  public String getLocation() {
    return this.locations;
  }

  public int getMaximumWithdraw() {
    return this.maximumwithdraw;
  }

  public void withdrawCash(int cash) {
    this.cash -=cash;
  }


}