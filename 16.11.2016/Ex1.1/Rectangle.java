public class Rectangle extends Figure {
	
	int a;
	int b;
	
	Rectangle(int a, int b) {
		nameFigure = "Rectangle";
		this.a = a;
		this.b = b;
	}
	
	public double square() {
		double squareFigure = a*b;
		return squareFigure;
	}
	
	public double perimetr() {
		double perimetrFigure = a+b;
		return perimetrFigure;
	}
}