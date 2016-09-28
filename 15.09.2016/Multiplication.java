public class Multiplication {
	
	 public static void main (String[] args) {
		int n = Integer.parseInt (args [0]); 
	    for (int k = 1; k != n + 1; k++) { 
			for (int i = 1; i != n+1; i++) {
				System.out.printf("%4d", i * k); // printf - делает отступ, "%4d" - на сколько
	
			}
			System.out.println();
		}
	}
}