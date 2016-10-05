public class Ex6 {

	public static void main(String[] args) {
		String str = args[0];
		boolean flag = true;
		for (int i = 0; i < (str.length() / 2); i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("This is palindrome.");
		}
		else {
			System.out.println("This isn't palindrome.");
		}
	}
}