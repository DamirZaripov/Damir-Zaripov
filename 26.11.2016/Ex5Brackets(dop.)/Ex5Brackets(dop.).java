public class Ex5Brackets(dop.) {
	
	public static void main(String[] args) {
		String str = args[0];
		str = BracketsString(str);
		System.out.println(CheckBrackets(str, ""));
	}
	
	public static String BracketsString(String str) {
		String brackets = "";
		for (int i = 0; i < str.length(); i++) {
			if (((int)str.charAt(i) == 40) || ((int)str.charAt(i) == 41) || ((int)str.charAt(i) == 91) || ((int)str.charAt(i) == 93) || ((int)str.charAt(i) == 123) || ((int)str.charAt(i) == 125)) {
				brackets = brackets + str.charAt(i);
			}
		}
		return brackets;
	}
	
	public static boolean CheckBrackets(String str, String openBrackets) {
		if ((str.length() == 0) && (openBrackets == "")) {
			return true;
		}
		else if ((str.length() % 2 == 1) && (openBrackets == "")) {
			return false;
		}
		else if ((((int)str.charAt(0) == 41) || ((int)str.charAt(0) == 93) || ((int)str.charAt(0) == 123)) && (openBrackets == "")) {
			return false;
		}
		else if ((((int)str.charAt(0) == 40) || ((int)str.charAt(0) == 91) || ((int)str.charAt(0) == 123)) && (str.length() > 1)) {
			openBrackets = openBrackets + str.charAt(0);;
			str = str.substring(1);
			return CheckBrackets(str, openBrackets);
		}
		else if ((((int)str.charAt(0) == 41) && ((int)openBrackets.charAt(openBrackets.length() - 1) == 40)) || 
			(((int)str.charAt(0) == 93) && ((int)openBrackets.charAt(openBrackets.length() - 1) == 91)) || 
			(((int)str.charAt(0) == 125) && ((int)openBrackets.charAt(openBrackets.length() - 1) == 123))) {
			String openBracketsFake = "";
			int i = 0;
			while (i < openBrackets.length() - 1) {
				openBracketsFake = openBracketsFake + openBrackets.charAt(i);
				i++;
			}
			str = str.substring(1);
			return CheckBrackets(str, openBracketsFake);
		}	
		return false;
	}
}