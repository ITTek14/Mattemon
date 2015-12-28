package org.ittek14.mattemon.gui;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class GUI {
  public Widget[] widgets;
  
  public GUI() {
    
  }
  
  public void update(GameContainer gc, int delta) {
    for(Widget widget : widgets) {
      widget.update(gc, delta);
    }
  }
  
  public void render(GameContainer gc, Graphics g) {
    for(Widget widget : widgets) {
      widget.render(gc, g);
    }
  }
}
