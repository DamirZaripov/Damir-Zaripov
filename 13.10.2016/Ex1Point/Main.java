import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	static Scanner scanner = new Scanner(System.in); // System in - ввод с консоли 
	static Point point1 = new Point();  
	static Point point2 = new Point();
	static Distance distance = new Distance();
	static double result;
	
	public static void main(String[] args) throws FileNotFoundException {
		point1 = enterPoint();
		point2 = enterPoint();
		result = distance.result(point1, point2);
		System.out.println("Distance = " + result);
		
		point1 = enterPointFile(0);
		point2 = enterPointFile(2);
		result = distance.result(point1, point2);
		System.out.println("Distance = " + result);
	}
	
	public static Point enterPoint() { 
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		Point coordinates = new Point(x, y);
		return coordinates;
	}
	
	public static Point enterPointFile(int k) throws FileNotFoundException{
		int[] points = new int[4];
		File file = new File("C://Points", "Points.txt");
		Scanner sc = new Scanner(file).useDelimiter(",");
		String pointsStr = sc.nextLine();
		String newPointsStr = pointsStr.replaceAll(",", " ");
		Scanner scPoint = new Scanner(newPointsStr);
		for (int i = 0; i <= 3; i++) {
				points[i] = scPoint.nextInt();
			}
		Point newPoint = new Point(points[k], points[k+1]);
		return newPoint;
	}
	
}