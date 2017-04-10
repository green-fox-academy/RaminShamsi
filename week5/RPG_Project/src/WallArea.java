import java.awt.*;

/**
 * Created by HP on 4/10/2017.
 */
public class WallArea extends GameObject {
  int tileNumberX;
  int tileNumberY;
  MazeObj m;
  byte[][] result;

  public WallArea() {
    tileNumberX = 10;
    tileNumberY = 10;
    m = new MazeObj(tileNumberX, tileNumberY);
    result = m.generate();
  }

  public void wallArea(Graphics graphics) {
    for (int y = 0; y < tileNumberY; y++) {
      for (int x = 0; x < tileNumberX; x++) {
        if (result[x][y] == m.WALL) {
          drawWallObject(graphics, x, y);
        }
      }
    }
  }
}
