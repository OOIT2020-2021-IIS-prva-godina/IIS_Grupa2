package geometry;

import java.awt.Graphics;

public abstract class Shape {
	
	private boolean selected;//mozemo definisati i kao protected pa ne bismo morali da menjamo konstruktore u ostalim klasama
	
	public Shape () {
	}
	
	public Shape (boolean selected) {
		this.selected=selected;
	}
	
	public abstract boolean contains (int x, int y);
	public abstract void draw(Graphics g);

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	

}
