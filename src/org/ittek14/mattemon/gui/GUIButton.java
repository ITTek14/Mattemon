package org.ittek14.mattemon.gui;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.StateBasedGame;


public abstract class GUIButton extends GUIElement {
  protected boolean pressed;
  protected String text;
  protected abstract void trigger(int button);

  public GUIButton(GameContainer gc, Rectangle bounds, String text) {
    super (gc);
    this.bounds = bounds;
    this.text = text;
  }
  
  public GUIButton(GameContainer gc, int x, int y, String text) {
    super (gc);
    this.bounds = new Rectangle(x, y, gc.getDefaultFont().getWidth(text), gc.getDefaultFont().getLineHeight());
    this.text = text;
  }

  @Override
  public void mouseClicked(int button, int x, int y, int clickCount) {
    pressed = this.bounds.contains(x, x);
  }

  @Override
  public void mouseDragged(int oldx, int oldy, int newx, int newy) {
    pressed = this.bounds.contains(newx, newy);
  }

  @Override
  public void mouseMoved(int oldx, int oldy, int newx, int newy) {
    // TODO Auto-generated method stub

  }

  @Override
  public void mousePressed(int button, int x, int y) {
    pressed = bounds.contains(x, y);
  }

  @Override
  public void mouseReleased(int button, int x, int y) {
    if(this.bounds.contains(x, y)) {
      trigger(button);
    }
    pressed = false;
  }

  @Override
  public void mouseWheelMoved(int change) {
    // TODO Auto-generated method stub
  }

  @Override
  public void inputEnded() {
    // TODO Auto-generated method stub
  }

  @Override
  public void inputStarted() {
    // TODO Auto-generated method stub
  }

  @Override
  public void setInput(Input input) {
    // TODO Auto-generated method stub

  }

  @Override
  public void keyPressed(int key, char c) {
    // TODO Auto-generated method stub

  }

  @Override
  public void keyReleased(int key, char c) {
    // TODO Auto-generated method stub

  }

  @Override
  public void controllerButtonPressed(int controller, int button) {
    // TODO Auto-generated method stub

  }

  @Override
  public void controllerButtonReleased(int controller, int button) {
    // TODO Auto-generated method stub

  }

  @Override
  public void controllerDownPressed(int controller) {
    // TODO Auto-generated method stub

  }

  @Override
  public void controllerDownReleased(int controller) {
    // TODO Auto-generated method stub

  }

  @Override
  public void controllerLeftPressed(int controller) {
    // TODO Auto-generated method stub

  }

  @Override
  public void controllerLeftReleased(int controller) {
    // TODO Auto-generated method stub

  }

  @Override
  public void controllerRightPressed(int controller) {
    // TODO Auto-generated method stub

  }

  @Override
  public void controllerRightReleased(int controller) {
    // TODO Auto-generated method stub

  }

  @Override
  public void controllerUpPressed(int controller) {
    // TODO Auto-generated method stub

  }

  @Override
  public void controllerUpReleased(int controller) {
    // TODO Auto-generated method stub
  }

  public boolean isPressed() {
    return pressed;
  }

  public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
    g.setColor(Color.white);
    if(pressed) {
      g.setColor(Color.gray);
    }
    g.drawString(text, bounds.getX(), bounds.getY());
  }
  
  public abstract void update(GameContainer container, StateBasedGame game, int delta) throws SlickException;
}
