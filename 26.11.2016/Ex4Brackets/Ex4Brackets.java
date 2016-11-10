public class Ex4Brackets {
	
	public static void main(String[] args) {
		String str = args[0];
		str = BracketsString(str);
		System.out.println(CheckBrackets(str, 0));
	}
	
	public static String BracketsString(String str) {
		String brackets = "";
		for (int i = 0; i < str.length(); i++) {
			if (((int)str.charAt(i) == 40) || ((int)str.charAt(i) == 41)) {
				brackets = brackets + str.charAt(i);
			}
		}
		return brackets;
	}
	
	public static boolean CheckBrackets(String str, int openBrackets) {
		if ((str.length() == 0) && (openBrackets == 0)) {
			return true;
		}
		else if ((str.length() % 2 == 1) && (openBrackets == 0)) {
			return false;
		}
		else if (((int)str.charAt(0) == 41) && (openBrackets == 0))  {
			return false;
		}
		else if (((int)str.charAt(0) == 40) && (str.length() > 1)) {
			openBrackets += 1;
			str = str.substring(1);
			return CheckBrackets(str, openBrackets);
		}
		else if ((int)str.charAt(0) == 41) {
			openBrackets -= 1;
			str = str.substring(1);
			return CheckBrackets(str, openBrackets);
		}	
		return false;
	}
}