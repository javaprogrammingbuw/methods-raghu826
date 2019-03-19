import java.util.Scanner;

public class Circle {
	
	static double radius;
	
	public  double diameter(double radius) {
		double dia = 2 * radius;
		return dia;
	     }
	public double circumference(double radius) {
		
		double circ = 2*3.14*radius;
		return circ;
	     }
	public  double area(double radius) {
	    double Area = 3.14 * radius * radius;
		return Area;
     }	
	
	public static void main (String[] args) {
		 
		Scanner scan = new Scanner(System.in);
    
		int radius = scan.nextInt();
		
		System.out.println("Enter the radius:" + radius);
		
		Circle d = new Circle();
		
		Circle c = new Circle();
		Circle a = new Circle();
		
		//d.diameter(radius);
		//c.circumference(radius);
		//a.area(radius);
		
		System.out.println("diameter is  " + d.diameter(radius));
		System.out.println("circumference is  " + c.circumference(radius));
		System.out.println("area is  " + a.area(radius));
		scan.close();
	}
	//todo: add some methods to compute a circle's diameter, circumference and area.
	//print some outputs to confirm you methods are working right.
}
