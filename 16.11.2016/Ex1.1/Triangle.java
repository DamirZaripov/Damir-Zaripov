public class Triangle extends Figure {
	
	int a;
	int b;
	int c;
	String nameFigure;
	
	Triangle(int a, int b, int c) {
		nameFigure = "Triangle";
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double square() {
		double squareFigure = a*b*c;
		return squareFigure;
	}
	
	public double perimetr() {
		double perimetrFigure = a+b+c;
		return perimetrFigure;
	}
}