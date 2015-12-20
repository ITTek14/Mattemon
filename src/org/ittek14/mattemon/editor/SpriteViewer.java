package org.ittek14.mattemon.editor;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.ittek14.mattemon.Game;
import org.ittek14.mattemon.gui.GUIButton;
import org.ittek14.mattemon.gui.GUIContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;

public class SpriteViewer implements GameState {
  private GUIContainer gui;
  
  @Override
  public void mouseClicked(int button, int x, int y, int clickCount) {
    // TODO Auto-generated method stub

  }

  @Override
  public void mouseDragged(int oldx, int oldy, int newx, int newy) {
    // TODO Auto-generated method stub

  }

  @Override
  public void mouseMoved(int oldx, int oldy, int newx, int newy) {
    // TODO Auto-generated method stub

  }

  @Override
  public void mousePressed(int button, int x, int y) {
    // TODO Auto-generated method stub

  }

  @Override
  public void mouseReleased(int button, int x, int y) {
    
    
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
  public boolean isAcceptingInput() {
    // TODO Auto-generated method stub
    return true;
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
  public void controllerButtonPressed(int arg0, int arg1) {
    // TODO Auto-generated method stub

  }

  @Override
  public void controllerButtonReleased(int arg0, int arg1) {
    // TODO Auto-generated method stub

  }

  @Override
  public void controllerDownPressed(int arg0) {
    // TODO Auto-generated method stub

  }

  @Override
  public void controllerDownReleased(int arg0) {
    // TODO Auto-generated method stub

  }

  @Override
  public void controllerLeftPressed(int arg0) {
    // TODO Auto-generated method stub

  }

  @Override
  public void controllerLeftReleased(int arg0) {
    // TODO Auto-generated method stub

  }

  @Override
  public void controllerRightPressed(int arg0) {
    // TODO Auto-generated method stub

  }

  @Override
  public void controllerRightReleased(int arg0) {
    // TODO Auto-generated method stub

  }

  @Override
  public void controllerUpPressed(int arg0) {
    // TODO Auto-generated method stub

  }

  @Override
  public void controllerUpReleased(int arg0) {
    // TODO Auto-generated method stub

  }

  @Override
  public void enter(GameContainer container, StateBasedGame game) throws SlickException {
    // TODO Auto-generated method stub

  }

  @Override
  public int getID() {
    // TODO Auto-generated method stub
    return 1;
  }

  @Override
  public void init(GameContainer container, StateBasedGame game) throws SlickException {
    gui = new GUIContainer();
    gui.addElement(new GUIButton(container, new Rectangle(500, 200, container.getDefaultFont().getWidth("Sprite Previewer") + 8, 
        container.getDefaultFont().getHeight("Sprite Previewer") + 8), "Sprite Previewer"){
      protected void trigger(int button) {
        System.out.println("Hi");
      }

      public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
        bounds.setCenterX(container.getWidth()/2);
      }
    });
  }

  @Override
  public void leave(GameContainer container, StateBasedGame game) throws SlickException {
    // TODO Auto-generated method stub
  }

  @Override
  public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
    gui.render(container, game, g);
  }

  @Override
  public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
    gui.update(container, game, delta);
  }

}
