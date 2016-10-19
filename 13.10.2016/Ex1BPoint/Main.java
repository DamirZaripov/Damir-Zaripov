import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException{
		Point point = new Point();
		DistanceCalculatore distanceCalculatore = new DistanceCalculatore(point.getX1(), point.getY1(), point.getX2(), point.getY2());
		System.out.println(distanceCalculatore.getDistance());
	}
}