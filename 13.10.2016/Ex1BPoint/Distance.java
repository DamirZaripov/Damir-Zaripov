public class DistanceCalculatore {
	public double x1, x2, y1, y2;
	public double distance;
	
	DistanceCalculatore(double x1, double y1, double x2, double y2) {
		this.distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}
	
	public double getDistance() {
		return distance;
	}
}