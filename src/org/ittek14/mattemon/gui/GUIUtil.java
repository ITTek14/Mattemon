package org.ittek14.mattemon.gui;

import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Vector2f;

public class GUIUtil {
  public static Vector2f anchor(Rectangle rect, GUIAnchor anchor) {
    float leftX = rect.getX();
    float rightX = leftX - rect.getWidth();
    float topY = rect.getY();
    float bottomY = topY - rect.getHeight();
    float centerX = leftX - rect.getWidth()/2;
    float centerY = topY - rect.getHeight()/2;
    
    switch(anchor) {
      case CENTER:
        return new Vector2f(centerX, centerY);
      case TOP:
        return new Vector2f(centerX, topY);
      case BOTTOM:
        return new Vector2f(centerX, bottomY);
      case LEFT:
        return new Vector2f(centerX, centerY);
      case RIGHT:
        return new Vector2f(rightX, centerY);
      case TOPLEFT:
        return rect.getLocation();
      case TOPRIGHT:
        return new Vector2f(rightX, topY);
      case BOTTOMLEFT:
        return new Vector2f(leftX, bottomY);
      case BOTTOMRIGHT:
        return new Vector2f(rightX, bottomY);
      default:
        return rect.getLocation();
    }
  }
}
