// the Sprite Viewer tool for previewing animated spritesheets
// TODO add gui for selecting files

package org.ittek14.mattemon.editor;

import java.io.File;
import java.util.ArrayList;

import org.ittek14.mattemon.gui.Button;
import org.ittek14.mattemon.gui.GUI;
import org.ittek14.mattemon.utility.FileUtil;
import org.newdawn.slick.Animation;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class SpriteViewer extends BasicGameState {
  private GUI gui;
  private ArrayList<File> imgFiles = new ArrayList<File>();
  private Animation loadedAnimation;
  private float zoom = 1;
  private float zoomedWidth, zoomedHeight;
  
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
  public void mouseWheelMoved(int change) {
    //change zoom
    zoom = Math.max(zoom + zoom * (float)change / 1500, 0.01f);
  }

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
  public void keyPressed(int key, char c) {
  }

  @Override
  public void keyReleased(int key, char c) {}

  @Override
  public void controllerButtonPressed(int arg0, int arg1) {}

  @Override
  public void controllerButtonReleased(int arg0, int arg1) {}

  @Override
  public void controllerDownPressed(int arg0) {}

  @Override
  public void controllerDownReleased(int arg0) {}

  @Override
  public void controllerLeftPressed(int arg0) {}

  @Override
  public void controllerLeftReleased(int arg0) {}

  @Override
  public void controllerRightPressed(int arg0) {}

  @Override
  public void controllerRightReleased(int arg0) {}

  @Override
  public void controllerUpPressed(int arg0) {}

  @Override
  public void controllerUpReleased(int arg0) {}

  @Override
  public void enter(GameContainer container, StateBasedGame game) throws SlickException {
    updateList();
  }

  @Override
  public int getID() {
    return 1;
  }

  @Override
  public void init(GameContainer container, StateBasedGame game) throws SlickException {
    gui = new GUI();
    gui.addWidget(new Button(container, new Vector2f(50,50), "Back") {
      @Override
      public void onClick(int button) {
        game.enterState(0);
      }
    });
  }

  public void updateList() {
    // update list of avaliable files
    imgFiles = new ArrayList<File>();
    
    //get all files in /resources
    for(File f : new File("resources").listFiles(FileUtil.filesOnly)){
      imgFiles.add(f);
    }
    
    //get all files in all subdirectories of /resources
    for(File f1 : FileUtil.getAllSubdirectories(new File("resources"))) {
      for(File f2 : f1.listFiles(FileUtil.filesOnly)){
        imgFiles.add(f2);
      }
    }
  }
  
  @Override
  public void leave(GameContainer container, StateBasedGame game) throws SlickException {
  }
  
  @Override
  public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
    if(loadedAnimation != null) {
      loadedAnimation.draw(container.getWidth()/2 - zoomedWidth/2, container.getHeight()/2 - zoomedHeight/2, zoomedWidth, zoomedHeight);
    }
    gui.render(container, g);
  }

  @Override
  public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
    if(loadedAnimation != null){
      // TODO limit zooming
      zoomedWidth = loadedAnimation.getWidth() * zoom;
      zoomedHeight = loadedAnimation.getHeight() * zoom;
    }
    gui.update(container, delta);
  }
}
