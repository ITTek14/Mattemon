package org.ittek14.mattemon.gui;

import java.util.ArrayList;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class GUIContainer {
  private ArrayList<GUIElement> elements = new ArrayList<GUIElement>();

  public GUIContainer() {
  }

  public GUIElement addElement(GUIElement e) {
    elements.add(e);
    return e;
  }
  
  public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
    for (int i = 0; i < elements.size(); i++){
      elements.get(i).render(container, game, g);
    }
  }
  
  public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
    for (int i = 0; i < elements.size(); i++){
      elements.get(i).update(container, game, delta);
    }
  }
}