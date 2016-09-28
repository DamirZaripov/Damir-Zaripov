public class Cos {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int x = Integer.parseInt(args[1]);
		double cos = Math.cos(x); 
		for (int i = 1; i < n; i++) {
			cos = Math.cos(x + cos); 
		}
		System.out.print(cos);
	}
}