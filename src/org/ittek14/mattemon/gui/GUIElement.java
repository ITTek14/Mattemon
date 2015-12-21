package org.ittek14.mattemon.gui;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.InputListener;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.StateBasedGame;

public abstract class GUIElement implements InputListener {
  protected Rectangle bounds;
  
  public GUIElement(GameContainer gc){
    gc.getInput().addListener(this);
  }
  
  public abstract void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException;
  public abstract void update(GameContainer container, StateBasedGame game, int delta) throws SlickException;
  
  public Rectangle getBounds(){
    return bounds;
  }
  
}
