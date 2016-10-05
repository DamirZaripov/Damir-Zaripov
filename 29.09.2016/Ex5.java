public class Ex5 {
	
	public static void main(String[] args) {
		String str = args[0];
		String strng = args[1];
		int position = -1;
		
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == strng.charAt(0)) {
				
				int matches = 0;
				for (int j = 1; j < strng.length(); j++) {
					
					if (str.charAt(i + j) == strng.charAt(j)) {
						
						matches += 1;
					}
					else {
						
						break;
					}
				}
				if (matches == (strng.length() - 1)) {
					
					position = i;
					break;
				}
			}
		}
		if (position != -1) {
			
			System.out.println("Search position = " + position);
		}
		else {
			
			System.out.println("Nooooo");
		}
	}
}