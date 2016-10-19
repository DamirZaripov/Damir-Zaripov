import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	static Scanner scanner = new Scanner(System.in); // System in - ввод с консоли 
	static Point point1 = new Point();  
	static Point point2 = new Point();
	static Distance distance = new Distance();
	static double result;
	
	public static void main(String[] args) {
		point1 = enterPoint();
		point2 = enterPoint();
		result = distance.result(point1, point2);
		System.out.println("Distance = " + result);
	}
	
	public static Point enterPoint() { 
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		Point coordinates = new Point(x, y);
		return coordinates;
	}
	
}