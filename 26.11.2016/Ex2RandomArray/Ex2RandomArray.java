import java.util.Arrays;

public class Ex2RandomArray {
	
	public static void main(String[] args) {
		
		String myArrayOutput;
		long[] myArray = new long[10];
		
		myArray[0] = 1;
		myArray[1] = 2;
		
		// Заполняем массив 
		for (int i = 2; i < myArray.length; i++) {
			myArray[i] = myArray[i-1] * myArray[i-2];
		}
		
		// Выводим массив 
		myArrayOutput = Arrays.toString(myArray);
		System.out.println(myArrayOutput);
	}
}