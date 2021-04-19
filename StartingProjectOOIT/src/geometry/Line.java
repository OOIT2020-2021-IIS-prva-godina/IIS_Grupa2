package geometry;

import java.awt.Graphics;

public class Line extends Shape{

	private Point startPoint;
	private Point endPoint;

	public Line() {
	}

	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);// prva naredba u bloku (telu konstruktora)
		
		setSelected(selected);
		//menja se prilikom dodavanja Shape
		//this.selected = selected;
	}

	public double length() {
		return this.startPoint.distance(this.endPoint.getX(), this.endPoint.getY());
	}
	
	public boolean equals(Object obj) {

		if (obj instanceof Line) {

			Line pomocna = (Line) obj;
			if (startPoint.equals(pomocna.startPoint) && endPoint.equals(pomocna.endPoint))
				return true;
			else
				return false;
		} else
			return false;

	}
	
	public boolean contains(int x, int y) {
		return (this.startPoint.distance(x, y)+this.endPoint.distance(x, y)) - length() <= 2;
	}
	
	

	@Override
	public void draw(Graphics g) {
		g.drawLine(startPoint.getX(), startPoint.getY(), endPoint.getX(), endPoint.getY());
		
	}
	
	

	@Override
	public void moveTo(int x, int y) {
		//nije moguce implementirati
		
	}

	@Override
	public void moveBy(int x, int y) {
		startPoint.moveBy(x, y);
		endPoint.moveBy(x, y);
	}
	
	@Override
	public int compareTo(Object o) {
		
		if(o instanceof Line) {
			return (int)(this.length()-((Line)o).length());
		}
		return 0;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getStartPoint() {
		return this.startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
	
	public String toString() {
		return startPoint+"-- >"+endPoint;
	}

}
