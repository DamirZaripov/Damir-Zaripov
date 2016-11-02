import java.util.Arrays;
import java.util.Random;

public class Ex3ArrayNumbers {
	
	public static void main(String[] args) {
		
		String myArrayOutput;
		int[] myArray = new int[4];
		Random random = new Random();
		
		// Заполняем массив произведенями двух предыдущих членов
		myArray[0] = 2 + random.nextInt(5);
		for (int i = 1; i < myArray.length; i++) {
			myArray[i] = myArray[i-1]*myArray[i-1];
		}
		
		// Выводим массив 
		myArrayOutput = Arrays.toString(myArray);
		System.out.println(myArrayOutput);
 	}
}