package geometry;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel{
	
	public static void main (String[] args){
		
		JFrame frame= new JFrame("Drawings");
		frame.setSize(800, 600);
		frame.setVisible(true);
		
		Drawing draw=new Drawing();
		frame.getContentPane().add(draw);
	}

	@Override
	public void paint(Graphics g) {
		Point p = new Point(50,50);
		p.draw(g);
		g.setColor(Color.RED);
		
		Line l1 = new Line(new Point (100,100), new Point (200,200));
		l1.draw(g);
		
		Rectangle r1 = new Rectangle(l1.getEndPoint(), 100, 50);
		r1.draw(g);
		
		Circle c1 = new Circle(new Point(500, 100), 80);
		c1.draw(g);

		g.setColor(Color.GREEN);
		Donut d1 = new Donut(new Point(800, 100), 50, 25);
		d1.draw(g);

		Rectangle k1 = new Rectangle(new Point(500, 500), 50, 50);
		k1.draw(g);
		
		int innerR= (int)(k1.getHeight()*Math.sqrt(2)/2);
		Donut d2=new Donut(new Point(k1.getUpperLeftPoint().getX()+k1.getWidth()/2,k1.getUpperLeftPoint().getY()+k1.getWidth()/2), 
				80, innerR);
		d2.draw(g);
		
	}
	
	

}
