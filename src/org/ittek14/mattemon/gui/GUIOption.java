package org.ittek14.mattemon.gui;

public abstract class GUIOption {
  public String name;
  public GUIOption(String name) {
    this.name = name;
  }
  
  public abstract void onSelect();
}
