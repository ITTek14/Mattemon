package org.ittek14.mattemon.gui;

import java.util.ArrayList;

import org.newdawn.slick.Color;
import org.newdawn.slick.Font;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.StateBasedGame;

public class GUISelect extends GUIElement {
  private ArrayList<GUIOption> options = new ArrayList<GUIOption>();
  private int selected = -1;
  private Font font;
  
  public GUISelect(GameContainer gc, int x, int y) {
    super(gc);
    font = gc.getDefaultFont();
    bounds = new Rectangle(x,y,1,1);
  }

  @Override
  public void mouseClicked(int arg0, int arg1, int arg2, int arg3) {
    
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
    for(int i = 0; i < options.size() ; i++) {
      GUIOption option = options.get(i);
      if(new Rectangle(bounds.getX(), bounds.getY() + i * font.getLineHeight() - 1, font.getWidth(option.name), font.getLineHeight() + 2).contains(x,y)){
        select(i);
      }
    }
  }

  public void select(GUIOption op) {
    select(options.indexOf(op));
  }
  
  public void select(int op) {
    selected = op;
    options.get(op).onSelect();
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
  
  public void addOption(GUIOption op) {
    options.add(op);
    if(selected >= 0 && selected < options.size())
    {
      select(options.get(options.size()-1));
    }
  }
  
  public void addOptions(GUIOption[] ops) {
    for (GUIOption option : ops){
      addOption(option);
    }
  }
  
  public void clearOptions() {
    options.clear();
    selected = -1;
  }
  
  public int countOptions() {
    return options.size();
  }

  @Override
  public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
    g.setColor(Color.white);
    for(int i = 0; i < options.size() ; i++) {
      if(selected >= 0 && selected < options.size()){
        if(options.get(i) == options.get(selected)) {
          g.drawRect(bounds.getX(), bounds.getY() + i * font.getLineHeight() - 1, font.getWidth(options.get(i).name), font.getLineHeight() + 2);
        }
      }
      font.drawString(bounds.getX(), bounds.getY() + i * font.getLineHeight(), options.get(i).name);
    }
  }

  @Override
  public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
    // TODO Auto-generated method stub
  }
}
