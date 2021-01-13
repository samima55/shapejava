package shape;


import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

//Draws simple shapes
public class Lab6DriverTemplate {
	
	public static void main(String[] args) {
		//TODO: Implement your own Shape class according to the Lab3 description
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		//GRAPHICS: The next line will be removed or commented out before submission to Moodle, we will provide
		//and talk about the DrawingTool class during lab hours to introduce graphics support
		 //DrawingTool window = new DrawingTool(shapes);
			
		Scanner scan = new Scanner(System.in);
		String userCommand = "";
				
		while (! userCommand.equalsIgnoreCase("exit")) {
			System.out.print("Enter the command: ");
			userCommand = scan.nextLine();

			String [] parameters = userCommand.split(" ");
			String command = parameters[0];
			
			if (command.equals("addR")) {
				//TODO: Read parameters and create a Rectangle object
				int pointX = Integer.parseInt(parameters[1]);
				int PointY = Integer.parseInt(parameters[2]);
				int height = Integer.parseInt(parameters[3]);
				int width = Integer.parseInt(parameters[4]);
				Rectangle tempRectangle = new Rectangle( new Point(pointX,PointY), height, width);
				//TODO: Add the object to the shapes list
				shapes.add(tempRectangle);
				//TODO: Print the object
				System.out.println(tempRectangle.toString());
			}
			
			else if (command.equals("addS")) {
				//TODO: Read parameters and create a Square object
				int pointX = Integer.parseInt(parameters[1]);
				int PointY = Integer.parseInt(parameters[2]);
				int edge = Integer.parseInt(parameters[3]);
				
				//TODO: Add the object to the shapes list
				Shape tempSquare = new Square( new Point(pointX,PointY), edge);
				  shapes.add(tempSquare);
				//TODO: Print the object	
				  System.out.println(tempSquare.toString());
			}
			else if (command.equals("addC")) {
				//TODO: Read parameters and create a Circle object
				int pointX = Integer.parseInt(parameters[1]);
				int PointY = Integer.parseInt(parameters[2]);
				int radius = Integer.parseInt(parameters[3]);
				
				//TODO: Add the object to the shapes list
				Shape tempcircle = new Circle(new Point(pointX,PointY), radius);
				 shapes.add(tempcircle);
				//TODO: Print the object
				 
				 System.out.println(tempcircle.toString());
			}
			else if (command.equals("move")) {
				//Read parameters
				int shapeNo = Integer.parseInt(parameters[1]);
				int x = Integer.parseInt(parameters[2]);
				int y = Integer.parseInt(parameters[3]);
				
				//TODO: Implement your own Movable interface according to the Lab4 example
				Movable sm = shapes.get(shapeNo-1);

				//TODO: Move the object by calling the move method				
				  sm.move(x, y);
				//TODO: Print the object
				System.out.println(sm.toString());
			}
			
			//GRAPHICS: The next line will be removed or commented out before submission to Moodle
			//window.repaint();
			
		}		
		scan.close();
		System.exit(0);
	}

}
