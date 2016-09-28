public class Ex2Factorial {
	
	public static void main (String[] args) {
		int n = Integer.parseInt (args[0]);
		int res = 1; 
		
		if (n<0) {
			System.out.println ("Factorial no");
		}
		if (n==0) { // == - сравнивает равно или нет
			System.out.println ("Factorial = 1");
		}
		if (n>0) {
			for (int i = 1; i < n; i++) {
				res = res * (i+1);
			}
			System.out.println ("Factorial = " + res);
		}
	}
}