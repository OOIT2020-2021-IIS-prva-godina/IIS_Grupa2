package geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape{

	protected Point center;
	private int radius;
	
	public Circle() {

	}

	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public Circle(Point center, int radius, boolean selected) {
		this(center, radius);
		
		setSelected(selected);
		//menja se prilikom dodavanja Shape
		//this.selected = selected;
	}
	
	public double area() {
		return this.radius * this.radius * Math.PI;
	}

	public double circumference() {
		return 2 * this.radius * Math.PI;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle pomocni = (Circle) obj;
			if (this.center.equals(pomocni.center) &&
					this.radius == pomocni.radius) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public boolean contains (int x, int y) {
		return center.distance(x, y) <= radius;
	}
	
	public boolean contains (Point p) {
		return center.distance(p.getX(), p.getY()) <= radius;
	}
	
	

	@Override
	public void draw(Graphics g) {
		g.drawOval(center.getX()-radius,center.getY()-radius, radius*2, radius*2);
		
		if (selected) {
			g.setColor(Color.BLUE);
			g.drawRect(center.getX() - 2, center.getY() - 2, 4, 4);
			g.drawRect(center.getX() - radius - 2, center.getY() - 2, 4, 4);
			g.drawRect(center.getX() + radius - 2, center.getY() - 2, 4, 4);
			g.drawRect(center.getX() - 2, center.getY() - radius - 2, 4, 4);
			g.drawRect(center.getX() - 2, center.getY() + radius - 2, 4, 4);
		}
	}
	
	@Override
	public void moveTo(int x, int y) {
		center.moveTo(x, y);
		
	}

	@Override
	public void moveBy(int x, int y) {
		center.moveBy(x, y);
		
	}
	
	@Override
	public int compareTo(Object o) {

		if(o instanceof Circle) {
			return (int)(this.area()-((Circle)o).area());
		}
		return 0;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) throws Exception{
		if(radius<0) {
			throw new Exception("Vrednost poluprecnika mora biti veci od 0");
		}
		System.out.println("Provera da li se ova naredba izvrsava ukoliko dodje do izuzetka");
		this.radius = radius;
	}

	
	public String toString() {
		// Center=(x,y), radius= radius
		return "Center=" + center + ", radius=" + radius;
	}

}
