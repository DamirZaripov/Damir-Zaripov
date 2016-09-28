public class Ex11NOD {
	
	public static void main(String[] args) {
		
		double a = Integer.parseInt(args[0]);
		double b = Integer.parseInt(args[1]);
		double a1 = a;
		double b1 = b;
		double nod = 0;
        double nod1 = 0;
		
		if ((a>0) && (b>0)) {
			
			long t1 = System.nanoTime();
			while ((a != 0) && (b != 0)) {
				
				if (a>b) {
					
					a %= b;
				} else {
					
					b %= a;
				}
			}
			
			nod = a + b;
			System.out.println("Result by Evklid: " + nod);
			long t2 = System.nanoTime();
			if (a1 > b1) {
				
				double d = b1;
				for (; d > 0; d--) {
					
					if ((a1 % d == 0) && (b1 % d == 0)) {
						
						nod1 = d;
						break;
					}
				}
			}
			else {
				
				double d = a1;
				for (; d > 0; d--) {
					
					if ((a1 % d == 0) && (b1 % d == 0)) {
						
						nod1 = d;
						break;
					}
				}
			}
			System.out.println("Result by Check everything: " + nod1);
			long t3 = System.nanoTime();
			long te = t2 - t1;
			long tb = t3 - t2;
			if (te < tb) {
				
				System.out.println("Evklid( " + te + ") faster Check everything (" + tb + ")");
			}
			else {
				
				System.out.println("Check everything (" + tb + ") faster Evklid (" + te + ")");
			}
		} else {
			
			System.out.print("One of the numbers <=0 :( ");
		}
	}
}
