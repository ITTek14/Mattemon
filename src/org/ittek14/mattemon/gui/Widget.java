package org.ittek14.mattemon.gui;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.InputListener;

public abstract class Widget implements InputListener {
  
  public abstract void update(GameContainer gc, int delta);
  public abstract void render(GameContainer gc, Graphics g);

  @Override
  public void mouseClicked(int button, int x, int y, int clickCount) {}

  @Override
  public void mouseDragged(int oldx, int oldy, int newx, int newy) {}

  @Override
  public void mouseMoved(int oldx, int oldy, int newx, int newy) {}

  @Override
  public void mousePressed(int button, int x, int y) {}

  @Override
  public void mouseReleased(int button, int x, int y) {}

  @Override
  public void mouseWheelMoved(int change) {}

  @Override
  public void inputEnded() {}

  @Override
  public void inputStarted() {}

  @Override
  public boolean isAcceptingInput() {
    return true;
  }

  @Override
  public void setInput(Input input) {}

  @Override
  public void keyPressed(int key, char c) {}

  @Override
  public void keyReleased(int key, char c) {}

  @Override
  public void controllerButtonPressed(int controller, int button) {}

  @Override
  public void controllerButtonReleased(int controller, int button) {}

  @Override
  public void controllerDownPressed(int controller) {}

  @Override
  public void controllerDownReleased(int controller) {}

  @Override
  public void controllerLeftPressed(int controller) {}

  @Override
  public void controllerLeftReleased(int controller) {}

  @Override
  public void controllerRightPressed(int controller) {}

  @Override
  public void controllerRightReleased(int controller) {}

  @Override
  public void controllerUpPressed(int controller) {}

  @Override
  public void controllerUpReleased(int controller) {}
}
