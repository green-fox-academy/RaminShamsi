package screen;

import java.lang.annotation.*;
import java.lang.reflect.*;

/**
 * Created by HP on 4/19/2017.
 */

@Monitor
public class Screen {
  Size screenSize;
  int pixelWidth;
  int pixelHeight;

  public Screen(int pixelHeight, int pixelWidth, Size screenSize) {
    this.pixelHeight = pixelHeight;
    this.pixelWidth = pixelWidth;
    this.screenSize = screenSize;
  }
}
