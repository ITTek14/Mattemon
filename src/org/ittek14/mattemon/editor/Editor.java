package org.ittek14.mattemon.editor;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Editor extends StateBasedGame {

	public Editor(String gamename) {
		super(gamename);
	}

	public static void main(String[] args) {
		try {
			AppGameContainer appgc;
			appgc = new AppGameContainer(new Editor("Mattemon Dev Tools"));
			appgc.setDisplayMode(800, 600, false);
			appgc.start();
		} catch (SlickException ex) {
			Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}

	@Override
	public void initStatesList(GameContainer container) throws SlickException {
		addState(new SpriteViewer());
	}
}