import java.awt.*;

/**
 * Created by HP on 4/13/2017.
 */
public class InfoBox {

  String[] textInfo, totalInfo;
  int[] valueInfo;
  int numberOfInfo;

  public InfoBox() {
    numberOfInfo = 5;
  }

  public int[] getValueInfo() {
    int[] value = new int[numberOfInfo];
    for (int i = 0; i < numberOfInfo; i++) {
      value[i] = this.valueInfo[i];
    }
    return value;
  }

  public String[] getTextInfo() {
    String[] text = new String[numberOfInfo];
    for (int i = 0; i < numberOfInfo; i++) {
      text[i] = this.textInfo[i];
    }
    return text;
  }

  public String[] setInfo() {
    String[] allTogether = new String[numberOfInfo];
    for (int i = 0; i < numberOfInfo; i++) {
      allTogether[i] = (getTextInfo()[i] + getValueInfo()[i]);
    }
    return allTogether;
  }

  public void drowBox(Graphics graphics) {
    graphics.setColor(new Color(0, 0, 0, 0.8f));
    graphics.fillRect(450, 10, 250, 20);
    graphics.setColor(Color.white);
    Graphics2D text = (Graphics2D) graphics;
    for (int i = 0; i < numberOfInfo; i++) {
      if (i == 2) {
        text.drawString(setInfo()[i], 460 + i * 45, 25);
      } else {
        text.drawString(setInfo()[i], 460 + i * 50, 25);
      }
    }

  }

}
