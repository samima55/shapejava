package shape;

import java.awt.Point;
import java.util.ArrayList;

public abstract class Shape implements Movable {
	protected Point leftTop;
     protected boolean isCircular =false;
   protected ArrayList<Point> points = new ArrayList<Point>();
	

	public Shape(Point lefttop) {
		this.leftTop = lefttop;

	}
	
	abstract void calculatePoints();
	abstract double calculateArea();
	abstract double calculatePerimeter();
	 public abstract String toString();
	
	
	public void move(int x , int y) {
		Point newPoint= new Point(x,y);
		this.leftTop= newPoint;
		this.points.set(0,newPoint);
		
	}
	 

}