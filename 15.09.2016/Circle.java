public class Circle {
	
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int x0 = Integer.parseInt(args[2]);
		int y0 = Integer.parseInt(args[3]);
		int r = Integer.parseInt(args[4]);
		double D = Math.sqrt((x - x0) * (x - x0) + (y - y0) * (y - y0)); // по методу координат рассто€ние 
		D = Math.abs((int)D); // ћодуль
		if (D > r) {
			System.out.print("Out circle");
		} else {
			System.out.print("In circle");
		}
	}
	
}