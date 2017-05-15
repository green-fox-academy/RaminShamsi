package hu.greenfox.ramin.models;

import org.springframework.stereotype.Component;

@Component
public class Guardian {

  String received;
  final String translated = "I am Groot!";

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }
}
