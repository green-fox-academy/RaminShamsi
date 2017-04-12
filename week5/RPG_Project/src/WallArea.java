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

  public boolean isWall(int posX, int posY) {
    try {
      if (result[posX / 72][posY / 72] == 1) {
        return false;
      } else {
        return true;
      }
    } catch (Exception e) {
      return true;
    }
  }
}
