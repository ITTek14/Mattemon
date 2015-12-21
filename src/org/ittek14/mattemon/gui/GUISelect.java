package org.ittek14.mattemon.gui;

import java.util.ArrayList;

import org.newdawn.slick.Font;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.StateBasedGame;

public class GUISelect extends GUIElement {
  private ArrayList<GUIOption> options = new ArrayList<GUIOption>();
  private GUIOption selected = null;
  
  public GUISelect(GameContainer gc, int x, int y) {
    super(gc);
    bounds = new Rectangle(x,y,1,1);
  }

  @Override
  public void mouseClicked(int arg0, int arg1, int arg2, int arg3) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void mouseDragged(int arg0, int arg1, int arg2, int arg3) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void mouseMoved(int arg0, int arg1, int arg2, int arg3) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void mousePressed(int button, int x, int y) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void mouseReleased(int button, int x, int y) {
    // TODO Auto-generated method stub
    
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
    return false;
  }

  @Override
  public void setInput(Input arg0) {
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
  
  public void addOption(String name) {
    options.add(new GUIOption(name));
  }
  
  public void addOptions(String[] names) {
    for (String name : names){
      addOption(name);
    }
  }
  
  public void addOption(GUIOption op) {
    addOption(op);
  }
  
  public void addOptions(GUIOption[] ops) {
    for (GUIOption option : ops){
      addOption(option);
    }
  }
  
  public void clearOptions() {
    options.clear();
  }

  @Override
  public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
    Font font = container.getDefaultFont();
    for(int i = 0; i < options.size() ; i++) {
      if(options.get(i) == selected) {
        g.drawRect(bounds.getX(), bounds.getY() + i * font.getLineHeight() - 1, font.getWidth(options.get(i).name), font.getLineHeight() + 2);
      }
      font.drawString(bounds.getX(), bounds.getY() + i * font.getLineHeight(), options.get(i).name);
    }
  }

  @Override
  public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
    // TODO Auto-generated method stub
  }
}
