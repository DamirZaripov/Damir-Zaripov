public class Ex3 {
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		double sum = 0;
		double fact1 = 0;
		double fact2 = 0;
		double res1 = 1;
		double res2 = 1;		
		if (n>0) {
			
			for (int m = 1; m <= n; m++) {
				
				fact1 = m - 1;
				for (int i = 1; i < fact1; i++) {
					
					res1 = res1*(i+1);
					
				}
				
				fact2 = 2*m;
				for (int i = 1; i < fact2; i++) {
					
					res2 = res2*(i+1);
					
				}
				
				sum = sum + (res1*res1/res2);
				res1 = 1;
				res2 = 1;
			}
			
			System.out.println (sum);
		} 
		
		else {
			
			System.out.println ("Do you really think that " + n + "> 0 ? :) ");
		}
		
	}
	
}