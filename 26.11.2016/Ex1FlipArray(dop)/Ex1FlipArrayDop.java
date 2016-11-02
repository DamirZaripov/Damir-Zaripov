import java.util.Arrays;
import java.util.Random;
import java.util.List;
import java.util.Collections;

public class Ex1FlipArrayDop {
	
	public static void main(String[] args) {
		
		String myArrayOutput;
		Integer[] myArray = new Integer[5];
		Random random = new Random();
		
		// ��������� ������ ���������� ������� 
		for (int i = 0; i < 5; i++) {
			myArray[i] = random.nextInt();
		}
		
		// ������� ����������� ������
		myArrayOutput = Arrays.toString(myArray);
		System.out.println(myArrayOutput);
		
		// �������������� ������ 
		List arr = Arrays.asList(myArray);
		Collections.reverse(arr);
		myArray = (Integer[]) arr.toArray(new Integer[myArray.length]);
		myArrayOutput = Arrays.toString(myArray);
		// ������� ���������� ������ 
		System.out.println(myArrayOutput);
	}
}