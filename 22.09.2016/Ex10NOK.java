public class Ex10NOK {
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int a1 = a;
		int b1 = b;
		if ((a>0) && (b>0)) {
			
			while ((a != 0) && (b != 0)) {
			
				if (a>b) {
				
					a %= b;
				} else {
				
					b %= a;
				}
			
			}
			
			System.out.print("NOK = " + (a1*b1)/(a+b));
		
		} else {
			
			System.out.print("One of the numbers <=0 :( ");
		}
	}		
}