package lesson7;

import java.util.Scanner;

public class GeometricObjects {
	//no-args constructor
	public GeometricObjects(){
	}
	
	public double getArea(){
		return 0;
	}
	
	public double getPerimeter(){
		return 0;
	}
}

class Triangle extends GeometricObjects{
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	//no-args constructor
	public Triangle(){
	}
	
	//constructor
	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	//getters
	public double getSide1(){
		return side1;
	}
	public double getSide2(){
		return side2;
	}
	public double getSide3(){
		return side3;
	}
	
	//setters
	public void setSide1(double side1){
		this.side1 = side1;
	}
	public void setSide2(double side2){
		this.side2 = side1;
	}
	public void setSide3(double side3){
		this.side3 = side3;
	}
	
	//overriding getArea in superclass
	@Override
	public double getArea(){
		double s = getPerimeter() / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	
	//overriding getPerimeter in superclass
	@Override
	public double getPerimeter(){
		return side1 + side2 + side3;
	}
	
	@Override
	public String toString(){
		return "Area: " + String.format("%.5f", getArea()) + "\nPerimeter: " + String.format("%.2f", getPerimeter());
	}
}

class GeometricObjectsTest{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the values of the three sides, each on a separate line: ");
		double side1 = in.nextDouble();
		double side2 = in.nextDouble();
		double side3 = in.nextDouble();
		 
		in.close();
		
		Triangle t = new Triangle(side1, side2, side3);
		System.out.println(t);
	}
}