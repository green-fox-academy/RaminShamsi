package screen;

/**
 * Created by HP on 4/19/2017.
 */

@Monitor(aspectRatio = "21:9", classification = "LCD")
public class Screen219 extends Screen {

  public Screen219(int pixelHeight, int pixelWidth, Size screenSize) {
    super(pixelHeight, pixelWidth, screenSize);
  }

  Monitor annotation = Screen219.class.getAnnotation(Monitor.class);
  String aspectRatio = annotation.aspectRatio();
  String classification = annotation.classification();

  @Override
  public String toString() {
    return "Screen219 has: \n" + pixelHeight + " pixel at height, " + pixelWidth + " pixel at width\n"
            + aspectRatio + " aspect ratio and classification is: " + classification;
  }
}
