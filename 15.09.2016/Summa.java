public class Summa {
	
	public static void main(String[] args) {
		double S = 0;
		double d = 1;
		int k = 1;
		int n = Integer.parseInt(args[0]);
		for (int i = 1; i <= n; i++) {
			S = S + k / (d*d) ;
			d = d + 2 ; 
			k *= -1 ; // определяет знак 
		}
		System.out.print(S);
	}
}