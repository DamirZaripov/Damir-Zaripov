import java.util.Arrays;
import java.util.Random;

public class Ex1FlipArray {
	
	public static void main(String[] args) {
		
		int[] myArray = new int[5];
		Random random = new Random();
		
		// Заполняем массив рандомными числами 
		for (int i = 0; i < 5; i++) {
			myArray[i] = random.nextInt();
		}
		
		// Выводим изначальный массив
		System.out.println(Arrays.toString(myArray));
		
		// Переворачиваем массив 
		for (int i = 0; i < myArray.length / 2; i++) {
			int a = myArray[i];
			myArray[i] = myArray[myArray.length - i - 1];
			myArray[myArray.length - i - 1] = a;
		}
		
		// Выводим измененный массив 
		System.out.println(Arrays.toString(myArray));
	}
}