package shape;

import java.awt.Point;

public class Rectangle extends Shape {

	private int height;
	private int width;

	public Rectangle(Point leftTop, int height, int width) {
		super(leftTop);
		this.height = height;
		this.width = width;
		this.calculatePoints();
	}
     
	public double calculateArea() {
		double area =this.width * this.height;
		return area;
	}

	public double calculatePerimeter() {
		double perimeter=2*(this.width + this.height);
		return perimeter;
	}


	public void calculatePoints() {
		this.points.add(leftTop);
		Point point = new Point((int) (leftTop.getX() + width), (int) leftTop.getY());
		this.points.add(point);
		point = new Point((int) (leftTop.getX() + width), (int) leftTop.getY() + height);
		this.points.add(point);
		point = new Point((int) (leftTop.getX()), (int) leftTop.getY() + height);
		this.points.add(point);
	}

	public String toString() {
		
		return "Rectangle[h=" + this.height + ",w=" + this.width + "]Points[(" +

				(int)this.points.get(0).getX() + "," + (int)this.points.get(0).getY() + ")" + "(" +
				  (int) this.points.get(1).getX()
				+ "," +(int) this.points.get(1).getY() + ")" + "(" +(int) this.points.get(2).getX() + ","
				+(int) this.points.get(2).getY() + ")" + "(" +(int) this.points.get(3).getX() + "," +
				(int)this.points.get(3).getY() +

				")]Area=" + this.calculateArea() + "\n" + "Perimeter=" + this.calculatePerimeter();
		
	}
}