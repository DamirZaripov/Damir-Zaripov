public class Ex2 {
	
	public static void main(String[] args) {
		
	    int[] sum = new int[11];
		for (int i = 1; i < 11; i++) {
			
			for (int k = 0; k <= 10 - i; k++) {
				System.out.print(" ");
			}
			
			int[] array = new int[i]; 
			int size = array.length; 
			array[0] = 1; 
			array[size - 1] = 1; 
			
			for (int k = 1; k < size - 1; k++) {
				
				array[k] = sum [k-1];
			}
			for (int k = 0; k < size-1; k++) {
				
				sum[k] = array[k] + array[k+1]; 
			}
			
			for (int k : array) {
			
				System.out.print(k + " ");
				
			}
			
			System.out.println();
		}
	}
}