package screen;

/**
 * Created by HP on 4/19/2017.
 */

@Monitor(aspectRatio = "16:9", classification = "TFT")
public class Screen169 extends Screen {

  public Screen169(int pixelHeight, int pixelWidth, Size screenSize) {
    super(pixelHeight, pixelWidth, screenSize);
  }

  Monitor annotation = Screen169.class.getAnnotation(Monitor.class);
  String aspectRatio = annotation.aspectRatio();
  String classification = annotation.classification();

  @Override
  public String toString(){
    return "Screen169 has: \n" + pixelHeight + " pixel at height, " + pixelWidth + " pixel at width\n"
            + aspectRatio + " aspect ratio and classification is: " + classification;
  }
}
