package screen;

import java.lang.annotation.Inherited;

/**
 * Created by HP on 4/19/2017.
 */


@Monitor(aspectRatio = "4:3", classification = "LCD")
public class Screen43 extends Screen {

  public Screen43(int pixelHeight, int pixelWidth, Size screenSize) {
    super(pixelHeight, pixelWidth, screenSize);
  }

  Monitor annotation = Screen43.class.getAnnotation(Monitor.class);
  String aspectRatio = annotation.aspectRatio();
  String classification = annotation.classification();

  @Override
  public String toString() {
    return "Screen43 has: \n" + pixelHeight + " pixel at height, " + pixelWidth + " pixel at width\n"
            + aspectRatio + " aspect ratio and classification is: " + classification;
  }
}
