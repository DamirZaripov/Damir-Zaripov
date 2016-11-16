public abstract class Figure{

	public abstract double square();
	public abstract double perimetr();
	
	public String toString() {
		return 
		"Figure : " + nameFigure + "\n" + 
		"Square : " + square() + "\n" + 
		"Perimeter : " + perimetr() + "\n" + 
		"----------------------------" ;
	}
}