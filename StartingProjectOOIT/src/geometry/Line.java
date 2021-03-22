package geometry;

public class Line {

	private Point startPoint;
	private Point endPoint;
	private boolean selected;

	public Line() {
	}

	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);// prva naredba u bloku (telu konstruktora)
		this.selected = selected;
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

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public String toString() {
		return startPoint+"-- >"+endPoint;
	}

}
