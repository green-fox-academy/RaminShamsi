import java.awt.*;

/**
 * Created by HP on 4/13/2017.
 */
public class InfoBox {
  //  int level, maxHP, currentHP, DP, SP;
  String[] textInfo, totalInfo;
  int[] valueInfo;
  int numberOfInfo;

  public InfoBox() {
//    this.level = 1;
    //   this.maxHP = 100;
    //   this.currentHP = value;
    //   this.DP = 30;
    //   this.SP = 50;
//    this.totalInfo = "";
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

//    text.drawString(setInfo(), 25, 640);


//    System.out.println("Max. Health Point: " + maxHP);
//    System.out.println("Current Heaith Point: " + currentHP);
//    System.out.println("Defend Point: " + DP);
//    System.out.println("Strike Point: " + maxHP);

    // text.drawString(info, 25, 620);
  }


}
