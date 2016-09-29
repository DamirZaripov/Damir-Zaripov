public class Ex5Binarny {
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int amound = 0; 
		int count = 0;
		
		if (a >= 0) {
			
			int n = 0; 
			while (a != 0) {
				
				n = n * 10 + a % 2;
				if (a % 2 == 1) {
					
					count += 1;
				}
				
				a = a / 2;
				amound =  amound + 1;
				
			}
			for (int i = 0; i < amound; i++) {
				
				a = a * 10 + n % 10;
				n = n / 10;			
			}
			
			System.out.println("Number is " + a + " and it has " + count + " ones");
		} else {
			System.out.println("Please, write number >= 0");
		}
	}
}


