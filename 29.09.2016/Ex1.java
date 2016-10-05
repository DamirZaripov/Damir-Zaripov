public class Ex1 {
	
	public static void main(String[] args) {
		
		int[] array = {2, 20, 10, 5, 3}; 
		boolean inspection = true; 
		
		while (inspection) {
			
			inspection = false; 
			for (int i = 0; i < (array.length-1); i++) {
				
				if (array[i] > array[i+1]) {
					
					int temporary;
					temporary = array[i];
					array[i] = array[i+1];
					array[i+1] = temporary; 
					inspection = true;
				}
			}
		}  

		for (int i = 0; i < (array.length); i++) {
			
			System.out.print(array[i] + " ");
		}
	}
}