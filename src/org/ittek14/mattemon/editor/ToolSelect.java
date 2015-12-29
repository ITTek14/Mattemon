// select what tool you want to open from this screen
package org.ittek14.mattemon.editor;

import org.ittek14.mattemon.gui.Button;
import org.ittek14.mattemon.gui.GUI;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

// TODO implement GUI button to switch state to SpriteViewer

public class ToolSelect extends BasicGameState{
  private GUI gui;
  private Button spriteViewer;
  
  @SuppressWarnings("unused")
  private Button levelEditor;
  
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

  @Override
  public void enter(GameContainer container, StateBasedGame game) throws SlickException {}

  @Override
  public int getID() {
    return 0;
  }

  @Override
  public void init(GameContainer container, StateBasedGame game) throws SlickException {
    gui = new GUI();
    spriteViewer = new Button(container, new Vector2f(container.getWidth()/2,container.getHeight()/2), "Sprite Viewer"){
      @Override
      public void onClick(int button) {
        game.enterState(1);
      }
    };
    gui.addWidget(spriteViewer);
  }

  @Override
  public void leave(GameContainer container, StateBasedGame game) throws SlickException {}

  @Override
  public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
    gui.render(container, g);
  }

  @Override
  public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
    gui.update(container, delta);
  }

}
