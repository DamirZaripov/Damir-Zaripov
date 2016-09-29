public class Ex6System210 {

	public static void main(String[] args) {

		int A = Integer.parseInt(args[0]);
		int k = Integer.parseInt(args[1]);
		int summa = 0;
		double r1 = 0;
		double r2 = 0;
		int oneNum;
		int coi = 0;

		if ( (A > 0) && (k >= 2) && (k <= 10)) {

			while (A != 0) {

				oneNum = A % k;

				if (oneNum > 0) {
					
					summa = summa + oneNum; 
					}

				r1 += oneNum * Math.pow(10.0 , (coi));
				coi = coi + 1;
				A = A / k;

			}

			coi = 0;

			while (summa != 0) {

				oneNum = summa % k;

				r2 += oneNum * Math.pow(10.0 , (coi));
				coi = coi + 1;
				summa = summa / k;

			}

			System.out.println("Count of digits in num is " + (int) r2);
        	System.out.print("Number in " + k + " system is " + (int) r1);

		} else {

			System.out.println("Please, write number >0 and 1<k<11");
		}

	}

}