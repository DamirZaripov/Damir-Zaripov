public class Distance {
	
	public static double result(Point point1, Point point2) {
		int x1 = point1.getX();
		int y1 = point1.getY();
		int x2 = point2.getX();
		int y2 = point2.getY();
		double result = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		return result;
	}
}