public class Ex4Arifprog {
	
	public static void main(String[] args) {
		int a1 = Integer.parseInt (args[0]);
		int a2 = Integer.parseInt (args[1]);
		int k = Integer.parseInt (args[2]);
		k = a1 + (k-1)*(a2-a1);
		System.out.println (k);
	}
}