package org.ittek14.mattemon.gui;

import java.util.ArrayList;

import org.newdawn.slick.geom.Rectangle;

public class GUIContainer {
	private Rectangle bounds;
	private ArrayList<GUIElement> elements;
	public GUIContainer(Rectangle bounds) {
		this.bounds = bounds;
	}
}
