package shape;

import java.awt.Point;

public class Square extends Shape {

	private int edge;
	
	public Square(Point leftTop, int edge) {
		super(leftTop);
		this.edge = edge;
		calculatePoints();

	}

	@Override
	double calculateArea() {
		double area= edge*edge;
		return area;
	}

	@Override
	double calculatePerimeter() {
		  double perimeter=4*edge;
		return perimeter;
	}

	
	
	@Override
	public String toString() {
		return "Square[e=" + this.edge+ "]Points[(" +
				(int)this.points.get(0).getX() + "," + (int)this.points.get(0).getY() + ")" + "(" +(int) this.points.get(1).getX()
				+ "," +(int) this.points.get(1).getY() + ")" + "(" + (int)this.points.get(2).getX() + ","
				+ (int)this.points.get(2).getY() + ")" +
				"(" + (int)this.points.get(3).getX() + ","
				+ (int)this.points.get(3).getY() + ")" +
				")]Area=" + this.calculateArea() + "\n" + "Perimeter=" + this.calculatePerimeter();

	}
	
	@Override
	 public void calculatePoints() {
		 this.points.add(leftTop);
		 Point point= new Point((int) (leftTop.getX()+edge),(int)leftTop.getY());
		 this.points.add(point);
         point= new Point((int) (leftTop.getX()+edge),(int)leftTop.getY()+edge);
         this.points.add(point);
         point= new Point((int)(leftTop.getX()),(int)leftTop.getY()+edge);
         this.points.add(point);
		
	}



	
	
	
}
