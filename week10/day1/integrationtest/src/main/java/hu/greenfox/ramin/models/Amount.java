package hu.greenfox.ramin.models;

import org.springframework.stereotype.Component;

@Component
public class Amount {

  int amount;

  public Amount() {

  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }
}
