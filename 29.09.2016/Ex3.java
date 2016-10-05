public class Ex3 {
	
	public static void main(String[] args) {
		
		int[] array = {10, 16, 22, 11, 34};
		int[] searchArray = {11, 34};
		int position = -1;
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] == searchArray[0]) {
				
				int coincidences = 0;
				for (int j = 1; j < searchArray.length; j++) {
					
					if (array[i + j] == searchArray[j]) {
						
						coincidences += 1;
					}
					else {
						
						break;
					}
				}
				if (coincidences == (searchArray.length - 1)) {
					
					position = i;
					break;
				}
			}
		}
		if (position != -1) {
			
			System.out.println("Search position = " + position);
		} else {
			System.out.println("Nooooo");
		}
	}
}