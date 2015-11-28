package lesson7;

public class GeometricShapes {
	protected double side = 1.0;
//	protected double SA;
//	protected double Volume;
	
	public GeometricShapes(){
		this.side = 1.0;
//		this.SA = ;
//		this.volume = 
	}
	
	public GeometricShapes(double side/*, double SA, double Volume*/){
		this.side = side;
//		this.SA = SA;
//		this.Volume = Volume;
	}
	
	public void setside(double side){
		this.side = side;
	}
//	public void setSA(double SA){
//		this.SA = SA;
//	}
//	public void setVolume(double Volume){
//		this.Volume = Volume;
//	}
	
		return this.side;
	}
public double getside(){
//	public double getSA(){
//		return this.SA;
//	}
//	public double getVolume(){
//		return this.Volume;
//	}
}

class Sphere extends GeometricShapes{
	protected double SA;
	protected double Volume;
	
	public Sphere(){
		super(1.0);
	}
	
	public Sphere(double side){
		super();
		findVol();
		findSA();
	}
	
	private void findVol(){
		this.Volume = (4/3)*Math.PI*side*side;
	}
	private void findSA(){
		this.SA = 4*Math.PI*side*side;
	}
	
	public double getVol(){
		return Volume;
	}
	public double getSA(){
		return SA;
	}
	
}

class Cube extends GeometricShapes{
	
}

class GeometricShapesTester{
	
}