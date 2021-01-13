package shape;

import java.awt.Point;

public class Circle extends Shape{
        private int radius;
        
        
	    public Circle(Point lefttop, int radius) {
		super(lefttop);
		super.isCircular=true;
		this.radius=radius;
		calculatePoints();
		
	}
	
	

		@Override
		 public double calculateArea() {
		 double area=this.radius*this.radius*Math.PI;
			return  area;
		}


		@Override
		 public double calculatePerimeter() {
			  double perimeter=2*this.radius*Math.PI;
			return  perimeter;
		}



	
	@Override void calculatePoints() {
		this.points.add(leftTop);
		Point point = new Point((int)leftTop.getX()+2*this.radius,(int) leftTop.getY()+2*this.radius);
		this.points.add(point);
	}

	@Override
 	public String toString() {
		
		return "Circle[r=" + this.radius +"]Points[(" +
	 (int)this.points.get(0).getX() + "," + (int)this.points.get(0).getY() + ")" + "(" +
	   (int) this.points.get(1).getX()+ "," +(int) this.points.get(1).getY() + ")"+
	   ")]Area=" + this.calculateArea()+ "\n" + "Perimeter=" +  this.calculatePerimeter();
	 
		
	}
	

}
