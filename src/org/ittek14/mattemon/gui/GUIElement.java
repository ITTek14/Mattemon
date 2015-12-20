package org.ittek14.mattemon.gui;

import org.newdawn.slick.InputListener;
import org.newdawn.slick.Renderable;
import org.newdawn.slick.geom.Rectangle;

public abstract class GUIElement implements InputListener, Renderable {
  protected Rectangle bounds;
}
