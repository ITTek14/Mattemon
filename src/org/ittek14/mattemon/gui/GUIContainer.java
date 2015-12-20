package org.ittek14.mattemon.gui;

import java.util.ArrayList;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Renderable;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class GUIContainer implements Renderable {
    private ArrayList<GUIElement> elements;

    public GUIContainer() {

    }

    @Override
    public void draw(float x, float y) {
        for (int i = 0; i < elements.size(); i++)
            elements.get(i).draw(x, y);
    }

    public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {

    }
}