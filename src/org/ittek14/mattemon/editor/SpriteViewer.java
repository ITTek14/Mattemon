package org.ittek14.mattemon.editor;

import java.io.File;
import java.util.ArrayList;

import org.ittek14.mattemon.gui.GUIButton;
import org.ittek14.mattemon.gui.GUIContainer;
import org.ittek14.mattemon.gui.GUIOption;
import org.ittek14.mattemon.gui.GUISelect;
import org.ittek14.mattemon.utility.FileUtil;
import org.ittek14.mattemon.utility.MathUtil;
import org.newdawn.slick.Animation;
import org.newdawn.slick.Color;
import org.newdawn.slick.Font;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;

public class SpriteViewer implements GameState {
  private GUIContainer gui, browser;
  private GUISelect select;
  private ArrayList<File> bmpFiles = new ArrayList<File>();
  private SpriteSheet spriteSheet;
  private Animation anim;
  private float zoom = 1;
  private Vector2f maxSize = new Vector2f(180,200);
  private Vector2f minSize = new Vector2f(0,0);
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
    updateList();
  }

  @Override
  public int getID() {
    // TODO Auto-generated method stub
    return 1;
  }

  @Override
  public void init(GameContainer container, StateBasedGame game) throws SlickException {
    gui = new GUIContainer(container);
    
    // GUI Container for browsing files
    browser = (GUIContainer) gui.addElement(new GUIContainer(container){
      private GUISelect select;
      @Override
      public void init(){
        this.select = (GUISelect) addElement(new GUISelect(container, 10, 50));
        SpriteViewer.this.select = this.select;
        
        //Button for refreshing File List
        addElement(new GUIButton(container, 0, 0, "Refresh") {
          @Override
          public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
            bounds.setX(select.getBounds().getX() + 3);
            bounds.setY(select.getBounds().getY() + select.countOptions() * container.getDefaultFont().getLineHeight() + 4);
          }
          
          @Override
          protected void trigger(int button) {
            updateList();
          }
          
          @Override
          public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException{
            Font font = g.getFont();
            g.drawRect(bounds.getX()-3, bounds.getY()-1, font.getWidth(text)+6, font.getLineHeight() + 2); 
            super.render(container, game, g);
          }
        }); 
      }
    });
    
  }

  public void updateList() {
    bmpFiles = new ArrayList<File>();
    for(File f : new File("resources").listFiles(FileUtil.filesOnly)){
      bmpFiles.add(f);
    }
    
    for(File f1 : FileUtil.getAllSubdirectories(new File("resources"))) {
      for(File f2 : f1.listFiles(FileUtil.filesOnly)){
        bmpFiles.add(f2);
      }
    }
    
    select.clearOptions();
    for(File f : bmpFiles) {
      select.addOption(new GUIOption(f.getPath()) {
        public void onSelect() {
          try {
            spriteSheet = new SpriteSheet(new Image(f.getAbsolutePath()), 16, 16);
            spriteSheet.setFilter(Image.FILTER_NEAREST);
          } catch (SlickException e) {
            e.printStackTrace();
          }
          anim = new Animation(spriteSheet, 320);
        }
      });
    }
  }
  
  @Override
  public void leave(GameContainer container, StateBasedGame game) throws SlickException {
    // TODO Auto-generated method stub
  }
  
  @Override
  public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
    if(anim != null) {
      anim.draw(container.getWidth()/2 - zoomedWidth/2, container.getHeight()/2 - zoomedHeight/2, zoomedWidth, zoomedHeight);
    }
    gui.render(container, game, g);
  }

  @Override
  public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
    gui.update(container, game, delta);
    
    
    if(anim != null){
      float animSize = (float) Math.hypot(anim.getWidth(), anim.getHeight()); //diagonal size of sprite
      zoom = (float) MathUtil.clamp(zoom, minSize.length() / animSize, maxSize.length() / animSize);
      
      zoomedWidth = anim.getWidth() * zoom;
      zoomedHeight = anim.getHeight() * zoom;
    }
  }
}
