package org.ittek14.mattemon.editor;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;

import org.ittek14.mattemon.gui.GUIButton;
import org.ittek14.mattemon.gui.GUIContainer;
import org.newdawn.slick.Animation;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;

import com.sun.javafx.collections.ArrayListenerHelper;

public class SpriteViewer implements GameState {
  private GUIContainer gui;
  
  private SpriteSheet spriteSheet;
  private Animation anim;
  private float zoom = 1;
  private float zoomedWidth, zoomedHeight;
  
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
    zoom = Math.max(zoom + zoom * (float)change / 1500, 0.01f);
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
  }

  @Override
  public int getID() {
    // TODO Auto-generated method stub
    return 1;
  }

  @Override
  public void init(GameContainer container, StateBasedGame game) throws SlickException {
  
  }

  @Override
  public void leave(GameContainer container, StateBasedGame game) throws SlickException {
    // TODO Auto-generated method stub
  }

  @Override
  public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
    if(anim != null){
      anim.draw(container.getWidth()/2 - zoomedWidth/2, container.getHeight()/2 - zoomedHeight/2, zoomedWidth, zoomedHeight);
    }
    gui.render(container, game, g);
  }

  @Override
  public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
    zoomedWidth = anim.getWidth() * zoom;
    zoomedHeight = anim.getHeight() * zoom;
    gui.update(container, game, delta);
  }
}
