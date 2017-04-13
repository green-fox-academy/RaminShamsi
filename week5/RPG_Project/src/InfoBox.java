import java.awt.*;

/**
 * Created by HP on 4/13/2017.
 */
public class InfoBox {
//  int level, maxHP, currentHP, DP, SP;
  String textInfo, totalInfo;
  int valueInfo;

  public InfoBox() {
//    this.level = 1;
 //   this.maxHP = 100;
 //   this.currentHP = value;
 //   this.DP = 30;
 //   this.SP = 50;
//    this.totalInfo = "";

  }

  public int getValueInfo() {
    return (this.valueInfo);
  }

  public String getTextInfo() {
    return (this.textInfo);
  }

  public String setInfo() {
    return getTextInfo() + getValueInfo();
  }

  public void drowBox(Graphics graphics) {
    graphics.setColor(new Color(0, 0, 0, 0.8f));
    graphics.fillRect(20, 600, 200, 100);
    graphics.setColor(Color.white);
    Graphics2D text = (Graphics2D) graphics;

    text.drawString(setInfo(), 25, 640);

//    System.out.println("Max. Health Point: " + maxHP);
//    System.out.println("Current Heaith Point: " + currentHP);
//    System.out.println("Defend Point: " + DP);
//    System.out.println("Strike Point: " + maxHP);

    // text.drawString(info, 25, 620);
  }


}
