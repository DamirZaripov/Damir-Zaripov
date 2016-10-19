import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Point {
	public double x1, y1;
	public double x2, y2;
	
	Point() throws FileNotFoundException {
		File fileWithPoint = new File("D://Ex1Point//Points.txt");
		Scanner sc = new Scanner(fileWithPoint);
		this.x1 = sc.nextDouble();
		this.y1 = sc.nextDouble();
		this.x2 = sc.nextDouble();
		this.y2 = sc.nextDouble();
	}
	
	public double getX1() {
		return x1;
	}
	
	public double getX2() {
		return x2;
	}
	
	public double getY1() {
		return y1;
	}
	
	public double getY2() {
		return y2;
	}
}